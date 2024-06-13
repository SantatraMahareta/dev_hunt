package com.example.devhunt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String type;
    public Date dateNaissance;
    public String nomUtilisateur;
    public String prenomUtilisateur;
    public String adresse;
    public String nomPere;
    public String nomMere;
    public String cin;
    public String situationMatrimoiniale;
    public String profession;
    public String photo;
    @JsonManagedReference
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.PERSIST)
    public List<Demande> demandes = new ArrayList<>();
}
