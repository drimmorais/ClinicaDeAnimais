package br.clinica.animais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	public Scanner ler = new Scanner(System.in);

	private void start() {

		int opcao = 0;
		do {
			System.out.println("\n1 - Cadastrar cavalo");
			System.out.println("2 - Cadastrar girafa");
			System.out.println("3 - Listar cavalos");
			System.out.println("4 - Listar girafas");
			System.out.println("5 - Listar todos os animais");
			System.out.println("6 - Remover um animal por id");
			System.out.println("7 - Quantidade de animais por tipo");
			System.out.println("8 - Sair");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Qual o nome do cavalo? : ");
				String nomeDoCavalo = ler.next();
				System.out.println("Qual é o id do cavalo? : ");
				int idCavalo = ler.nextInt();
				CadastrarCavalo(idCavalo, nomeDoCavalo);
				break;

			case 2:
				System.out.println("Qual o nome da girafa? : ");
				String nomeGirafa = ler.next();
				System.out.println("Qual é o id da girafa? : ");
				int idGirafa = ler.nextInt();
				CadastrarGirafa(idGirafa, nomeGirafa);
				break;
				
			case 3: 
				ListarCavalos();
				break;
				
			case 4:
				ListarGirafas();
				break;
				
			case 5:
				ListarCavalos();
				ListarGirafas();
				break;
				
			case 8:
				System.exit(0);
				break;

			default:
				System.out.println(" Opção inválida!\n\n");
			}

		}while (true);
	}
	
	List<Animais> listCavalo = new ArrayList<Animais>();
	List<Animais> listGirafa = new ArrayList<Animais>();
	
	private void CadastrarCavalo(int id, String nome) {

		Cavalo cavalo = new Cavalo(id, nome);
		
		listCavalo.add(cavalo);
		System.out.println("Seu Cavalo foi adicionado! =D \n O que deseja fazer agora? \n");
	}

	private void CadastrarGirafa(int id, String nome) {

		Girafa girafa = new Girafa (id, nome);
		listGirafa.add(girafa);
		System.out.println("Sua Girafa foi adicionada! =D");
	}
	
	private void ListarCavalos() {
		
		for (Animais cavalo : listCavalo) {
			System.out.println("Id do cavalo: " + cavalo.getId() + " | " + "Nome do cavalo: " + cavalo.getNome());
		}
		
		
	}
	private void ListarGirafas() {
		for (Animais girafa : listGirafa) {
			System.out.println("Id da girafa: " + girafa.getId() + " | " + "Nome da girafa: " + girafa.getNome());
		}
	}
}