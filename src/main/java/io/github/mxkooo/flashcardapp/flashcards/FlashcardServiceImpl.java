package io.github.mxkooo.flashcardapp.flashcards;

import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;
import io.github.mxkooo.flashcardapp.flashcards.dto.UpdateFlashcardDTO;
import io.github.mxkooo.flashcardapp.flashcards.errors.FlashcardNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashcardServiceImpl implements FlashcardService{
    private final FlashcardRepository flashcardRepository;

    public FlashcardServiceImpl(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    @Override
    public Flashcard createFlashcard(CreateFlashcardDTO dto) {
        return this.flashcardRepository.save(
                Flashcard.builder()
                        .frontSide(dto.getFrontSide())
                        .backSide(dto.getBackSide())
                        .build()
        );
    }

    @Override
    public Flashcard updateFLashcard(UpdateFlashcardDTO dto, long flashcardId) {
        var flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new FlashcardNotFoundException(flashcardId));
        if(!dto.getFrontSide().equals(flashcard.getFrontSide()) || !dto.getFrontSide().isBlank()){
            flashcard.setFrontSide(dto.getFrontSide());
        }
        if(!dto.getBackSide().equals(flashcard.getBackSide()) || !dto.getBackSide().isBlank()){
            flashcard.setBackSide(dto.getBackSide());
        }
        return this.flashcardRepository.save(flashcard);
    }

    @Override
    public void deleteFlashcard(long flashcardId) {
         if(this.flashcardRepository.existsById(flashcardId)){
             this.flashcardRepository.deleteById(flashcardId);
         }else{
             throw new FlashcardNotFoundException(flashcardId);
         }
    }

    @Override
    public Flashcard getFlashcardById(long flashcardId) {
        return this.flashcardRepository.findById(flashcardId).orElseThrow(() -> new FlashcardNotFoundException(flashcardId));
    }

    @Override
    public List<Flashcard> getAllFlashcards() {
        return this.flashcardRepository.findAll();
    }
}
