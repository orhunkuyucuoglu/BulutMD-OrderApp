
package service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dto.YemeklerDto;
import entity.Yemekler;
import repo.YemeklerRepo;


@Service
public abstract class YemeklerServiceImpl implements YemeklerService {
	@Autowired
	YemeklerRepo yemekrepo;
	ModelMapper modelMapper;
	
	@Override
	public YemeklerDto addMeal(YemeklerDto yemekdto) {
		Yemekler yemekler=modelMapper.map(yemekdto, Yemekler.class);
		return modelMapper.map(yemekrepo.save(yemekler), YemeklerDto.class);

	}	
	
	@Override
	public List<YemeklerDto> listMeals()  {
		List<Yemekler> yemekler=yemekrepo.findAll();
		List<YemeklerDto> dtos=yemekler.stream().map(yemek -> modelMapper.map(yemek, YemeklerDto.class)).collect(Collectors.toList());
		return dtos;

}
}



