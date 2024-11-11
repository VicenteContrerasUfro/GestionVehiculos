package org.example.GestionVehiculos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AutomotoraTest {

    private Automotora automotora;

    @BeforeEach
    public void setUp() {
        automotora = new Automotora();
    }

    @Test
    public void testAgregarVehiculo() {
        // Crear un vehículo para agregar
        Auto auto = new Auto("Toyota", "Corolla", 2020, 20000, 4);
        automotora.agregarVehiculo(auto);

        // Verificar que el vehículo se ha agregado
        assertEquals(1, automotora._vehiculos.size());
        assertTrue(automotora._vehiculos.contains(auto));
    }

    @Test
    public void testListarVehiculos() {
        // Crear vehículos
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 20000, 4);
        Camion camion1 = new Camion("Mercedes", "Actros", 2018, 45000, 12);
        automotora.agregarVehiculo(auto1);
        automotora.agregarVehiculo(camion1);

        // Listar vehículos y verificar el tamaño de la lista
        automotora.listarVehiculos();
        assertEquals(2, automotora._vehiculos.size());
    }

    @Test
    public void testMostrarDetallesVehiculos() {
        // Crear vehículos
        Auto auto = new Auto("Toyota", "Corolla", 2020, 20000, 4);
        Camion camion = new Camion("Mercedes", "Actros", 2018, 45000, 12);

        // Agregar vehículos
        automotora.agregarVehiculo(auto);
        automotora.agregarVehiculo(camion);
        automotora.mostrarDetallesVehiculos();
        assertTrue(true);
    }

    @Test
    public void testCargarDatos() {
        // Crear y agregar vehículos
        Auto auto = new Auto("Toyota", "Corolla", 2020, 20000, 4);
        automotora.agregarVehiculo(auto);
        automotora.cargarDatos();
        assertEquals(1, automotora._vehiculos.size());
    }

    @Test
    public void testGuardarDatos() {
        // Crear y agregar vehículos
        Auto auto = new Auto("Toyota", "Corolla", 2020, 20000, 4);
        automotora.agregarVehiculo(auto);
        automotora.guardarDatos();
        assertEquals(1, automotora._vehiculos.size());
    }
}

