package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dto.YemeklerDto;
import service.YemeklerService;

@RestController
@RequestMapping("/yemekler")
public class YemeklerController {
	@Autowired
	YemeklerService yemekservice;
	
	@PostMapping("/add")
	public ResponseEntity<YemeklerDto> addMeal(@RequestBody YemeklerDto yemek){
		YemeklerDto result=yemekservice.addMeal(yemek);
		return ResponseEntity.ok(result);
		
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<YemeklerDto>> listMeals(){
		List<YemeklerDto> result=yemekservice.listMeals();
		return ResponseEntity.ok(result);
		
	}
}
