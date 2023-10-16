package service;
import java.util.List;
import dto.SiparişListesiDto;
import entity.SiparişListesi;
public interface SiparişListesiService {
	
	SiparişListesiDto getOrder(String müşteri_adi);
	List<SiparişListesiDto> listOrders();
	SiparişListesiDto createOrder(SiparişListesiDto sipariş);
	SiparişListesi findByName(String müşteri_adi);
	

	
	

	
	

}

