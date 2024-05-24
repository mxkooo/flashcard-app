package io.github.mxkooo.flashcardapp.flashcards.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class CreateFlashcardDTO {
    private String frontSide;
    private String backSide;
}
