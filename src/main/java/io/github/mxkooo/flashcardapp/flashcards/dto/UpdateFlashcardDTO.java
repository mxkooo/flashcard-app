package io.github.mxkooo.flashcardapp.flashcards.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class UpdateFlashcardDTO {
    private String frontSide;
    private String backSide;
}
