package uniandes.dpoo.aerolinea.modelo;

import java.util.Map;
import java.util.Collection;

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
	
	public int venderTiquetes(Cliente cliente, calculadoraTarifas calculadora, itn cantidad) 
			throws VueloSobrevendidoException{
		// TODO Implementar esta basura
	}
	
	public boolean equals(Object obj) {
		//???? if (obj == )
	}
	
}
