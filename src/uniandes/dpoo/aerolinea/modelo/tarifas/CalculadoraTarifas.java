package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import java.util.Random;


public abstract class CalculadoraTarifas {
	static double IMPUESTO = 19.7; 
	private Random rand = new Random();
	
	public CalculadoraTarifas() {
	}
	
	protected abstract int calcularCostoBase​(Vuelo vuelo , Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento​(Cliente cliente);
	
	protected int calcularDistanciaVuelo​(Ruta ruta) {
		int distancia = rand.nextInt(1001);
		return distancia;
	}
	
	protected int calcularValorImpuestos​(int costoBase) {
		int total = (int) (costoBase * (1 + IMPUESTO));
		return total;
	}
	
	public int calcularTarifa​(Vuelo vuelo, Cliente cliente) {
		int costoBase = calcularCostoBase​(vuelo , cliente);
		double dcto = calcularPorcentajeDescuento​(cliente);
		int total = (int)(costoBase*(1-dcto));
		return total;
		
	}
	
	
}
