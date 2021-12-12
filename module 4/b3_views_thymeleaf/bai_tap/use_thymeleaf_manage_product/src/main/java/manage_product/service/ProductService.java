package manage_product.service;

import manage_product.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService{
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Ip 13", 1000, "Smart phone", "Apple"));
        products.put(2, new Product(2, "S30", 1200, "Smart phone", "Sam Sung"));
        products.put(3, new Product(3, "Mi 14", 1100, "Smart phone", "Xiaomi"));
        products.put(4, new Product(4, "Oppo find x", 1300, "Smart phone", "Oppo"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findByName(String name) {
        return null;
    }
}
