package io.github.mxkooo.flashcardapp.flashcards.dto;

import lombok.Builder;

@Builder
public record UpdateFlashcardDTO(String frontSide, String backSide) {
}
