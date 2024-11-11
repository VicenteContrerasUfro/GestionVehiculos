package org.example.GestionVehiculos;

import java.util.List;
import java.util.Vector;

public class Automotora {
	// Lista de vehículos gestionados por la automotora
    List<Vehiculo> _vehiculos = new Vector<>();

	// Relación con GestorDeDatos para cargar y guardar datos
	public GestorDatos _gestorDatos;

	public void agregarVehiculo(Vehiculo aVehiculo) {
		_vehiculos.add(aVehiculo);
	}

	public void listarVehiculos() {
		if (_vehiculos.isEmpty()) {
			System.out.println("No hay vehículos registrados.");
		} else {
			for (Vehiculo vehiculo : _vehiculos) {
				System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " (" + vehiculo.getAño() + ")");
			}
		}
	}

	public void mostrarDetallesVehiculos() {
		for (Vehiculo vehiculo : _vehiculos) {
			vehiculo.mostrarDetalles();
		}
	}
	public void cargarDatos() {
		_vehiculos = _gestorDatos.leerVehiculosDesdeArchivo("vehiculos.json");
	}

	public void guardarDatos() {
		_gestorDatos.guardarVehiculosEnArchivo("vehiculos.json", _vehiculos);
	}
}
