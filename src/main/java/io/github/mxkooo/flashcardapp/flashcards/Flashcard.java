package io.github.mxkooo.flashcardapp.flashcards;

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

}
