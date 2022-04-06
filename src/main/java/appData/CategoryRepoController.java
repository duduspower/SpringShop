package appData;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RepositoryRestController
public class CategoryRepoController {

    private final CategoryRepo repo;

    public CategoryRepoController(CategoryRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/categories")
    ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/categories{id}")
    ResponseEntity<Category> getAll(@RequestParam int id){
        return ResponseEntity.ok(repo.findById(id));
    }

    @PostMapping("/categories")
    ResponseEntity<Category> save(@RequestBody Category category){
        repo.save(category);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/categories{id}")
    ResponseEntity<?> put(@RequestBody Category category, @PathVariable int id){
        repo.save(category);
        return ResponseEntity.ok("Category saved");
    }

    @PatchMapping("/categories{id}")
    ResponseEntity<?> patch(@RequestBody Category category, @PathVariable int id){
        repo.save(category);
        return ResponseEntity.ok("Category saved");
    }

    @DeleteMapping("/categories")
    ResponseEntity<?> deleteAll(){
        repo.deleteAll();
        return ResponseEntity.ok("All categories created");
    }

    @DeleteMapping("/category{id}")
    ResponseEntity<?> deleteById(@RequestParam int id){
        repo.deleteById(id);
        return ResponseEntity.ok("Category deleted");
    }
}
