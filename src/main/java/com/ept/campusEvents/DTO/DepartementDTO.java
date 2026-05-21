package com.ept.campusEvents.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DepartementDTO {

    private Long id;

    private String nom;

    private String description;

}
