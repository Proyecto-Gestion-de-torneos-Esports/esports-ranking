package com.ranking.microservicio_ranking.repository;

import com.ranking.microservicio_ranking.model.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {

}
