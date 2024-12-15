package mil0812.springdata.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Product> products;


}
