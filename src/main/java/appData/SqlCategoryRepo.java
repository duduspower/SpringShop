package appData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlCategoryRepo extends JpaRepository<Category, Integer>, CategoryRepo {
}
