package edu.escuelaing.arep;
import edu.escuelaing.arep.Calculadora;
import org.json.JSONObject;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/calculadoraTrigonometrica", (req, res) ->{
        	String operacion = req.queryParams("operacion");
        	String numero = req.queryParams("numero");
        	JSONObject json = new JSONObject();
        	double resultado = Calculadora.operacion(operacion, numero);
        	json.put("operacion", operacion);
        	json.put("resultado", resultado);
        	return json;
        });
    }
    
    public static int getPort()
    {
    	if(System.getenv("PORT") != null)
    	{
    		return Integer.parseInt(System.getenv("PORT"));
    	}
    	return 4567; 
    }
}
