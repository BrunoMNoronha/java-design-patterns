package strategy;

public class CalculadoraDaImposto {
	
	public void calcula(Orcamento orcamento, Imposto imposto) {
		
		double resultado = imposto.calcula(orcamento);
		System.out.println(resultado);
	}

}