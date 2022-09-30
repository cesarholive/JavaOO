
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 3333);
		cc.deposita(100);
		
		SeguroDeVideo seguro = new SeguroDeVideo();
		
		CalculadorDeImposto cal = new CalculadorDeImposto();
		
		cal.registrar(cc);
		cal.registrar(seguro);
		
		System.out.println(cal.getTotalImposto());

	}

}
