package uniandes.dpoo.aerolinea.modelo.tarifas;
import java.util.Random;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas{

	protected int COSTO_POR_KM = 15;
	private Random rand = new Random();
	
	public CalculadoraTarifasTemporadaAlta() {
	}
	
	@Override
	public int calcularCostoBase​(Vuelo vuelo,Cliente cliente) {
		Ruta ruta = vuelo.getRuta();
		int distancia = calcularDistanciaVuelo​(ruta);
		int costo = distancia * COSTO_POR_KM;
		return costo;
	}
	
	@Override
	public double calcularPorcentajeDescuento​(Cliente cliente) {
		double random = rand.nextDouble();
		return random;
	}
}
