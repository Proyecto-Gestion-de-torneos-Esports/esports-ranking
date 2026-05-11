package com.ranking.microservicio_ranking.service;

import com.ranking.microservicio_ranking.model.Ranking;
import com.ranking.microservicio_ranking.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingService {

    @Autowired
    private RankingRepository rankingRepository;

    public List<Ranking> obtenerTodo(){
        return rankingRepository.obtenerTodo();
    }

    public Ranking buscarPorId(Long id){
        return rankingRepository.buscarPorId(id);
    }

    public void guardarRanking(Ranking ranking){
        rankingRepository.guardarRanking(ranking);
    }

}
