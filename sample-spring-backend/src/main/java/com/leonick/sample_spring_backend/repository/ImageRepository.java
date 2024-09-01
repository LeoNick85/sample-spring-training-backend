package com.leonick.sample_spring_backend.repository;

import com.leonick.sample_spring_backend.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
