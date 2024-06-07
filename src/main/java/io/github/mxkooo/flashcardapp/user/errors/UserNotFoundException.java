package io.github.mxkooo.flashcardapp.user.errors;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(long id) {
        super("User with id: " + id + " not found");
    }
}
