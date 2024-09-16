package br.com.rogersantos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
	static List<String> nomes = new ArrayList<String>();
	static String[] vetorNomes = {"Matheus Oliveira","Isabela Ferreira","Lucas Santos","Beatriz Souza","Gustavo Almeida","Mariana Pereira","Pedro Fernandes","Camila Rodrigues","Rafael Cardoso","Adriana Silva","João Vitor Barbosa","Larissa Oliveira","Daniel Souza","Letícia Alves","Thiago Mendes","Juliana Ferreira","Felipe Costa","Gabriela Nascimento","André Pereira","Bruna Rodrigues"};
	
	public static void main(String[] args) {
		insereNomesDoVetor();
		System.out.println(nomes);
		insereNome("Roger Santos");
		System.out.println(nomes);
	}
	
	public static void insereNomesDoVetor() {
		int contador;
		
		for(contador = 0; contador < 20; contador++) {
			nomes.add(vetorNomes[contador]);
		}		
		Collections.sort(nomes);
	}
	
	public static void insereNome(String nome) {
		nomes.add(nome);
		Collections.sort(nomes);
	}

}
