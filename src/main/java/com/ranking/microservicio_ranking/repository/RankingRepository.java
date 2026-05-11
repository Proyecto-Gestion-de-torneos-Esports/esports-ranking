package com.ranking.microservicio_ranking.repository;

import com.ranking.microservicio_ranking.model.Ranking;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RankingRepository {

    private List<Ranking> listaRanking = new ArrayList<>();

    public List<Ranking> obtenerTodo(){
        return listaRanking;
    }

    public Ranking buscarPorId(Long id){
        for(Ranking ranking: listaRanking){
            if(ranking.getIdUsuario().equals(id)){
                return ranking;
            }
        }
        return null;
    }

    public void guardarRanking(Ranking ranking){
        listaRanking.add(ranking);
    }

}
