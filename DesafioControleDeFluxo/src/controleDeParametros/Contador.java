package controleDeParametros;

import java.util.Scanner;


public class Contador { 
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt(); // Corrigido para capturar a entrada

		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt(); // Corrigido para capturar a entrada

		try {
			// Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}

		terminal.close(); // Fechando o Scanner para evitar vazamento de memória
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// Verifica se parametroUm é maior que parametroDois
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException(); // Lança a exceção personalizada
		}

		int contagem = parametroDois - parametroUm; // Define a quantidade de vezes para contar

		// Loop para imprimir os números
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Contagem: " + i);
		}
	}
}

// Criando a exceção personalizada
class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException() {
		super("Parâmetros inválidos: o primeiro número não pode ser maior que o segundo.");
	}
}
