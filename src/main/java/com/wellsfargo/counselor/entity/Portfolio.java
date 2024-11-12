package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generated ID
    private Long id;

    @OneToOne
    private Client client;  // Relationship with Client

    @Column(nullable = false)
    private String creationDate;

    // Constructor to initialize all instance variables
    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        // No setter for id as per instructions
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
