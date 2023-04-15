package Lista3;

import java.util.Scanner;

public class Lista3Questao9 {
	
	public static int [] ordenação (int [] numeros, int tamanho) {
		
	    int [] ordem = new int[numeros.length];
		int min;
		int aux;
		
		
		for(int i = 0; i < tamanho; i++) {
			
			ordem [i] = numeros[i];
			
		}	
		
	    for(int i=0; i<tamanho-1; i++ ) {
	    	min = i;
	    	for (int j = (i+1); j < tamanho; j++) {
	    		if(ordem[j] < ordem[min]) {
	    	        min = j;
	             }
	    	}
	    	if(i != min) {
	    		aux = ordem[i];
	    		ordem[i] = ordem[min];
	    		ordem[min] = aux;    		
	    }	    	
	    	
	    }
		return ordem;
	}
	
	public static int Kvalor (int [] vetor, int k) {
		//verifica se K e menor ou igual o tamanho do vetor
		if(k < 1 ||  k > vetor.length) {
			
			return -1;
			
		}
		
		 for (int i = 0; i < k; i++) {
		        int min = i;
		        for (int j = i + 1; j < vetor.length; j++) {
		            if (vetor[j] < vetor[min]) {
		                min = j;
		            }
		        }
		    // troca o elemento mínimo com o primeiro elemento não ordenado
		        
		        int aux = vetor[i];
		        vetor[i] = vetor[min];
		        vetor[min] = aux;
		    }

		    // retorna o k-ésimo menor elemento
		    return vetor[k - 1];
	}
	
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
			
			System.out.println("Escolha o tamanho do vetor:");
			int tamanho = scanner.nextInt();
			
			int [] vetor = new int [tamanho];
			
			System.out.println("Escolha os numeros para compor o seu vetor:");
			
			for(int i = 0; i<tamanho; i++) {
				
				System.out.println(+( i +1)+ "°");
				
				vetor[i] = scanner.nextInt();
				
				//escolher o K-esimo maior valor
				
			}
				System.out.println("Escolha o valor de K:");
				int k = scanner.nextInt();

				int kValor = Kvalor(vetor, k);

				if (kValor == -1) {
				    System.out.println("O valor de K é inválido");
				} else {
				    System.out.println("O " + k + "º menor valor é: " + kValor);
				}
				
				scanner.close();
		}		

}
