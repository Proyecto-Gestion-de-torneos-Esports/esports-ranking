package com.ranking.microservicio_ranking.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ranking {

    @NotNull(message = "El id no puede ser nulo")
    @Positive(message = "El id tiene que ser mayor a 0")
    private Long idUsuario;

    @NotBlank(message = "El nombre no puede ser nulo ni vacio")
    private String nombre;

    @NotNull(message = "El puntaje no puede ser nulo")
    @PositiveOrZero(message = "El puntaje no puede ser negativo")
    private Long puntaje;


}
