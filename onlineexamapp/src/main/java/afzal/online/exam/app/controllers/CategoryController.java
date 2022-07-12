package afzal.online.exam.app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afzal.online.exam.app.models.exam.Category;
import afzal.online.exam.app.services.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	
	// Add Category
	
	@PostMapping("/")
	public ResponseEntity<Category> addCategory(@RequestBody Category category){
		Category addCategory = this.categoryService.addCategory(category);
		return ResponseEntity.ok(addCategory);
	}
	
	
	//Get Category
	@GetMapping("/{categoryId}")
	public Category getCategory(@PathVariable("categoryId") Long categoryId)  {
		return  this.categoryService.getCategory(categoryId);
	}
	
	
	//Get All Category
	@GetMapping("/getallCategories")
	public ResponseEntity<?> getAllCategory() {
		return  ResponseEntity.ok(this.categoryService.getCategories());
	}
	
	//Update category -- /category/updacategory
	@PutMapping("/")
	public Category updateCategory(Category category) {
		Category updateCategory = this.categoryService.updateCategory(category);
		
		updateCategory.setcId(category.getcId());
		updateCategory.setDescription(category.getDescription());
	
		
		return this.categoryService.updateCategory(updateCategory);
	}
	//Delete Category
	@DeleteMapping("/{categoryId}")
	public void dleteCategory(@PathVariable("categoryId") Long categoryId)  {
		  this.categoryService.delteCategory(categoryId);
	}
	
	
}
