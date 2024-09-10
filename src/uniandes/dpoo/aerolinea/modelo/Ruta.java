package uniandes.dpoo.aerolinea.modelo;
import java.lang.Math;


/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
	private String codigoRuta;
	private Aeropuerto destino;
	private String horaLlegada;
	private String horaSalida;
	private Aeropuerto origen;
	
	public Ruta(Aeropuerto origen, Aeropuerto destino, java.lang.String horaSalida, 
			java.lang.String horaLlegada, java.lang.String codigoRuta)
	{
		this.codigoRuta = codigoRuta;
		this.destino = destino;
		this.horaLlegada = horaLlegada;
		this.horaSalida = horaSalida;
		this.origen = origen;
	}
    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    public String getCodigoRuta() {
    	return this.codigoRuta;
    }
    
    public Aeropuerto getOrigen() {
    	return this.origen;
    }
    
    public Aeropuerto getDestino() {
    	return this.destino;
    }
    
    public String getHoraSalida() {
    	return this.horaSalida;
    }
    
    public String getHorallegada() {
    	return this.horaLlegada;
    }
    
    public String getDuración() {
    	int hInicio = getHoras(this.horaSalida);
    	int mInicio = getHoras(this.horaSalida);
    	int hLlegada = getHoras(this.horaLlegada);
    	int mLlegada = getHoras(this.horaLlegada);
    	int deltaH = Math.abs((hLlegada - hInicio))*60;
    	int deltam = Math.abs((mLlegada - mInicio));
    	int deltaTot = (deltaH + deltam);
    	return Integer.toString(deltaTot);
    }
    
}
