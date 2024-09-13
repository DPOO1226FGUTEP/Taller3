package uniandes.dpoo.aerolinea.modelo;

import java.util.Map;
import java.util.Collection;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

	private Ruta ruta;
	private String fecha;
	private Avion avion;
	private Map<String, Tiquete> tiquetes; 
	
	public Vuelo(Ruta ruta, String fecha, Avion avion){
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
	}
	
	public Ruta getRuta() {
		return this.ruta;
	}

	public String getFecha() {
		return this.fecha;
	}
	
	public Avion getAvion() {
		return this.avion;
	}
	
	public Collection<Tiquete> getTiquetes() {
		return this.tiquetes.values();
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException{
		int valorTotal = 0;
		for (int i = 0; i <= cantidad; i++) {
			int valorTiquete = calculadora.calcularTarifa​(this, cliente);
			valorTotal += valorTiquete;
		}
		return valorTotal;
	}
	

	
}
