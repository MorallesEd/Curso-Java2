package operadores;

import javax.swing.JOptionPane;

public class Operadores {

	public static void main(String[] args) {
		/*
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		*/
		
		/* Condições lógicas com IF e ELSE */
		/*
		if(media >= 70){
			System.out.println("Aprovado, sua media foi: " + media);
		}else if(media >= 40 && media <= 69){
			System.out.println("Recuperação, sua média foi: " + media);
		}else{
			System.out.println("Reprovado, sua média foi:  " + media);
		}
		*/
		/* Operadores ternários, para micro validações */
		/*
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno Recuperação" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);
		*/
		
		/*Operações lógicas aninhadas: são operações dentro de operaçoes*/
		/*
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aprovado direto com louvor, sua media foi: " + media);
				}else {
					System.out.println("Aprovado direto, sua media foi: " + media);
				}
			}else {
				System.out.println("Recuperação, sua media foi: " + media);
			}
		}else {
			System.out.println("Reprovado direto, sua media foi: " + media);
		}
		*/
		/*SWITCH CASE: OPERAÇÕES EXATAS*/
		/*
		int dia = 5;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-feira");
			break;	

		default: System.out.println("Outro dia qualquer");
			break;
		}
		*/
		/*OPERADORES RELACIONAIS*/
		/*		
		int nota1 = 90;
		int nota2 = 90;
		
		if (nota1 == nota2) {
			System.out.println("Sim, as notas são iguais");
		}else {
			System.out.println("Não, as notas não são iguais");
		}
		*/
		/*
		int nota1 = 90;
		int nota2 = 90;
		
		if (nota1 != nota2) {
			System.out.println("Não, as notas são iguais");
		}else {
			System.out.println("Sim, as notas não são iguais");
		}
		*/
		/*
		int nota1 = 90;
		int nota2 = 80;
		
		if (nota1 > nota2) {
			System.out.println("Sim, nota1 e maior que nota2");
		}else {
			System.out.println("Não, nota1 e menor que nota2");
		}
		
		
		int nota1 = 70;
		int nota2 = 80;
		
		if (nota1 < nota2) {
			System.out.println("Sim, nota1 e menor que nota2");
		}else {
			System.out.println("Não, nota1 e maior que nota2");
		}
		*/
		
		/*ESTRUTURAS DE REPETIÇÃO WHILE*/
		/*
		int numero = 0; 
		
		while (numero <= 10) {
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		
				
		int numero2 = 0;
		
		do {
			System.out.println("O número atual é: " + numero2);
			numero2++;
		}while (numero2 <= 10);
		*/
		
		/*ESTRUTURAS DE REPETIÇÃO FOR*/
		/*
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("O número atual é: " + numero);
				
		for (int numero = 10; numero >= 0; numero--) {
			System.out.println("O número atual é: " + numero);
		}
		}*/
		
		/*ESTRUTURAS DE REPETIÇÃO FOR COM BREAK (PARADA)*/
		/*
		for (int numero = 10; numero >= 0; numero--) {
			if(numero == 7) {
				System.out.println("Blz, achei o número que eu queria!!! O número " + numero);
				System.out.println("Portanto, irei parar de executar ... ");
				break;
			}
		}*/
		
		/*ESTRUTURAS DE REPETIÇÃO FOR COM CONTINUE*/
		/*
		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Blz, achei o número que eu queria, que é o " + numero);
				continue;
				
			}
			System.out.println("Processando o laço de repetição ...");
		}*/
		
		/*MÓDULO: RESTO DA DIVISÃO (%)*/
		/*
		double carros = 9;
		double pessoas = 2;
		
		double resto = carros % pessoas;
		
		System.out.println("Sobraram exatamente: " + resto + " carros.");
		*/
		
		/*CRIANDO NOSSA ENTRADA DE DADOS*/
		/*
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de compradores: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;

		JOptionPane.showMessageDialog(null, "Foram dividos " + divisao + " carros para os " + pessoas + " compradores e restou " + resto + " carro.");
		*/
		
		/*CRIANDO UMA OPÇÃO DE CONFIRMAÇÃO*/
		/*
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de compradores: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showConfirmDialog(null, "Divisão para as pessoas deu: " + divisao);
		}else {
			System.out.println("Não quis ver o resultado da operação!!!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showConfirmDialog(null, "O resto da divisão é: " + resto);
		}else {
			System.out.println("Não quis ver o resultado da operação!!!");
		}

		JOptionPane.showMessageDialog(null, "Foram dividos " + divisao + " carros para os " + pessoas + " compradores e restou " + resto + " carro.");
		*/
		
		/*CRIANDO UM PROGRAMA DE CÁLCULO DE MÉDIA*/
		
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota: ");
		
		double nota1Numero = Double.parseDouble(nota1);
		double nota2Numero = Double.parseDouble(nota2);
		double nota3Numero = Double.parseDouble(nota3);
		double nota4Numero = Double.parseDouble(nota4);
		
		double media = (nota1Numero + nota2Numero + nota3Numero + nota4Numero) / 4;
		
		if (media >=50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está APROVADO com a média: " + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno está de RECUPERAÇÃO com a média: " + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno está REPROVADO com a média: " + media);
		}		
		
		
		
		
		
	}

}