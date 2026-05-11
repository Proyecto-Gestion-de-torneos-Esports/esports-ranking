package com.ranking.microservicio_ranking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ranking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ranking {

    @Column(nullable = false, length = 5)
    private Long idUsuario;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 6)
    private Long puntaje;


}
