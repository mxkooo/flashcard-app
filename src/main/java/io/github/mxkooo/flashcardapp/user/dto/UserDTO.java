package io.github.mxkooo.flashcardapp.user.dto;

import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;
import lombok.Builder;

import java.util.Set;

@Builder
public record UserDTO(
        long id,
        String nickname,
        Set<CreateFlashcardDTO> flashcards
) {
}
