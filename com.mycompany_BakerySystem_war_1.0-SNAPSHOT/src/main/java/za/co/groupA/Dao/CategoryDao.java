package za.co.groupA.Dao;

import za.co.groupA.Model.Category;
import java.util.List;

public interface CategoryDao {

    public boolean addCategory(Category category);

    public List<Category> getAllCategories();

    public Category getCategory(int categoryId);

    public boolean deleteCategory(int categoryId, boolean delete);

    public boolean updateCategory(Category category);

}
