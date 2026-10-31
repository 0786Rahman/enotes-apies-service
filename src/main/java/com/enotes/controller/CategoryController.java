package com.enotes.controller;

import com.enotes.entity.Category;
import com.enotes.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("/save")
    public ResponseEntity<?> savedCategory(@RequestBody Category category) {
        Boolean result = categoryService.savedCategory(category);
        if (Boolean.TRUE.equals(result)) {
            return new ResponseEntity<>("Category saved successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Category not saved", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllCategory(){
        List<Category> allCategory = categoryService.getAllCategory();
        if ((CollectionUtils.isEmpty(allCategory))){
            return ResponseEntity.noContent().build();
        } else {
            return new ResponseEntity<>(allCategory,HttpStatus.OK);
        }

    }
}

