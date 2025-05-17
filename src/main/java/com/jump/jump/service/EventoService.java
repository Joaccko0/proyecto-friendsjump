package com.jump.jump.service;
import com.jump.jump.model.Evento;
import com.jump.jump.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public Evento findByFechaYSucursal (LocalDate fecha, Long idSucursal){
        return this.eventoRepository.findByEventoId_FechaAndEventoId_IdSucursal(fecha,idSucursal)
                    .orElse(null);
    }
    public List<Evento> findByEventoByFecha(LocalDate fecha){
        return this.eventoRepository.findByEventoId_Fecha(fecha);
    }
    public List<Evento> findByEventoByIdSucursal(Long idSucursal){
        return this.eventoRepository.findByEventoId_IdSucursal(idSucursal);
    }
    public void saveEvento(Evento evento){
        this.eventoRepository.save(evento);
    }
    public void deleteEvento(Evento evento){
        this.eventoRepository.delete(evento);
    }

}
