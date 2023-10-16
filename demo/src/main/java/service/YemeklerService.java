package service;

import java.util.List;

import dto.YemeklerDto;


public interface YemeklerService {

	YemeklerDto addMeal(YemeklerDto yemek);

	List<YemeklerDto> listMeals();




}

