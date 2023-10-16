package repo;	
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.orderList;

@Repository
public interface orderListRepo extends JpaRepository<orderList,Long> {
	
	Optional<orderList> findByName(String customer_name);

	
	


}