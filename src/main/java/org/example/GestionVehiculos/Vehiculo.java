package org.example.GestionVehiculos;

public class Vehiculo {
	private String _marca;
	private String _modelo;
	private int _año;
	private double _precio;

	public Vehiculo(String marca, String modelo, int año, double precio) {
		this._marca = marca;
		this._modelo = modelo;
		this._año = año;
		this._precio = precio;
	}

	public String getMarca() {
		return this._marca;
	}

	public void setMarca(String marca) {
		this._marca = marca;
	}

	public String getModelo() {
		return this._modelo;
	}

	public void setModelo(String modelo) {
		this._modelo = modelo;
	}

	public int getAño() {
		return this._año;
	}

	public void setAño(int año) {
		this._año = año;
	}

	public double getPrecio() {
		return this._precio;
	}

	public void setPrecio(double precio) {
		this._precio = precio;
	}

	public void mostrarDetalles() {
		System.out.println("Marca: " + _marca +
				", Modelo: " + _modelo +
				", Año: " + _año +
				", Precio: " + _precio);
	}
}
