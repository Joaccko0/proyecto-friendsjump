package com.jump.jump.serviceTest;
import com.jump.jump.model.Empleado;
import com.jump.jump.model.Sucursal;
import com.jump.jump.repository.EmpleadoRepository;
import com.jump.jump.service.EmpleadoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class EmpleadoServiceTest {
    @Mock
    EmpleadoRepository empleadoRepository;

    @InjectMocks
    EmpleadoService empleadoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void testFindByDNIEmpleado() {
        Sucursal s1 = new Sucursal("Napole", "Peru", "4359", "2215741231", "Berisso");
        Empleado empleado1 = new Empleado("4522", "lol", "cow", "112", "123", s1);

        // Simular el comportamiento del repositorio
        when(empleadoRepository.findById("4522")).thenReturn(Optional.of(empleado1));

        // Ejecutar el método del servicio
        Empleado result = empleadoService.findByDNIEmpleado("4522");

        // Validar el resultado
        assertNotNull(result);
        assertEquals("4522", result.getDni());
    }
    @Test
    void testGetAllBySucursal() {
        Sucursal s1 = new Sucursal("Napole", "Peru", "4359", "2215741231", "Berisso");
        Empleado empleado1 = new Empleado("4522", "lol", "cow", "112", "123", s1);

        // Simular el comportamiento del repositorio
        when(empleadoRepository.findBySucursal(s1)).thenReturn(List.of(empleado1));

        // Ejecutar el método del servicio
        List<Empleado> result = empleadoService.getAllEmpleadoBySucursal(s1);

        // Validar el resultado
        assertEquals(1, result.size());
        assertEquals("4522", result.get(0).getDni()); // Validar que se obtiene el empleado correcto
    }
}
