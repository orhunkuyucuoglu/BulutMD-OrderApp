package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dto.SiparişListesiDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import service.SiparişListesiService;

@RestController
@RequestMapping("/siparişler")
public class SiparişListesiController {
	@Autowired 
	SiparişListesiService siparişService;
	
	@GetMapping("/get/{müşteri_adi}")
	public ResponseEntity<SiparişListesiDto> getOrder(@PathVariable("müşteri_adi") String müşteri_adi){
		SiparişListesiDto siparis=siparişService.getOrder(müşteri_adi);
		return ResponseEntity.ok(siparis);
		
	}
	@PostMapping("/create")
	public ResponseEntity<SiparişListesiDto> createOrder(@RequestBody SiparişListesiDto sipariş){
		SiparişListesiDto result=siparişService.createOrder(sipariş);
		return ResponseEntity.ok(result);
}
	@GetMapping("/list")
	public ResponseEntity<List<SiparişListesiDto>> listOrders(){
		List<SiparişListesiDto> siparişler=siparişService.listOrders();
		return ResponseEntity.ok(siparişler);
	}
}