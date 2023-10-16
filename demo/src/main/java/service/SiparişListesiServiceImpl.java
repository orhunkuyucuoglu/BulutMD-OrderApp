package service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.SiparişListesiDto;
import dto.YemeklerDto;
import entity.SiparişListesi;
import entity.Yemekler;
import repo.SiparişListesiRepo;


@Service
public abstract class SiparişListesiServiceImpl implements SiparişListesiService {
	@Autowired
	SiparişListesiRepo cartRepo;
	ModelMapper modelMapper;
	
	
	
	@Override
	public SiparişListesiDto getOrder(String müşteri_adi) {
		Optional<SiparişListesi> siparis=cartRepo.findByName(müşteri_adi);
	
		if (siparis.isPresent()){
			return modelMapper.map(siparis.get(),SiparişListesiDto.class);
		}
		return null;
	}
	
	@Override
	public List<SiparişListesiDto> listOrders(){
		List<SiparişListesi> siparisler=cartRepo.findAll();
		List<SiparişListesiDto> dtos=siparisler.stream().map(siparis -> modelMapper.map(siparis, SiparişListesiDto.class)).collect(Collectors.toList());
		return dtos;
	}
	@Override
	public SiparişListesiDto createOrder(SiparişListesiDto siparişdto) {
		Yemekler yemek=modelMapper.map(siparişdto,Yemekler.class);
		return modelMapper.map(cartRepo.save(yemek), YemeklerDto.class);
	}
}
	
