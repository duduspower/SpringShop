package appData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/carts{id}")
    ResponseEntity<Cart> getById(@PathVariable int id){
        return ResponseEntity.ok(repo.findById(id));
    }

    @PostMapping("/carts")
    ResponseEntity<Cart> save(@RequestBody Cart cart){
        repo.save(cart);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/carts{id}")
    ResponseEntity<?> put(@RequestBody Cart cart,@PathVariable int id){
        repo.save(cart);
        return ResponseEntity.ok("Cart saved");
    }

    @PatchMapping("/carts{id}")
    ResponseEntity<?> path(@RequestBody Cart cart,@PathVariable int id){
        repo.save(cart);
        return ResponseEntity.ok("Cart saved");
    }

    @DeleteMapping("/carts")
    ResponseEntity<?> deleteAll(){
        repo.deleteAll();
        return ResponseEntity.ok("All carts deleted");
    }

    @DeleteMapping("/cart{id}")
    ResponseEntity<?> deleteById(@RequestParam int id){
        repo.deleteById(id);
        return ResponseEntity.ok("Cart deleted");
    }
}
