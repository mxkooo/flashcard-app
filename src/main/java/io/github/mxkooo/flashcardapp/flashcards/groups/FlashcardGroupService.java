package io.github.mxkooo.flashcardapp.flashcards.groups;

public interface FlashcardGroupService {
    public FlashcardGroup createFlashcardGroup(FlashcardGroupDTO dto);
    public FlashcardGroup addFlashcardToGroup(long groupId, long flashcardId);
}
