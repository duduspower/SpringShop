package appData;

import java.util.List;

public interface ProductRepo {
    List<Product> findAll();
    Product findById(int ID);
    Product save(Product product);
    void deleteAll();
    void deleteById(int ID);
}
