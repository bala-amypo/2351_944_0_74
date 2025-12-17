package com.example.project.newentity;

import jakarta.persistence.*;
import jakarta.validation.constrains.*;

public class NewFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="should not contain space")
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(message="invalid format")
    private String email;
    
}