package appData;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RepositoryRestController
public class UserRepoController {

    private final UserRepo repo;

    public UserRepoController(UserRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/users")
    ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/users{id}")
    ResponseEntity<User> getById(@RequestParam int id){
        return ResponseEntity.ok(repo.findById(id));
    }

    @PostMapping("/users")
    ResponseEntity<User> save(@RequestBody User user){
        repo.save(user);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/users{id}")
    ResponseEntity<?> put(@RequestBody User user, @RequestParam int id){
        repo.save(user);
        return ResponseEntity.ok("User saved");
    }

    @DeleteMapping("/users")
    ResponseEntity<?> deleteAll(){
        repo.deleteAll();
        return ResponseEntity.ok("All users deleted");
    }

    @DeleteMapping("/user{id}")
    ResponseEntity<?> deleteById(@RequestParam int id){
        repo.deleteById(id);
        return ResponseEntity.ok("User deleted");
    }


    @PatchMapping("/users{id}")
    ResponseEntity<?> patch(@RequestBody User user ,@RequestParam int id){
        repo.save(user);
        return ResponseEntity.ok("User saved");
    }

}
