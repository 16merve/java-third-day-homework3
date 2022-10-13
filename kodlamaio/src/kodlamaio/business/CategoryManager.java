package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.dataAccess.JdbcCategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	List<String> categoryNames = new ArrayList<String>();

	public void add(Category category) throws Exception {
		for (String categoryName : categoryNames) {
			if (categoryName == category.getName()) {
				System.out.println("Kategori ismi tekrar edemez!");
			}
			CategoryDao categoryDao = new JdbcCategoryDao();
			categoryDao.add(category);
			for (Logger logger : loggers) { // [db,file]
				logger.log(category.getName());
			}

		}
		 
	 }
	 
}
