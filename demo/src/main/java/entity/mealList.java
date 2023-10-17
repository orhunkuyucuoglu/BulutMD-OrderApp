
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;




@Setter
@Getter
@Entity
@Table(name="meals")

public class mealList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="meal_id")
	private long meal_id;
	@Column(name="meal_name")
	private String meal_name;
	@Column(name="price")
	private double price;
	
	

}