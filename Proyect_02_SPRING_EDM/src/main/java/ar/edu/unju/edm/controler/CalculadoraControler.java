package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.modelo.Calculadora;

public class CalculadoraControler {
	
	public void resolverSuma() {
		int a;
		int b;
		a = 15;
		b = 20;
	
	Calculadora nuevaCalculadora = new Calculadora();
	
	nuevaCalculadora.setA(a);
	nuevaCalculadora.setB(b);
	
	System.out.println("El resultado de la suma es: "+ nuevaCalculadora.sumar());
	nuevaCalculadora.sumar();
	
	}
}