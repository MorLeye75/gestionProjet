package com.ept.campusEvents.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ept.campusEvents.DTO.DepartementDTO;
import com.ept.campusEvents.Exception.ResourceNotFoundException;
import com.ept.campusEvents.Mapper.DepartementMapper;
import com.ept.campusEvents.Repository.DepartementRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class DepartementService {

    private final DepartementRepository departementRepository;
    private final DepartementMapper departementMapper;

    public List<DepartementDTO> getAllDepartements() {
        return departementRepository.findAll()
                .stream()
                .map(departementMapper::toDTO)
                .toList();
    }

    public DepartementDTO getDepartementById(Long id) {
        return departementRepository.findById(id)
                .map(departementMapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Departement not found with id: " + id));
    }

    public DepartementDTO createDepartement(DepartementDTO departementDTO) {
        var departementEntity = departementMapper.toEntity(departementDTO);
        var savedEntity = departementRepository.save(departementEntity);
        return departementMapper.toDTO(savedEntity);
    }
}
