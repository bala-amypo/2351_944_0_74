package com.example.project.newentity;

import jakarta.persistence.*;
import jakarta.validation.constrains.*;
@Entity
@Table(name="Student")
public class NewFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="should not contain space")
    @Column(name=unique)
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(message="invalid format")
    private String email;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Newentity(Long id,@NotBlank(message="should not contain space") String name,@NotBlank(message="no blank allowed")
    @Email(message="invalid format") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public Newentity() {
    }
    
}