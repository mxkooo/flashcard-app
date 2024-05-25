package io.github.mxkooo.flashcardapp.flashcards.dto;

import lombok.Builder;

@Builder
public record CreateFlashcardDTO (String frontSide, String backSide){
}
