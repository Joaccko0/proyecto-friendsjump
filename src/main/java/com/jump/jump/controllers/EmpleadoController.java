package com.jump.jump.controller;

import com.jump.jump.model.Empleado;
import com.jump.jump.model.Sucursal;
import com.jump.jump.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    // Obtener todos los empleados
    @GetMapping
    public List<Empleado> getAllEmpleados() {
        return empleadoService.getAllEmpleado();
    }

    // Obtener un empleado por DNI
    @GetMapping("/{dni}")
    public Empleado getEmpleadoByDni(@PathVariable String dni) {
        return empleadoService.findByDNIEmpleado(dni);
    }

    // Obtener empleados por sucursal (pasando idSucursal como parámetro de URL)
    @GetMapping("/sucursal/{idSucursal}")
    public List<Empleado> getEmpleadosBySucursal(@PathVariable Long idSucursal) {
        return empleadoService.getAllEmpleadoBySucursal(idSucursal);
    }

    // Crear un nuevo empleado
    @PostMapping
    public void createEmpleado(@RequestBody Empleado empleado) {
        empleadoService.saveEmpleado(empleado);
    }
}