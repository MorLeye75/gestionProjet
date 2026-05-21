package com.ept.campusEvents.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;
import jakarta.persistence.Id;
  
@Entity
@Table(name = "departements")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DepartementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false, unique = true)
    private String nom;


    @Column(name = "description", nullable = false)
    private String description;

   


   
}
