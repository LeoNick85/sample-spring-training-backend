package com.leonick.sample_spring_backend.repository;

import com.leonick.sample_spring_backend.model.Category;
import com.leonick.sample_spring_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

    boolean existByName(String name);
}
