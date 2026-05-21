package com.ept.campusEvents.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.ept.campusEvents.DTO.DepartementDTO;
import com.ept.campusEvents.Entity.DepartementEntity;

@Mapper(componentModel = "spring")
public interface  DepartementMapper {

    // Entity → DTO
     DepartementDTO toDTO(DepartementEntity entity);

    // DTO → Entity
    DepartementEntity toEntity(DepartementDTO dto);
    // List<Entity> → List<DTO>
     List<DepartementDTO> toDTOList(List<DepartementEntity> entities);

    // List<DTO> → List<Entity>
     List<DepartementEntity> toEntityList(List<DepartementDTO> dtos);
}