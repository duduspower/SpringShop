package appData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlCartRepo extends CartRepo, JpaRepository<Cart, Integer> {
}
