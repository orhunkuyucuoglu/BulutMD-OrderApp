package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dto.mealListDto;
import service.mealListService;

@RestController
@RequestMapping("/meals")
public class mealListController {
	@Autowired
	mealListService mealservice;
	
	@PostMapping("/add")
	public ResponseEntity<mealListDto> addMeal(@RequestBody mealListDto meal){
		mealListDto result=mealservice.addMeal(meal);
		return ResponseEntity.ok(result);
		
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<mealListDto>> listMeals(){
		List<mealListDto> result=mealservice.listMeals();
		return ResponseEntity.ok(result);
		
	}
}
