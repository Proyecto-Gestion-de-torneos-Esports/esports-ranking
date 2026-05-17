package com.ranking.microservicio_ranking.exception;

public class UsuarioNotFoundException extends RuntimeException{

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }

}

