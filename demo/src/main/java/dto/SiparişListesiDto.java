package dto;

import entity.Yemekler;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SiparişListesiDto {
	
	private String müşteri_adi;
	private Yemekler yemek;
}
