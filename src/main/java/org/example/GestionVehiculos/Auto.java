package org.example.GestionVehiculos;

public class Auto extends Vehiculo {
	private int _numPuertas;

	// Constructor que recibe los parámetros de Vehiculo y el específico de Auto
	public Auto(String marca, String modelo, int año, double precio, int numPuertas) {
		super(marca, modelo, año, precio); // Llama al constructor de Vehiculo
		this._numPuertas = numPuertas; // Inicializa el atributo específico
	}

	public int getNumPuertas() {
		return this._numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this._numPuertas = numPuertas;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Marca: " + getMarca() +
				", Modelo: " + getModelo() +
				", Año: " + getAño() +
				", Precio: " + getPrecio() +
				", Número de Puertas: " + _numPuertas);
	}
}
