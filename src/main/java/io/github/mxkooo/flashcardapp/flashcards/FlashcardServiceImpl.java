package io.github.mxkooo.flashcardapp.flashcards;

import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;
import io.github.mxkooo.flashcardapp.flashcards.dto.UpdateFlashcardDTO;
import io.github.mxkooo.flashcardapp.flashcards.errors.FlashcardNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlashcardServiceImpl implements FlashcardService{
    private final FlashcardRepository flashcardRepository;


    @Override
    public Flashcard createFlashcard(CreateFlashcardDTO dto) {
        return this.flashcardRepository.save(
                Flashcard.builder()
                        .frontSide(dto.frontSide())
                        .backSide(dto.backSide())
                        .build()
        );
    }

    @Override
    @Transactional
    public Flashcard updateFLashcard(UpdateFlashcardDTO dto, long flashcardId) {
        var flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new FlashcardNotFoundException(flashcardId));
        if(!dto.frontSide().equals(flashcard.getFrontSide()) || !dto.frontSide().isBlank()){
            flashcard.setFrontSide(dto.frontSide());
        }
        if(!dto.backSide().equals(flashcard.getBackSide()) || !dto.backSide().isBlank()){
            flashcard.setBackSide(dto.backSide());
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
