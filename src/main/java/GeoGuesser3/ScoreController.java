package GeoGuesser3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ScoreController {

    @Autowired
    private ScoreRepository scoreRepository;

    @PostMapping("/postScore")
    public String postMethod(@RequestParam int number) {
        Score score = new Score();
        score.setScore(number);
        scoreRepository.save(score);
        return "Score saved successfully";
    }
    
    @GetMapping("/getAllScores")
    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }
}
