package afzal.online.exam.app.services;

import java.util.Set;

import afzal.online.exam.app.models.exam.Category;

public interface CategoryService {
	
	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public Set<Category> getCategories();
	public Category getCategory(Long categoryId);
	public void delteCategory(Long categoryId);
	

}
