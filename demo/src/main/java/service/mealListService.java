package service;

import java.util.List;
import dto.mealListDto;


public interface mealListService {

	mealListDto addMeal(mealListDto meal);

	List<mealListDto> listMeals();




}

