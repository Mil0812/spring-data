package mil0812.springdata;

import java.math.BigDecimal;
import mil0812.springdata.models.Category;
import mil0812.springdata.models.Product;
import mil0812.springdata.repositories.CategoryRepository;
import mil0812.springdata.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final ProductRepository productRepository;
  private final CategoryRepository categoryRepository;

  public DataLoader(ProductRepository productRepository, CategoryRepository categoryRepository) {
    this.productRepository = productRepository;
    this.categoryRepository = categoryRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    // Категорія 1
    Category stationery = new Category();
    stationery.setName("Канцелярія");

    Product diary = new Product();
    diary.setName("Щоденник");
    diary.setPrice(new BigDecimal("100.00"));
    diary.setImageUrl("https://nus.org.ua/wp-content/uploads/2023/04/photo_2019-08-20_11-34-34-1.jpg");
    diary.setCategory(stationery);

    Product notebook = new Product();
    notebook.setName("Зошит");
    notebook.setPrice(new BigDecimal("50.00"));
    notebook.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2SjNRugmZI1otiMWGhR2Yc1C6d44m9JezcQ&s");
    notebook.setCategory(stationery);

    // Зберігаємо категорію та товари
    categoryRepository.save(stationery);
    productRepository.save(diary);
    productRepository.save(notebook);

    // Категорія 2
    Category electronics = new Category();
    electronics.setName("Електроніка");

    Product smartphone = new Product();
    smartphone.setName("Смартфон");
    smartphone.setPrice(new BigDecimal("15000.00"));
    smartphone.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWab-1pTMWXajVaDCe0bK9IlnNgPgo7w7JXw&s");
    smartphone.setCategory(electronics);

    Product headphones = new Product();
    headphones.setName("Навушники");
    headphones.setPrice(new BigDecimal("2000.00"));
    headphones.setImageUrl("https://i0.wp.com/www.myhoco.com.ua/wp-content/uploads/2023/11/besprovodnye-naushniki-hoco-w35-1.webp?fit=800%2C800&ssl=1");
    headphones.setCategory(electronics);

    // Зберігаємо категорію та товари
    categoryRepository.save(electronics);
    productRepository.save(smartphone);
    productRepository.save(headphones);

    // Категорія 3
    Category clothing = new Category();
    clothing.setName("Одяг");

    Product tShirt = new Product();
    tShirt.setName("Футболка");
    tShirt.setPrice(new BigDecimal("300.00"));
    tShirt.setImageUrl("https://harvest-clothing.com.ua/image/cache/catalog/0_%D0%9E%D0%B4%D1%8F%D0%B3/060434000000610000/DSC03492-1000x1250.jpg");
    tShirt.setCategory(clothing);

    Product jeans = new Product();
    jeans.setName("Спортивний костюм");
    jeans.setPrice(new BigDecimal("1000.00"));
    jeans.setImageUrl("https://imagedelivery.net/nmdL8GYRvCm2wKaYqp-7sg/cf7ef67070ae68fa9a2a96797fd868b5.jpg/original");
    jeans.setCategory(clothing);

    // Зберігаємо категорію та товари
    categoryRepository.save(clothing);
    productRepository.save(tShirt);
    productRepository.save(jeans);

  }
}
