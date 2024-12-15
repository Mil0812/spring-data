package mil0812.springdata.controllers;

import java.util.List;
import mil0812.springdata.models.Category;
import mil0812.springdata.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/categories")
public class CategoryController {

 private final CategoryService categoryService;

  public CategoryController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @GetMapping
  public String getAllCategories(Model model) {
    model.addAttribute("categories", categoryService.getAllCategories());
    return "categories";
  }
}
