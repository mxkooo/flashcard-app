package io.github.mxkooo.flashcardapp.flashcards.groups;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(RoutesFlashcardGroup.ROOT + RoutesFlashcardGroup.GROUPS)
public class FlashcardGroupController {
    private FlashcardGroupService flashcardGroupService;
}
