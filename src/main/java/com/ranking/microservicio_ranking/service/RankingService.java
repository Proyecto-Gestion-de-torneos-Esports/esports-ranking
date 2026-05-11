package com.ranking.microservicio_ranking.service;

import com.ranking.microservicio_ranking.client.AuditoriaClient;
import com.ranking.microservicio_ranking.dto.AuditoriaRequestDTO;
import com.ranking.microservicio_ranking.dto.AuditoriaResponseDTO;
import com.ranking.microservicio_ranking.dto.RankingResponseDTO;
import com.ranking.microservicio_ranking.exception.RankingNotFoundException;
import com.ranking.microservicio_ranking.model.Ranking;
import com.ranking.microservicio_ranking.repository.RankingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class RankingService {

    private final RankingRepository rankingRepository;
    private final AuditoriaClient auditoriaClient;

    public RankingResponseDTO mapToDTO(Ranking ranking){
        return new RankingResponseDTO(
                ranking.getIdUsuario(),
                ranking.getNombre(),
                ranking.getPuntaje()
        );
    }
    public List<RankingResponseDTO> obtenerTodo(){
        return rankingRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public Optional<RankingResponseDTO> buscarPorId(Long id){
        Optional<Ranking> ranking = rankingRepository.findById(id);
        if(ranking.isPresent()){
            return ranking.map(this::mapToDTO);
        }
        throw new RankingNotFoundException("El ranking con id "+id+" no fue encontrado");
    }

    public void guardarRanking(Ranking ranking){
        rankingRepository.save(ranking);
        log.info("Ranking guardado con exito!");
        generarAuditoria("Ranking creado");
    }

    public void generarAuditoria(String detalle){
        AuditoriaRequestDTO dto = new AuditoriaRequestDTO();
        LocalDate ahora = LocalDate.now();
        dto.setDetalle(detalle);
        dto.setFecha(ahora);

        AuditoriaResponseDTO respuesta = auditoriaClient.generarAuditoria(dto);
    }

}
