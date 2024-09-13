package uniandes.dpoo.aerolinea.modelo.tarifas;
import java.util.Random;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{

	protected int COSTO_POR_KM_CORPORATIVO = 11;
	protected int COSTO_POR_KM_NATURAL = 14;
	protected double DESCUENTO_GRANDES = 0.45;
	protected double DESCUENTO_MEDIANAS = 0.3;
	protected double DESCUENTO_PEQ = 0.15;
	private Random rand = new Random();
	
	
	public CalculadoraTarifasTemporadaBaja() {
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
