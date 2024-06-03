package io.github.mxkooo.flashcardapp.flashcards.groups;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(RoutesFlashcardGroup.ROOT + RoutesFlashcardGroup.GROUPS)
public class FlashcardGroupController {
    private FlashcardGroupService flashcardGroupService;

    @PostMapping(RoutesFlashcardGroup.POST)
    public FlashcardGroup createFlashcardGroup(@RequestBody @Validated FlashcardGroupDTO dto){
        return flashcardGroupService.createFlashcardGroup(dto);
    }
    @PostMapping(RoutesFlashcardGroup.POST + "/{groupId}")
    public FlashcardGroup addItemToGroup(@PathVariable long groupId, @PathVariable long flashcardId){
        return flashcardGroupService.addFlashcardToGroup(groupId, flashcardId);
    }

}
