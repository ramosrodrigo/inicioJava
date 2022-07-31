public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 11110);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 22220);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("Cc: " + cc.getSaldo());
		System.out.println("Cp: " + cp.getSaldo());
		
	}
	
}
