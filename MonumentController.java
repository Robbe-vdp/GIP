package GeoGuesser3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonumentController {
    @Autowired
    private MonumentRepository monumentRepository;

    @RequestMapping("/api/monuments")
    public List<Monument> getAllMonuments() {
    	List<Monument> monuments =  monumentRepository.findAll();
    	for (Monument m : monuments) {
    		System.out.println(m.getNaam());
    	}
    	return monuments;
    }
}
