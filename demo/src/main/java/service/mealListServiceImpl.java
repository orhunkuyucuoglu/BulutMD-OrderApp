package service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dto.mealListDto;
import entity.mealList;
import repo.mealListRepo;


@Service
public abstract class mealListServiceImpl implements mealListService {
	@Autowired
	mealListRepo mealRepo;
	ModelMapper modelMapper;
	
	@Override
	public mealListDto addMeal(mealListDto mealDto) {
		mealList meals=modelMapper.map(mealDto, mealList.class);
		return modelMapper.map(mealRepo.save(meals), mealListDto.class);

	}	
	
	@Override
	public List<mealListDto> listMeals()  {
		List<mealList> meals=mealRepo.findAll();
		List<mealListDto> dtos=mealList.stream().map(meal -> modelMapper.map(meal, mealListDto.class)).collect(Collectors.toList());
		return dtos;

}
}

