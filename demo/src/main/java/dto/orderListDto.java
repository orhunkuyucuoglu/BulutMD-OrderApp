package dto;

import entity.mealList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class orderListDto {
	
	private String customer_name;
	private mealList meal;
}
