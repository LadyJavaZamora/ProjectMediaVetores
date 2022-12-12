package application;
import java.util.Locale;
import java.util.Scanner;

public class ProgramMediaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0.0;
		double media = 0.0;
		
		System.out.println("Usar . como separador de casas digitais ");
		System.out.print("Quantos elementos vai ter o vetor? ");	
        n = sc.nextInt();
	    
	    double [] vetReais = new double[n];
	    
	    for (int i=0; i<vetReais.length; i++) {
			System.out.print("Digite um numero: ");
			vetReais[i]= sc.nextDouble();	
			soma = soma + vetReais[i];
		}
        
	    //Calculando a média
	    media = soma/n;
	    System.out.printf("\nMedia do vetor = %.3f\n", media);	
	    
	    //Verificando e listando elementos abaixo da media
	    System.out.print("Elementos do vetor abaixo da media:");
	    for (int i=0; i<vetReais.length; i++) {
	    	if (vetReais[i] < media) {
	    		System.out.printf("\n%.1f", vetReais[i]);	    		
	    	}
	    }
	    sc.close();
	}
    
}
