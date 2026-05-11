package com.ranking.microservicio_ranking.controller;

import com.ranking.microservicio_ranking.model.Ranking;
import com.ranking.microservicio_ranking.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ranking")
@RequiredArgsConstructor
public class RankingController {

    private final RankingService rankingService;

    @GetMapping
    public List<Ranking> obtenerTodo(){
        return rankingService.obtenerTodo();
    }

    @GetMapping("/{id}")
    public Optional<Ranking> buscarPorId(@PathVariable Long id){
        return rankingService.buscarPorId(id);
    }

    @PostMapping
    public void guardarRanking(@RequestBody Ranking ranking){
        rankingService.guardarRanking(ranking);
    }

}
