package com.ept.campusEvents.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ept.campusEvents.Entity.DepartementEntity;

public interface DepartementRepository extends JpaRepository<DepartementEntity, Long> {
    DepartementEntity findByNom(String nom);
    java.util.List<DepartementEntity> findByDescriptionContaining(String keyword);
}
