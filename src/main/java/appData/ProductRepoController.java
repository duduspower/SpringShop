package appData;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RepositoryRestController
public class ProductRepoController {

    private final ProductRepo repo;

    public ProductRepoController(ProductRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/products")
    ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/products{id}")
    ResponseEntity<Product> getById(@RequestParam int id){
        return ResponseEntity.ok(repo.findById(id));
    }

    @PostMapping("/products")
    ResponseEntity<Product> save(@RequestBody Product product){
        repo.save(product);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/products{id}")
    ResponseEntity<?> put(@RequestBody Product product, @PathVariable int id){
        repo.save(product);
        return ResponseEntity.ok("Product saved");
    }

    @PatchMapping("/products{id}")
    ResponseEntity<?> patch(@RequestBody Product product, @PathVariable int id){
        repo.save(product);
        return ResponseEntity.ok("Product saved");
    }

    @DeleteMapping("/products")
    ResponseEntity<?> deleteAll(){
        repo.deleteAll();
        return ResponseEntity.ok("All products deleted");
    }

    @DeleteMapping("/product{id}")
    ResponseEntity<?> deleteById(@RequestParam int id){
        repo.deleteById(id);
        return ResponseEntity.ok("Product deleted");
    }
}
