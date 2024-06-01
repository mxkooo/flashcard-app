package io.github.mxkooo.flashcardapp.flashcards.groups;

import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;

public interface FlashcardGroupService {
    public FlashcardGroup createFlashcardGroup(FlashcardGroupDTO dto);
    public FlashcardGroup addFlashcardToGroup(long groupId, CreateFlashcardDTO dto);
}
