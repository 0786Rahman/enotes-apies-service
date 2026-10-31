package com.enotes.service;

import com.enotes.entity.Category;

import java.util.List;

public interface CategoryService {
    Boolean savedCategory(Category category);
    List<Category> getAllCategory();
}
