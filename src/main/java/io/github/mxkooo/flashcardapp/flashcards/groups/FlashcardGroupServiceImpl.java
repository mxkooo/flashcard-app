package io.github.mxkooo.flashcardapp.flashcards.groups;

import io.github.mxkooo.flashcardapp.flashcards.FlashcardMapper;
import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FlashcardGroupServiceImpl implements FlashcardGroupService{
    private FlashcardGroupRepository flashcardGroupRepository;

    public FlashcardGroup createFlashcardGroup(FlashcardGroupDTO dto) {

        return this.flashcardGroupRepository.save(
                FlashcardGroup.builder()
                        .groupName(dto.groupName())
                        .groupDescription(dto.groupDescription())
                        .flashcards(dto.flashcards())
                        .build()
        );
    }

    public FlashcardGroup addFlashcardToGroup(long groupId, CreateFlashcardDTO dto){
        FlashcardGroup group = flashcardGroupRepository.findById(groupId)
                .orElseThrow();
        group.getFlashcards().add(FlashcardMapper.mapToEntity(dto));
        return group;
    }
}
