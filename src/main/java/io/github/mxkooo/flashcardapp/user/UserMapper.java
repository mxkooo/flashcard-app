package io.github.mxkooo.flashcardapp.user;

import io.github.mxkooo.flashcardapp.flashcards.Flashcard;
import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;
import io.github.mxkooo.flashcardapp.user.dto.UserDTO;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UserMapper {
    public static User mapToEntity(UserDTO userDTO){
        Set<Flashcard> flashcards = Optional.ofNullable(userDTO.flashcards())
                .orElse(Collections.emptySet())
                .stream()
                .map(dto -> new Flashcard(
                        dto.id(),
                        dto.frontSide(),
                        dto.backSide(),
                        null,
                        null))
                .collect(Collectors.toSet());

        return User.builder()
                .id(userDTO.id())
                .nickname(userDTO.nickname())
                .flashcards(flashcards)
                .build();
    }

    public static UserDTO mapToDTO(User user){
        Set<CreateFlashcardDTO> flashcardDTOS = Optional.ofNullable(user.getFlashcards())
                .orElse(Collections.emptySet())
                .stream()
                .map(dto -> new CreateFlashcardDTO(
                        dto.getId(),
                        dto.getFrontSide(),
                        dto.getBackSide(),
                        null,
                        null))
                .collect(Collectors.toSet());

        return UserDTO.builder()
                .id(user.getId())
                .nickname(user.getNickname())
                .flashcards(flashcardDTOS)
                .build();
    }
}
