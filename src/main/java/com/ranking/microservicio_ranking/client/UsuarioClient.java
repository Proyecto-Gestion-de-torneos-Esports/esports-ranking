package com.ranking.microservicio_ranking.client;

import com.ranking.microservicio_ranking.dto.UsuarioResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "usuarios", url = "http://localhost:8002/api/usuarios")
public interface UsuarioClient {

    @GetMapping("/{id}")
    UsuarioResponseDTO buscarPorId(Long id);
}
