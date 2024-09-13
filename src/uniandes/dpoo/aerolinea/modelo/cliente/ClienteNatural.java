package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteNatural extends Cliente
{
	static String Natural = "Natural";
	private String nombre;
	
    public ClienteNatural(String nombre) {
    	this.nombre = nombre;
    }
    
    
    @Override
    public String getIdentificador() {
    	int hashCode = this.hashCode();
    	String cosaFea = String.valueOf(hashCode);
    	return cosaFea;
    	}
    
    @Override
    public String getTipoCliente() {
    	return Natural;
    }
  
    
    /**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteNatural cargarDesdeJSON( JSONObject cliente )
    {
        String nom = cliente.getString( "nombre" );
        return new ClienteNatural(nom);
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombre", this.nombre );
        return jobject;
    }
}
