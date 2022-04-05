package appData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RepositoryRestController
public class CartRepoController{

    private final CartRepo repo;

    public CartRepoController(CartRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/carts")
    ResponseEntity<List<Cart>> getAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @PostMapping("/carts")
    public ResponseEntity<Cart> save(@RequestBody Cart cart){
        repo.save(cart);
        return ResponseEntity.noContent().build();
    }
}
