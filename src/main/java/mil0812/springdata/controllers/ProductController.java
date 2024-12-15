package mil0812.springdata.controllers;

import mil0812.springdata.models.Product;
import mil0812.springdata.services.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/products")
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public String getAllProducts(Pageable pageable, Model model) {
    model.addAttribute("products", productService.getAllProducts(pageable));
    return "products";
  }
}
