package com.example.dndproject.persistentie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Weapon {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
