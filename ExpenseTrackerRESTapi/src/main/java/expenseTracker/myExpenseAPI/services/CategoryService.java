package expenseTracker.myExpenseAPI.services;

import java.util.List;

import expenseTracker.myExpenseAPI.domain.Category;
import expenseTracker.myExpenseAPI.exceptions.EtBadRequestException;
import expenseTracker.myExpenseAPI.exceptions.EtResourceNotFoundException;

public interface CategoryService {
    
    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
