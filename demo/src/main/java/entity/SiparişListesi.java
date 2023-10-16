
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="siparişler")
public class SiparişListesi {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sipariş_id")
	private long sipariş_id;
	@Column(name="müşteri_adı")
	private String müşteri_adi;
	
	@ManyToOne
	@JoinColumn(name = "yemek_id")
	private Yemekler yemek;

	
}


