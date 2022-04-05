package appData;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Inheritance;
import java.util.List;

public interface CartRepo{
    List<Cart> findAll();
    Cart save(Cart cart);
}
