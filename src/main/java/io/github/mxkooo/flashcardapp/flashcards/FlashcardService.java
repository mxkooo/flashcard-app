package io.github.mxkooo.flashcardapp.flashcards;

import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;
import io.github.mxkooo.flashcardapp.flashcards.dto.UpdateFlashcardDTO;
import java.util.List;

public interface FlashcardService {
    Flashcard createFlashcard(CreateFlashcardDTO dto);
    Flashcard updateFLashcard(UpdateFlashcardDTO dto, long flashcardId);
    void deleteFlashcard(long flashcardId);
    Flashcard getFlashcardById(long flashcardId);
    List<Flashcard> getAllFlashcards();
}
