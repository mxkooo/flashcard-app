package io.github.mxkooo.flashcardapp.user;

import io.github.mxkooo.flashcardapp.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(RoutesUser.ROOT)
public class UserController {
    private UserService userService;
    @PostMapping(RoutesUser.POST)
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

    @PutMapping(RoutesUser.UPDATE + "/{userId}")
    public UserDTO updateUser(@PathVariable Long userId, @RequestBody UserDTO toUpdate){
        return userService.updateUser(userId, toUpdate);
    }

    @GetMapping(RoutesUser.GET + "/all")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping(RoutesUser.GET + "/{userId}")
    public UserDTO findUserById(@PathVariable Long userId){
        return userService.findUserById(userId);
    }

    @DeleteMapping(RoutesUser.DELETE + "/{userId}")
    public void deleteById(@PathVariable Long userId) throws Exception{
        userService.deleteById(userId);
    }
}
