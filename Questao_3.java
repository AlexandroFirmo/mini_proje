package atividadeJava;

import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("digite dois numeros: ");
		int n1= ler.nextInt();
		int n2= ler.nextInt();
		int soma=0;
		int cont =0;
		for(int x=n1; x < n2;x++){
			if (x >= 0){
				soma += x;
				cont++;
				
				if(x %2 != 2){
					System.out.println("O numero de interiro impar" + x);
				}
			}
			if (x %2 == 2){
				System.out.println("Par"+x);
			}else{
				System.out.println("È impar"+x);
			}
			
		}
	}

}
