package java_streams;

public class VehiculoDTO {
	private String modelo;
	private String marca;
	
	public VehiculoDTO() {
		super();
	}
	
	public VehiculoDTO(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
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

	@Override
	public String toString() {
		return "VehiculoDTO [modelo=" + modelo + ", marca=" + marca + "]";
	}
	
}
