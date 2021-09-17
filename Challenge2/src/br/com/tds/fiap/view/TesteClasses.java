package br.com.tds.fiap.view;

import java.util.Scanner;

import br.com.tds.fiap.bean.Diario;
import br.com.tds.fiap.bean.GuardarDados;
import br.com.tds.fiap.bean.Meditacao1;
import br.com.tds.fiap.bean.Relogio1;
import br.com.tds.fiap.bean.Usuario1;
public class TesteClasses {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int op = 0;
		
		do {
			//pedir opçoes pro usuario
			System.out.println("Bem vindo ao menu Polaris, escolha abaixo qual classe você quer testar.\n"
					+ "Escolha pelo numero: \n"
					+ "1 - Classe usuario\n"
					+ "2 - Classe meditação\n"
					+ "3 - Classe relogio\n"
					+ "4 - Classe diario\n"
					+ "0 - Para sair da aplicação\n");
			op = scan.nextInt();
			
			
			switch (op) {
			//class usuario
			 	case 1:
			 		Scanner leitor = new Scanner(System.in);
					
					
					System.out.println("Bem vindo ao programa Calm Down");
					
					System.out.println("Qual o nome do usuário?");
					String nome = leitor.next() + leitor.nextLine();
					
					System.out.println("Qual o dia em que nasceu?");
					int diaNascimento = leitor.nextInt();
					
					System.out.println("Qual o mês em nasceu?");
					String mesNascimento = leitor.next();
					
					System.out.println("Qual o ano em que nasceu?");
					int anoNascimento = leitor.nextInt();
					
					System.out.println("Qual o email do usuário?");
					String email = leitor.next() + leitor.nextLine();
					
					System.out.println("O usuário permite o armazenamento de dados?\n"
							+ "Escreva entre aprova(para sim) ou não aprova(para não)");
					String aprovacao = leitor.next() + leitor.nextLine();
					
					GuardarDados guardarDados = new GuardarDados(aprovacao);
					guardarDados.setAprovacao(aprovacao);
					Usuario1 usuario = new Usuario1(nome, email, diaNascimento, diaNascimento, anoNascimento, guardarDados);
				

					String exibirDados = usuario.exibirDados();
					System.out.println(exibirDados);
					System.out.println("\n");
			 		break;
			 	
			 //class meditacao
			 	case 2:
			 		//instanciando o scanner
					Scanner in = new Scanner(System.in);
					Meditacao1 meditacao = new Meditacao1();
					
					System.out.println("Olá seja bem vindo(a) ao canal de meditação Polaris!\n"
							+ "Aqui você irá aprender como meditar sendo um iniciante.");
					
					System.out.println("Durante quanto tempo, em minutos, você gostaria de meditar?");
					int programarHorario = in.nextInt();

					
					System.out.println("Vamos começar em 3 segundos, ok?");
					//responde qualquer coisa
					String confirmacao = in.next() + in.nextLine();
					int tempo = 0;
					//repete a contagem
					while (tempo < (programarHorario * 60)) {
					for (int i=0+1; i <= 3 ; i++)
						try {
							Thread.sleep(1000);
							System.out.println(i);
						}catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println("Inspire durante 3 segundos");
				
					for (int i=0+1; i <= 3 ; i++)
						try {
							Thread.sleep(1000);
							System.out.println(i);
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Expire durante 3 segundos");
					tempo+=6;
					}
					System.out.println("Obrigado por ter chegado aqui. \n");
			 		break;
			
			//class relogio
			 	case 3:
			 		Scanner leitora = new Scanner(System.in);
					Relogio1 relogio = new Relogio1();
					
					System.out.println("Olá seja bem vindo(a) ao relógio Polaris!\n");
					
					System.out.println("Qual o seu nome?");
					String nome1 = leitora.next() + leitora.nextLine();
					
					System.out.println("Agora vamos começar " + nome1);
							
					
					System.out.println("Quantas vezes você quer repetir o processo?");
					int armazenarVezes = leitora.nextInt();
					
					System.out.println("O relógio vai repetir a contagem durante" + armazenarVezes +" vezes\n"
							+ " e você irá acompanhar as legendas, Ok?");
					
					String confirmacao1 = leitora.next();
					
					int tempo1 = 0;
					System.out.println("Então vamos começar a controlar a respiração em: ");
					while (tempo1 < (armazenarVezes * 9)) {
						for (int i=0+1; i <= 3 ; i++)
							try {
								Thread.sleep(1000);
								System.out.println(i);
							}catch (InterruptedException e) {
								e.printStackTrace();
							}tempo1+=3;
							System.out.println(relogio.inspirar(nome1));
						
						for (int i=0+1; i <= 3 ; i++)
							try {
								Thread.sleep(1000);
								System.out.println(i);
							}catch (InterruptedException e) {
								e.printStackTrace();
							}tempo1+=3;
							System.out.println(relogio.segurar());
						
						for (int i=0+1; i <= 3 ; i++)
							try {
								Thread.sleep(1000);
								System.out.println(i);
							}catch (InterruptedException e) {
								e.printStackTrace();
							}tempo1+=3;
							System.out.println(relogio.expirar());
						}
					System.out.println("Parabéns por ter chegado até aqui\n");
			 		break;
			 		
			//classe diario
			 	case 4:
			 		Scanner scan2 = new Scanner(System.in);
			 		//pergunta e pega o nome
			 		System.out.println("Olá seja bem vindo(a) ao diário digital\n"
							+ "Qual é o seu nome?");
			 		String nome2 = scan2.next() + scan2.nextLine();
					
					//pergunta e pega o dia/mes/ano
			 		System.out.println("Qual é o dia em que você está escrevendo no diário?");
			 		int dia = scan2.nextInt();
					
			 		System.out.println("Qual é o mês em que você ta escrevendo o diário?"
							+ "Janeiro | Fevereiro | Março    |\n"
							+ "Abril   | Maio      | Junho    |\n"
							+ "Julho   | Agosto    | Setembro |\n"
							+ "Outubro | Novembro  | Dezembro |");
			 		String mes = scan2.next() + scan2.nextLine();
					
			 		System.out.println("Qual é o ano em que você está escrevendo no diário?");
					int ano = scan2.nextInt();
					
					//registra como o usuário esta
					System.out.println("Como você está hoje " + nome2 + " ?\n"
							+ "Ótimo\n"
							+ "Bem\n"
							+ "Mal\n"
							+ "Péssimo");
					String registroDeAcontecimentos = scan2.next().toLowerCase();
					
					if (registroDeAcontecimentos.equals("ótimo")) {
						System.out.println("Que bom " + nome2 + ", parabéns continue assim");
					} else if (registroDeAcontecimentos.equals("bem")) {
						System.out.println("Que bom " + nome2 + ", parabéns continue assim");
					} else if(registroDeAcontecimentos.equals("mal")) {
						System.out.println("Não fique assim, estamos aqui com você " + nome2);
					} else if(registroDeAcontecimentos.equals("péssimo")) {
						System.out.println("Não fique assim, estamos aqui com você " + nome2);
					}
					registroDeAcontecimentos +=1;
					
					//o usuario vai escrever o diario
					System.out.println("Fique a vontade para escrever: \n");
					String escrever = scan2.next() + scan2.nextLine();
					
					//instanciar o objeto
					
					Diario diario = new Diario();
					
					diario.setNome(nome2);
					System.out.println(diario.exibirDados(escrever, nome2, dia, mes, ano));
					System.out.println("\n");
			 		break;
			}
			
		} while(op != 0);
		
		System.out.println("Obrigado por testar nosso sistema");
		
		scan.close();
	}//main
}//class
