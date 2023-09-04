package matriz;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	        double[][] matriz = new double[10][4];
	        double[] vetor = new double[10];
	        double soma;
	        for (int i = 0; i < 10; i++) {
	            soma = 0;
	            for (int j = 0; j < 4; j++) {
	                System.out.println("Digite a nota do participante " + (i + 1) + " no bimestre " + (j + 1) + ":");
	                matriz[i][j] = sc.nextDouble();
	                soma += matriz[i][j];
	            }
	            vetor[i] = soma / 4;
	        }
	        sc.close();
	        for (int i = 0; i < 10; i++) {
	            System.out.println("A média do participante " + (i + 1) + " é: " + vetor[i]);
	        }
	}
	}

