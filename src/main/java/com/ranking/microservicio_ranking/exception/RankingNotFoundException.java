package com.ranking.microservicio_ranking.exception;


public class RankingNotFoundException extends RuntimeException{

    public RankingNotFoundException(String mensaje){
        super(mensaje);
    }
}
