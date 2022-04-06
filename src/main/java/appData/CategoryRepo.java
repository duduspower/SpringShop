package appData;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CategoryRepo {
    List<Category> findAll();
    Category findById(int ID);
    Category save(Category category);
    void deleteAll();
    void deleteById(int ID);
}
