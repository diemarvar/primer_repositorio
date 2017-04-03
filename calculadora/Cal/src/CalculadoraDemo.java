
public class CalculadoraDemo {

	public static void main(String[] args) {
		
		Calculadora CA1=new Calculadora();
		
		int a=1;
		int b=2;
		
		System.out.println("a + b = "+CA1.sumar(3, 2));
		System.out.println("a - b = "+CA1.restar(3, 2));
		System.out.println("a * b = "+CA1.multiplicar(3, 2));
		System.out.println("a / b = "+CA1.dividir(3, 2));
		
	}

}
