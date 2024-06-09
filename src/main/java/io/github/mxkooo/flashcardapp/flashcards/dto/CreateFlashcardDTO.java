package io.github.mxkooo.flashcardapp.flashcards.dto;

import io.github.mxkooo.flashcardapp.user.dto.UserDTO;
import lombok.Builder;

import java.util.Set;

@Builder
public record CreateFlashcardDTO (
        long id,
        String frontSide,
        String backSide,
        Set<CreateFlashcardDTO> flashcards,
        UserDTO userDTO){
}
