package appData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlProductRepo extends JpaRepository<Product, Integer>, ProductRepo{
}
