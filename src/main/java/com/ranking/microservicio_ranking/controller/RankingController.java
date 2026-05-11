package com.ranking.microservicio_ranking.controller;

import com.ranking.microservicio_ranking.dto.RankingResponseDTO;
import com.ranking.microservicio_ranking.model.Ranking;
import com.ranking.microservicio_ranking.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ranking")
@RequiredArgsConstructor
public class RankingController {

    private final RankingService rankingService;

    @GetMapping
    public List<RankingResponseDTO> obtenerTodo(){
        return rankingService.obtenerTodo();
    }

    @GetMapping("/{id}")
    public Optional<RankingResponseDTO> buscarPorId(@PathVariable Long id){
        return rankingService.buscarPorId(id);
    }

    @PostMapping
    public void guardarRanking(@RequestBody Ranking ranking){
        rankingService.guardarRanking(ranking);
    }

}
