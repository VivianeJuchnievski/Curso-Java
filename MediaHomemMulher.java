package ExerciciosBasicos;

import java.util.Scanner;

public class MediaHomemMulher {
	
	public static void main(String[] args) {
		
		int sexo;
		int qtMulheres = 0;
		int qtHomens = 0;
		
		float altura;
		float somaH = 0;
		float mediaHomens = 0;
		float maior = 0;
		float menor = 10;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int contador = 0; contador <=10; contador ++) {
			System.out.print("Digite 1 para Mulher ou 2 para Homem:");
			sexo = entrada.nextInt();
			System.out.print("Digite a altura:");
			altura = entrada.nextFloat();
			
			if(sexo == 1) {
				qtMulheres ++;		
				
			} else if(sexo == 2) {
				qtHomens ++;
				somaH = somaH + altura;
				
			} else {
				System.out.println("Número inválido!!!");
			}
			
			if(altura > maior) {
				maior = altura;
			} else if(altura < menor) {
				menor = altura;
			}
			
		}
		mediaHomens = somaH / qtHomens;
		
		System.out.println("A maior altura é de " + maior);
		System.out.println("A menor altura é de " + menor);
		System.out.println("A média de altura dos homens é " + mediaHomens);
		System.out.println("O número de mulheres é " + qtMulheres);
		
		entrada.close();
	}

}
