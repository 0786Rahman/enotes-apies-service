package com.enotes.service.Impl;

import com.enotes.entity.Category;
import com.enotes.repository.CategoryRepo;
import com.enotes.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    @Override
    public Boolean savedCategory(Category category) {
        category.setIsDeleted(false);
        Category saveCategory = categoryRepo.save(category);
        return !ObjectUtils.isEmpty(saveCategory);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }
}
