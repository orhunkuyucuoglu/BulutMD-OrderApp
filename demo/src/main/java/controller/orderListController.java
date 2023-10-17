package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dto.orderListDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import service.orderListService;

@RestController
@RequestMapping("/orders")
public class orderListController {
	@Autowired 
	orderListService orderService;
	
	@GetMapping("/get/{customer_name}")
	public ResponseEntity<orderListDto> getOrder(@PathVariable("customer_name") String customer_name){
		orderListDto order=orderService.getOrder(customer_name);
		return ResponseEntity.ok(order);
		
	}
	@PostMapping("/create")
	public ResponseEntity<orderListDto> createOrder(@RequestBody orderListDto order){
		orderListDto result=orderService.createOrder(order);
		return ResponseEntity.ok(result);
}
	@GetMapping("/list")
	public ResponseEntity<List<orderListDto>> listOrders(){
		List<orderListDto> orders=orderService.listOrders();
		return ResponseEntity.ok(orders);
	}
}