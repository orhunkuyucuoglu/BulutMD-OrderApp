package repo;	
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.SiparişListesi;

@Repository
public interface SiparişListesiRepo extends JpaRepository<SiparişListesi,Long> {
	
	Optional<SiparişListesi> findByName(String müşteri_adi);

	
	


}