package appData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlUserRepo extends JpaRepository<User, Integer>, UserRepo{
}
