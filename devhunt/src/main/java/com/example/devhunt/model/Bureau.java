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
public class Bureau implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String nomBureau;
    public Double longitude;
    public Double latitude;
    public Double altitude;
    public String type;
    @JsonManagedReference
    @OneToMany(mappedBy = "bureau", cascade = CascadeType.PERSIST)
    public List<Setrouver> setrouvers = new ArrayList<>();
}
