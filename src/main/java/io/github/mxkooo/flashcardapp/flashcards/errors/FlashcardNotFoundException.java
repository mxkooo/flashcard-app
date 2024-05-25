package io.github.mxkooo.flashcardapp.flashcards.errors;

public class FlashcardNotFoundException extends RuntimeException{
    public FlashcardNotFoundException(long id) {
        super("Flashcard with id: " + id + " not found");
    }
}
