package service;
import java.util.List;
import dto.orderListDto;
import entity.orderList;
public interface orderListService {
	
	orderListDto getOrder(String customer_name);
	List<orderListDto> listOrders();
	orderListDto createOrder(orderListDto order);
	orderList findByName(String customer_name);
	

}
	

	
	