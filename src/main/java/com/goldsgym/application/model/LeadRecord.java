package com.goldsgym.application.model;

import jakarta.persistence.*;

@Entity
@Table(name = "golds_gym_leads")
public class LeadRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public LeadRecord() {}
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email;}
}
