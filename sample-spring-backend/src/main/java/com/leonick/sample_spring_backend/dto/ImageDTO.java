package com.leonick.sample_spring_backend.dto;

import lombok.Data;

@Data
public class ImageDTO {
    private Long id;
    private String imageName;
    private String downloadUrl;
}
