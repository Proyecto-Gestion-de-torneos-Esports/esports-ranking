package com.ranking.microservicio_ranking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankingResponseDTO {

    private Long idUsuario;
    private String nombre;
    private Long puntaje;
}
