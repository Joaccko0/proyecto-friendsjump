package com.jump.jump.service;


import com.jump.jump.model.Entrada;
import com.jump.jump.model.Sucursal;
import com.jump.jump.repository.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EntradaService {
    @Autowired
    EntradaRepository entradaRepository;

    //Busqueda en un rango de fechas
    public List<Entrada> findByFechaBetween (LocalDate startDate, LocalDate endDate){
        return this.entradaRepository.findByEntradaId_FechaBetween(startDate, endDate);
    }
    //Busqueda de todas las Entradas por una sucursal
    public  List<Entrada> findBySucursal (Sucursal sucursal){
        return this.entradaRepository.findBySucursal(sucursal);
    }
    //Busqueda de Todas las entradas
    public List<Entrada> findAllEntradas (){
        return this.entradaRepository.findAll();
    }
    //Busqueda por Correo Todas las entradas de un responsable
    public List<Entrada> findByCorreoResponsable (String correoResponsable){
            return entradaRepository.findByCorreoResponsableAsociado(correoResponsable);
    }
    //Busqueda por Correo de un Responsable en una fecha determinada
    public Entrada findByCorreoResponsableAndFecha (String correoReponsable, LocalDate fecha){
        return this.entradaRepository.findByCorreoResponsableAsociadoAndEntradaId_Fecha(correoReponsable, fecha).orElse(null);
    }
    //Busqueda de todas las entradas en una fecha especifica
    public List<Entrada> findByFecha (LocalDate fecha){
        return this.entradaRepository.findByEntradaId_Fecha(fecha);
    }
    //SaveEntrada
    public void saveEntrada (Entrada entrada){
        this.entradaRepository.save(entrada);
    }
    //RemoveEntrada
    public void deleteEntrada(Entrada entrada){
        this.entradaRepository.delete(entrada);
    }
}