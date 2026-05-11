package com.ranking.microservicio_ranking.controller;

import com.ranking.microservicio_ranking.model.Ranking;
import com.ranking.microservicio_ranking.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ranking")
public class RankingController {

    @Autowired
    private RankingService rankingService;

    @GetMapping
    public List<Ranking> obtenerTodo(){
        return rankingService.obtenerTodo();
    }

    @GetMapping("/{id}")
    public Ranking buscarPorId(@PathVariable Long id){
        return rankingService.buscarPorId(id);
    }

    @PostMapping
    public void guardarRanking(@RequestBody Ranking ranking){
        rankingService.guardarRanking(ranking);
    }

}
