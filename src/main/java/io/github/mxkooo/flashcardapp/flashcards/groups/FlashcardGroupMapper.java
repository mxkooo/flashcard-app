package io.github.mxkooo.flashcardapp.flashcards.groups;

public class FlashcardGroupMapper {
    public static FlashcardGroupDTO mapToDTO(FlashcardGroup flashcardGroup){
        return FlashcardGroupDTO.builder()
                .id(flashcardGroup.getId())
                .groupName(flashcardGroup.getGroupName())
                .groupDescription(flashcardGroup.getGroupDescription())
                .flashcards(flashcardGroup.getFlashcards())
                .build();
    }
    public static FlashcardGroup mapToEntity(FlashcardGroupDTO flashcardGroupDTO){
        return FlashcardGroup.builder()
                .id(flashcardGroupDTO.id())
                .groupName(flashcardGroupDTO.groupName())
                .groupDescription(flashcardGroupDTO.groupDescription())
                .flashcards(flashcardGroupDTO.flashcards())
                .build();
    }
}
