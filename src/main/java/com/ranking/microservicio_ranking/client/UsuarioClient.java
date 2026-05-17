package com.ranking.microservicio_ranking.client;

import com.ranking.microservicio_ranking.dto.UsuarioResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuarios", url = "http://localhost:8001/api/usuarios")
//@FeignClient(name = "usuarios", url = "http://localhost:8021/api/usuarios")
public interface UsuarioClient {

    @GetMapping("/{id}")
    UsuarioResponseDTO buscarPorId(@PathVariable Long id);
}
