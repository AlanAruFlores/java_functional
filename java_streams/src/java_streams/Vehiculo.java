package java_streams;

public class Vehiculo {
	
	private String modelo;
	private String marca;
	private Double precio;
	
	public Vehiculo(String modelo, String marca, Double precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
}
