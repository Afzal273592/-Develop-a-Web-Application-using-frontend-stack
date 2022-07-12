package afzal.online.exam.app.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afzal.online.exam.app.models.exam.Category;
import afzal.online.exam.app.repository.CategoryRepository;
import afzal.online.exam.app.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category addCategory(Category category) {
		
		Category saveCategory = this.categoryRepository.save(category);
		
		return saveCategory;
	}

	@Override
	public Category updateCategory(Category category) {
		
		return  this.categoryRepository.save(category);
	}

	@Override
	public Set<Category> getCategories() {
		
		return new LinkedHashSet<>(this.categoryRepository.findAll()); 
	}

	@Override
	public Category getCategory(Long categoryId) {
		
		return this.categoryRepository.findById(categoryId).get();
	}

	@Override
	public void delteCategory(Long categoryId) {
		
		Category category = new Category();
		category.setcId(categoryId);
		 this.categoryRepository.delete(category);;
	}

}
