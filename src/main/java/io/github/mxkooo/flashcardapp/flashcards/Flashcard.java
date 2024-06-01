package io.github.mxkooo.flashcardapp.flashcards;

import io.github.mxkooo.flashcardapp.flashcards.groups.FlashcardGroup;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "FLASHCARD")
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String frontSide;

    private String backSide;

    @ManyToOne
    @JoinColumn(name = "flashcard_group_id")
    private FlashcardGroup flashcardGroup;
}
