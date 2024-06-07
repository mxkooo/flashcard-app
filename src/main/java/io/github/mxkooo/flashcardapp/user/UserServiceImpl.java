package io.github.mxkooo.flashcardapp.user;

import io.github.mxkooo.flashcardapp.user.dto.UserDTO;
import io.github.mxkooo.flashcardapp.user.errors.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO){
        User user = new User();
        user.setNickname(userDTO.nickname());
        return UserMapper.mapToDTO(userRepository.save(user));
    }

    public UserDTO updateUser(Long userId, UserDTO toUpdate) {
        User user = getUser(userId);
        user.setId(userId);
        user.setNickname(toUpdate.nickname());

        return UserMapper.mapToDTO(user);
    }
    public User getUser(Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
    }
    public void deleteById(Long userId) throws Exception{
        if (!userRepository.existsById(userId))
            throw new Exception("User doesn't exist");
        userRepository.deleteById(userId);
    }
    public List<UserDTO> getAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserMapper::mapToDTO)
                .toList();
    }
    public UserDTO findUserById(Long userId){
        User user = userRepository.findById(userId).orElseThrow();

        return (UserMapper.mapToDTO(user));
    }
}
