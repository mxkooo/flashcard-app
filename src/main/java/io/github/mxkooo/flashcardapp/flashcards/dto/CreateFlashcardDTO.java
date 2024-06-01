package io.github.mxkooo.flashcardapp.flashcards.dto;

import lombok.Builder;

@Builder
public record CreateFlashcardDTO (
        long id,
        String frontSide,
        String backSide){
}
