package com.ranking.microservicio_ranking.service;

import com.ranking.microservicio_ranking.model.Ranking;
import com.ranking.microservicio_ranking.repository.RankingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RankingService {

    private final RankingRepository rankingRepository;

    public List<Ranking> obtenerTodo(){
        return rankingRepository.findAll();
    }

    public Optional<Ranking> buscarPorId(Long id){
        return rankingRepository.findById(id);
    }

    public void guardarRanking(Ranking ranking){
        rankingRepository.save(ranking);
    }

}
