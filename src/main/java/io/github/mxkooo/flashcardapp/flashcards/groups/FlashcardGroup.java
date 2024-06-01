package io.github.mxkooo.flashcardapp.flashcards.groups;

import io.github.mxkooo.flashcardapp.flashcards.Flashcard;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Table(name = "FLASHCARD_GROUP")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlashcardGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String groupName;

    private String groupDescription;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Set<Flashcard> flashcards;
}
