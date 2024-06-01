package io.github.mxkooo.flashcardapp.flashcards;

import io.github.mxkooo.flashcardapp.flashcards.dto.CreateFlashcardDTO;
import io.github.mxkooo.flashcardapp.flashcards.dto.UpdateFlashcardDTO;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(RoutesFlashcard.ROOT)
public class FlashcardController {
    private FlashcardService flashcardService;

    @GetMapping("/{flashcardId}" + RoutesFlashcard.GET)
    public Flashcard getFlashcardById(@PathVariable long flashcardId){
        return flashcardService.getFlashcardById(flashcardId);
    }
    @GetMapping("/add" + RoutesFlashcard.GET)
    public List<Flashcard> getAllFlashcards(){
        return flashcardService.getAllFlashcards();
    }
    @PostMapping(RoutesFlashcard.POST)
    public Flashcard createFlashcard(@RequestBody @Validated CreateFlashcardDTO dto){
        return flashcardService.createFlashcard(dto);
    }
    @PutMapping("/{flashcardId}" + RoutesFlashcard.PUT)
    public Flashcard updateFLashcard(@RequestBody @Validated UpdateFlashcardDTO dto, @PathVariable long flashcardId){
        return flashcardService.updateFLashcard(dto, flashcardId);
    }
    @DeleteMapping("/{flashcardId}" + RoutesFlashcard.DELETE)
    public void deleteFlashcard(@PathVariable long flashcardId){
        flashcardService.deleteFlashcard(flashcardId);
    }
}
