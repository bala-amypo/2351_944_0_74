package com.example.project.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constrains.NotBlank;

public class NewFile {
    @Id
    private Long id;
    @NotBlank(message="should not contain space")
    private String name;
    @NotBlank(message="no blank allowed")
    private String email;
    
}