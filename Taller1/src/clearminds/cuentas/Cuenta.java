package clearminds.cuentas;

public class Cuenta {
	private String Id;
	private String tipo = "A";
	private double saldo;

	public String getId() {
		return Id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(String Id) {
		this.Id=Id;
		setTipo(tipo);
	}
	
	public Cuenta(String Id,String tipo, double saldo) {
		this.Id=Id;
		setTipo(tipo);
		setSaldo(saldo);
	}

	public void imprimir() {
		System.out.println("***********");
		System.out.println("CUENTA");
		System.out.println("***********");
		System.out.println("Numero de Cuenta: "+Id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD"+saldo);
		System.out.println("***********");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("♦♦♦♦♦♦♦♦♦♦♦");
		System.out.println("DATOS DE LA CUENTA");
		System.out.println("                       ");
		System.out.println("Cuenta #: "+Id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD"+saldo);
		System.out.println("♦♦♦♦♦♦♦♦♦♦♦");
	}
}
