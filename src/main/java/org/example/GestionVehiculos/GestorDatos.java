package org.example.GestionVehiculos;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GestorDatos {

	private ObjectMapper objectMapper;

	public GestorDatos() {
		objectMapper = new ObjectMapper();
	}

	// Método para leer vehículos desde un archivo JSON
	public List<Vehiculo> leerVehiculosDesdeArchivo(String aArchivo) {
		try {
			// Lee el archivo y convierte el JSON a una lista de vehículos
			return objectMapper.readValue(new File(aArchivo), objectMapper.getTypeFactory().constructCollectionType(List.class, Vehiculo.class));
		} catch (IOException e) {
			e.printStackTrace();
			return null; // Retorna null en caso de error
		}
	}

	// Método para guardar la lista de vehículos en un archivo JSON
	public void guardarVehiculosEnArchivo(String aArchivo, List<Vehiculo> aVehiculos) {
		try {
			// Escribe los vehículos en el archivo en formato JSON
			objectMapper.writeValue(new File(aArchivo), aVehiculos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
