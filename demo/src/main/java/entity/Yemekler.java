
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="yemekler")

public class Yemekler {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="yemek_id")
	private long yemek_id;
	@Column(name="yemek_adi")
	private String yemek_adi;
	@Column(name="fiyat")
	private double fiyat;
	
	

}