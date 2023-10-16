package repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.mealList;

@Repository

public interface mealListRepo extends JpaRepository<mealList,Long> {

}
