package service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.orderListDto;
import dto.mealListDto;
import entity.orderList;
import entity.mealList;
import repo.orderListRepo;


@Service
public abstract class orderListServiceImpl implements orderListService {
	@Autowired
	orderListRepo cartRepo;
	ModelMapper modelMapper;
	
	
	
	@Override
	public orderListDto getOrder(String müşteri_adi) {
		Optional<orderList> order=cartRepo.findByName(customer_name);
	
		if (order.isPresent()){
			return modelMapper.map(order.get(),orderListDto.class);
		}
		return null;
	}
	
	@Override
	public List<orderListDto> listOrders(){
		List<orderList> orders=cartRepo.findAll();
		List<orderListDto> dtos=orders.stream().map(order -> modelMapper.map(order, orderListDto.class)).collect(Collectors.toList());
		return dtos;
	}
	@Override
	public orderListDto createOrder(orderListDto orderdto) {
		mealList meal=modelMapper.map(orderdto,mealList.class);
		return modelMapper.map(cartRepo.save(meal), mealListDto.class);
	}
}
