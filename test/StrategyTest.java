package test;

import strategy.CalculadoraDaImposto;
import strategy.ICMS;
import strategy.ISS;
import strategy.Imposto;
import strategy.Orcamento;

public class StrategyTest {
	
	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500);
		
		CalculadoraDaImposto calculadora = new CalculadoraDaImposto();
		
		calculadora.calcula(orcamento, iss);
		calculadora.calcula(orcamento, icms);
		
	}

}