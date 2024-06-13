package com.example.devhunt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String nomService;
    @JsonManagedReference
    @OneToMany(mappedBy = "service", cascade = CascadeType.PERSIST)
    public List<Piece> pieces = new ArrayList<>();
    @JsonManagedReference
    @OneToMany(mappedBy = "service", cascade = CascadeType.PERSIST)
    public List<Lier> lier = new ArrayList<>();
    @JsonManagedReference
    @OneToMany(mappedBy = "service", cascade = CascadeType.PERSIST)
    public List<Setrouver>setrouvers = new ArrayList<>();
}
