package edu.escuelaing.arep;

public class Calculadora 
{
	public static double operacion(String operacion, String numero)
	{
	        double resultado = 0;

	        if (operacion == "sin")
	        {
	        	resultado = Math.sin(Double.parseDouble(numero));
	        }
	        else if(operacion == "cos")
	        {
	        	resultado = Math.cos(Double.parseDouble(numero));
	        }
	        else
	        {
	        	resultado = Math.tan(Double.parseDouble(numero));
	        }

	        return resultado;
	    }
}
