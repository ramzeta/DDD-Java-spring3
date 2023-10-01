package com.byron.msusers.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table( name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed;

    public UserEntity(){

    }

    public UserEntity(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
}
