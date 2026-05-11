package com.ranking.microservicio_ranking.service;

import com.ranking.microservicio_ranking.dto.RankingResponseDTO;
import com.ranking.microservicio_ranking.model.Ranking;
import com.ranking.microservicio_ranking.repository.RankingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RankingService {

    private final RankingRepository rankingRepository;

    public RankingResponseDTO mapToDTO(Ranking ranking){
        return new RankingResponseDTO(
                ranking.getIdUsuario(),
                ranking.getNombre(),
                ranking.getPuntaje()
        );
    }
    public List<RankingResponseDTO> obtenerTodo(){
        return rankingRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public Optional<RankingResponseDTO> buscarPorId(Long id){
        return rankingRepository.findById(id).map(this::mapToDTO);
    }

    public void guardarRanking(Ranking ranking){
        rankingRepository.save(ranking);
    }

}
