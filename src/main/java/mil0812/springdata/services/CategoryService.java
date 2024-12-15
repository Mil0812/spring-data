package mil0812.springdata.services;

import java.util.List;
import mil0812.springdata.models.Category;
import mil0812.springdata.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  private final CategoryRepository categoryRepository;

  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public List<Category> getAllCategories(){
    return categoryRepository.findAll();
  }
}
