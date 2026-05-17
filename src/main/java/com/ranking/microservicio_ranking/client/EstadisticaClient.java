package com.ranking.microservicio_ranking.client;

import com.ranking.microservicio_ranking.dto.EstadisticaResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "microservicio-estadistica", url = "http://localhost:8005/api/estadistica")
//@FeignClient(name = "microservicio-estadistica", url = "http://localhost:8025/api/estadistica")
public interface EstadisticaClient {

    @GetMapping()
    List<EstadisticaResponseDTO> obtenerTodos();

}
