package io.github.mxkooo.flashcardapp.flashcards.dto;

import lombok.Builder;

@Builder
public record UpdateFlashcardDTO(
        long id,
        String frontSide,
        String backSide) {
}
