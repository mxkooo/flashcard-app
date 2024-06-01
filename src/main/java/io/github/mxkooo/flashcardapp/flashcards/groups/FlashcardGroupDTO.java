package io.github.mxkooo.flashcardapp.flashcards.groups;

import io.github.mxkooo.flashcardapp.flashcards.Flashcard;
import lombok.Builder;

import java.util.Set;
@Builder
public record FlashcardGroupDTO(
        long id,
        String groupName,
        String groupDescription,
        Set<Flashcard> flashcards
) {
}
