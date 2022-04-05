package appData;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Cart{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Your CART must have NAME!")
    private String name;

//    @NotBlank
//    @ManyToOne
//    private User user;
//
//    @NotBlank
//    @OneToMany
//    private List<Product> productsList;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    public Cart() {
    }

//    public Cart(String name, User user, List<Product> productsList, LocalDateTime createDate, LocalDateTime updateDate) {
//        this.name = name;
//        this.user = user;
//        this.productsList = productsList;
//        this.createDate = createDate;
//        this.updateDate = updateDate;
//    }


    public Cart(String name, LocalDateTime createDate, LocalDateTime updateDate) {
        this.name = name;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public List<Product> getProductsList() {
//        return productsList;
//    }
//
//    public void setProductsList(List<Product> productsList) {
//        this.productsList = productsList;
//    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @PrePersist
    public void prePersist(){
        createDate = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        updateDate = LocalDateTime.now();
    }
}
