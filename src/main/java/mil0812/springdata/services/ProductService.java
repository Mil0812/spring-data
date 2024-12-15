package mil0812.springdata.services;

import java.util.List;
import mil0812.springdata.models.Product;
import mil0812.springdata.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Page<Product> getAllProducts(Pageable pageable){
    return productRepository.findAll(pageable);
  }
}
