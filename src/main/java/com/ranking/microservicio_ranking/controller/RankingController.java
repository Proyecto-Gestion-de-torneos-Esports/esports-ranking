package com.ranking.microservicio_ranking.controller;

import com.ranking.microservicio_ranking.dto.RankingResponseDTO;
import com.ranking.microservicio_ranking.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public RankingResponseDTO buscarPorId(@PathVariable Long id){
        return rankingService.buscarPorId(id);
    }

    @PostMapping("/{id}")
    public void guardarRanking(@PathVariable Long id){
        rankingService.guardarRanking(id);
    }

    @GetMapping("/puntaje")
    public List<RankingResponseDTO> listarOrdenado(){
        return rankingService.rankingOrdenaPorPuntaje();
    }
}
