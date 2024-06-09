package io.github.mxkooo.flashcardapp.user;

import io.github.mxkooo.flashcardapp.user.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(Long userId, UserDTO toUpdate);
    User getUser(Long userId);
    void deleteById(Long userId) throws Exception;
    List<UserDTO> getAllUsers();
    UserDTO findUserById(Long userId);
}
