package io.github.mxkooo.flashcardapp.user;

import io.github.mxkooo.flashcardapp.flashcards.Flashcard;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "USER")
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nickname;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Flashcard> flashcards = new HashSet<>();
}
