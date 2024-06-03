package io.github.mxkooo.flashcardapp.flashcards.groups;

import io.github.mxkooo.flashcardapp.flashcards.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardGroupRepository extends JpaRepository<FlashcardGroup, Long> {
}
