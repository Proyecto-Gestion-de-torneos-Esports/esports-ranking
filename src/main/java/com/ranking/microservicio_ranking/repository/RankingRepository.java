package com.ranking.microservicio_ranking.repository;

import com.ranking.microservicio_ranking.model.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {

    @Query(value = "SELECT id_usuario, nombre, puntaje FROM ranking ORDER BY puntaje DESC", nativeQuery = true)
    List<Ranking> ordenarPuntajeMayoraMenor();

}
