package repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Yemekler;

@Repository

public interface YemeklerRepo extends JpaRepository<Yemekler,Long> {

}
