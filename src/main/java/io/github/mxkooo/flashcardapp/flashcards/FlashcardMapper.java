package io.github.mxkooo.flashcardapp.flashcards;

import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;

public class FlashcardMapper {
    public static CreateFlashcardDTO mapToDTO(Flashcard flashcard){
        return CreateFlashcardDTO.builder()
                .id(flashcard.getId())
                .frontSide(flashcard.getFrontSide())
                .backSide(flashcard.getBackSide())
                .build();
    }
    public static Flashcard mapToEntity(CreateFlashcardDTO flashcardDTO){
        return Flashcard.builder()
                .id(flashcardDTO.id())
                .frontSide(flashcardDTO.frontSide())
                .backSide(flashcardDTO.backSide())
                .build();
    }
}
