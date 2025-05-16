package com.jump.jump.service;

import com.jump.jump.model.Propietario;
import com.jump.jump.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioService {
    @Autowired
    public PropietarioRepository propietarioRepository;

    public Propietario getPropietarioByDni(String dni){
        return propietarioRepository.findById(dni).orElse(null);
    }
    public List<Propietario> getAllPropietarios(){
        return propietarioRepository.findAll();
    }
    public void deletePropietario(Propietario propietario){
        this.propietarioRepository.delete(propietario);
    }
    public void savePropietario(Propietario propietario){
        this.propietarioRepository.save(propietario);
    }
}
