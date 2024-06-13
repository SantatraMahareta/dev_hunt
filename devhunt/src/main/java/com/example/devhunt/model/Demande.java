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
public class Demande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public Date dateDemande;
    @ManyToOne
    public Utilisateur utilisateur;
    @JsonManagedReference
    @OneToMany(mappedBy = "demande", cascade = CascadeType.PERSIST)
    public List<Notification> notifications = new ArrayList<>();
    @JsonManagedReference
    @OneToMany(mappedBy = "demande", cascade = CascadeType.PERSIST)
    public List<Fichier> fichiers = new ArrayList<>();
    @JsonManagedReference
    @OneToMany(mappedBy = "demande", cascade = CascadeType.PERSIST)
    public List<Lier> lier = new ArrayList<>();


}
