package io.github.mxkooo.flashcardapp.flashcards.groups;

import io.github.mxkooo.flashcardapp.flashcards.Flashcard;
import io.github.mxkooo.flashcardapp.flashcards.FlashcardMapper;
import io.github.mxkooo.flashcardapp.flashcards.FlashcardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FlashcardGroupServiceImpl implements FlashcardGroupService{
    private FlashcardGroupRepository flashcardGroupRepository;
    private FlashcardRepository flashcardRepository;

    public FlashcardGroup createFlashcardGroup(FlashcardGroupDTO dto) {

        return this.flashcardGroupRepository.save(
                FlashcardGroup.builder()
                        .groupName(dto.groupName())
                        .groupDescription(dto.groupDescription())
                        .flashcards(dto.flashcards())
                        .build()
        );
    }

    public FlashcardGroup addFlashcardToGroup(long groupId, long flashcardId){
        FlashcardGroup group = flashcardGroupRepository.findById(groupId)
                .orElseThrow();
        Flashcard flashcard = flashcardRepository.findById(flashcardId)
                        .orElseThrow();

        group.getFlashcards().add(flashcard);
        return group;
    }
}
