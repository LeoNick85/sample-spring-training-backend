package com.leonick.sample_spring_backend.service.image;

import com.leonick.sample_spring_backend.dto.ImageDTO;
import com.leonick.sample_spring_backend.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageServiceInterface {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDTO> saveImage(List<MultipartFile> files, Long productId);
    Image updateImage(MultipartFile file, Long imageId);
}
