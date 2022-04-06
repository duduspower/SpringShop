package appData;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CartRepo{
    List<Cart> findAll();
    Cart findById(int ID);
    Cart save(Cart cart);
    void deleteAll();
    void deleteById(int ID);
}
