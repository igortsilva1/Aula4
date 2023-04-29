
public class CalcSac {
	
	public static void calc(double valorFinc,double juros, int meses){
		
		double amortizacao = valorFinc/meses;
		double parcela;
		double jurosPorcent = juros/100;
		double total = 0;
		
		
		for(int i=0; i<meses; i++){
			parcela = Math.round(amortizacao + jurosPorcent*(valorFinc-i*amortizacao));
			System.out.println((i+1)+"ª parcela: "+parcela);
			total = total + parcela;
			
		}
	System.out.println("O valor final total é: "+ total);
	
	}
	


}
