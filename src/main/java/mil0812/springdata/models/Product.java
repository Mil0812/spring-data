package mil0812.springdata.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private BigDecimal price;
  private String imageUrl;

  @ManyToOne
  @JoinColumn(name = "category_id")
  public Category category;

  public Product(Long id, String name, BigDecimal price, String imageUrl, Category category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.imageUrl = imageUrl;
    this.category = category;
  }

  public Product() {

  }
}
