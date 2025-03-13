package java_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(new Vehiculo("modelo1","marca1",400.0));
		vehiculos.add(new Vehiculo("modelo2","marca2",600.0));
		vehiculos.add(new Vehiculo("modelo3","marca3",800.0));
		
		

		System.out.println("ASCENDENTE");
		/*
		 * Obtener vehiculo ordenados por su costo
		 * */
		List<Vehiculo> vehiculosOrdenados = vehiculos.stream()
				.sorted(Comparator.comparing(Vehiculo::getPrecio))
				.toList();
		
		vehiculosOrdenados.forEach(System.out::println);
		
		
		System.out.println("\n\nDESCENDENTE");
		/*
		 * 	Obtener vehiculos ordenados por su costo de manera descendente
		 * */
		List<Vehiculo> vehiculosDesc = vehiculos.stream()
				.sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
				.toList();
		vehiculosDesc.forEach(System.out::println);
		
		
		
		/*
		 * Ordenar por precio y marca
		 * */
		System.out.println("\n\n ORDENADOS POR MARCA Y PRECIO");

		List<Vehiculo> vehiculosOrdMarcaPrecio = vehiculos.stream()
				.sorted(Comparator.comparing(Vehiculo::getPrecio).thenComparing(Vehiculo::getPrecio))
				.toList();
		
		vehiculosOrdMarcaPrecio.forEach(System.out::println);
		
		
		/*
		 * Obtener vehiculos con precios mayores o iguales a 600
		 * */
		System.out.println("\n\n VEHICULOS CON PRECIOS MAYORES O IGUALES A 600");

		List<Vehiculo> vehiculosMayorPrecios = vehiculos.stream()
				.filter(v -> v.getPrecio()>=600)
				.toList();
		
		vehiculosMayorPrecios.forEach(System.out::println);
		
		/*
		 * Obtener vehiculos con precios menores a 600
		 * */
		System.out.println("\n\n VEHICULOS CON PRECIOS MENORES A 600");

		List<Vehiculo> vehiculosMenorPrecios = vehiculos.stream()
				.filter(v -> v.getPrecio()<600)
				.toList();
		
		vehiculosMenorPrecios.forEach(System.out::println);
	
		
		/*
		 * Sacar promedio de los vehiculos
		 * */
		double promedio = vehiculos.stream()
				.mapToDouble(Vehiculo::getPrecio)
				.average().orElse(0);
		
		System.out.println("\n\nEl promedio de los precios es: "+promedio);
	}
	
}
