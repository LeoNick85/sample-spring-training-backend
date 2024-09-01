package com.leonick.sample_spring_backend.service.category;

import com.leonick.sample_spring_backend.model.Category;

import java.util.List;

public interface CategoryServiceInterface {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();

    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}
