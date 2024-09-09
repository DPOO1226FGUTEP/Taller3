package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;
import java.util.ArrayList;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
private List<Tiquete> tiquetesSinUsar;
private List<Tiquete> tiquetesUsados;

	public Cliente() {
		this.tiquetesSinUsar = new ArrayList<Tiquete>();
		this.tiquetesUsados = new ArrayList<Tiquete>();
	}

	public abstract String getTipoCliente();
	public abstract String getIdentificador();
	
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes() {
		int total = 0;
		for (Tiquete ticket: tiquetesSinUsar) {
			total += ticket.getTarifa();
		}
		return total;
	}
		
	public void usarTiquetes(Vuelo vuelo){
		for (Tiquete ticket: tiquetesSinUsar) {
			if (ticket.getVuelo() == vuelo) {
				tiquetesUsados.add(ticket);
				tiquetesSinUsar.remove(ticket); // Asegurarse que esto se pueda usar aquí
			}
		}
	}
}
