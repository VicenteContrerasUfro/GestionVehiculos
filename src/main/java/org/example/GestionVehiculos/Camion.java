package org.example.GestionVehiculos;

public class Camion extends Vehiculo {
	private double _capacidadCarga;

	// Constructor que recibe los parámetros de Vehiculo y el específico de Camion
	public Camion(String marca, String modelo, int año, double precio, double capacidadCarga) {
		super(marca, modelo, año, precio); // Llama al constructor de Vehiculo
		this._capacidadCarga = capacidadCarga; // Inicializa el atributo específico
	}

	public double getCapacidadCarga() {
		return this._capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this._capacidadCarga = capacidadCarga;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Marca: " + getMarca() +
				", Modelo: " + getModelo() +
				", Año: " + getAño() +
				", Precio: " + getPrecio() +
				", Capacidad de Carga: " + _capacidadCarga + " toneladas");
	}
}