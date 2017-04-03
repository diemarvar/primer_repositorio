import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void sumartest() 
	{
	Calculadora CA1= new Calculadora();
    float resultado = CA1.sumar(2, 4);   
    System.out.println("2 + 4 =" +resultado);
    assertEquals("Metodo sumarTest", 6.6, resultado, 0);
	}

	
	@Test
	public void restartest()
	{
	Calculadora CA1= new Calculadora();
    float resultado = CA1.restar(4, 1);  
    System.out.println("2 + 4 =" +resultado);
    assertEquals("Metodo sumarTest", 3.0, resultado, 0);
	}
	
	
	@Test
	public void multiplicartest()
	
	{
	Calculadora CA1= new Calculadora();
    float resultado = CA1.multiplicar(2, 4);  
    System.out.println("2 * 4 =" +resultado);
    assertEquals("Metodo sumarTest", 6.6, resultado, 0);
	}
	
	
	
	@Test
	public void dividirtest() 
	
	{
	Calculadora CA1= new Calculadora();
    float resultado = CA1.dividir(2, 4);
    System.out.println("2 / 4 =" +resultado);
    assertEquals("Metodo sumarTest", 6.6, resultado, 0);
	}
	
	
	
	
	
	
}
