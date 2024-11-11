package org.example.GestionVehiculos;

public class Bicicleta extends Vehiculo {
	private String _tipoBicicleta;

	// Constructor que recibe los parámetros de Vehiculo y el específico de Bicicleta
	public Bicicleta(String marca, String modelo, int año, double precio, String tipoBicicleta) {
		super(marca, modelo, año, precio); // Llama al constructor de Vehiculo
		this._tipoBicicleta = tipoBicicleta; // Inicializa el atributo específico
	}

	public String getTipoBicicleta() {
		return this._tipoBicicleta;
	}

	public void setTipoBicicleta(String tipoBicicleta) {
		this._tipoBicicleta = tipoBicicleta;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Marca: " + getMarca() +
				", Modelo: " + getModelo() +
				", Año: " + getAño() +
				", Precio: " + getPrecio() +
				", Tipo de Bicicleta: " + _tipoBicicleta);
	}
}
