package com.ranking.microservicio_ranking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponseDTO {

    private Long id;
    private String nombreUsuario;
    private String correo;
    private Boolean activo;
    private Long equipoId;


}