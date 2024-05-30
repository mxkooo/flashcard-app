package io.github.mxkooo.flashcardapp.flashcards;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(RoutesFlashcard.ROOT)
public class FlashcardController {
    private FlashcardService flashcardService;

}
