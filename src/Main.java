import java.util.Scanner;


public class Main {

	public static void main(String args[]){
		
		double valorFinc;
		double juros;
		int meses;
		
		Scanner sc = new Scanner(System.in);
		Colector ct = new Colector();
		
		System.out.println("Entre com o valor do financiamento: ");
		valorFinc = sc.nextDouble();
		ct.setValorFinc(valorFinc);
		
		System.out.println("Entre com o valor do juros: ");
		juros = sc.nextDouble();
		ct.setJuros(juros);
		
		System.out.println("Entre com a quantidade de meses: ");
		meses = sc.nextInt();
		ct.setMeses(meses);
		
		CalcSac.calc(ct.getValorFinc(),ct.getJuros(),ct.getMeses());
		
		
	
		
		
		
		
	}
	
}
	
