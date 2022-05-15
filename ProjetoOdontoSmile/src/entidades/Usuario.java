package entidades;

import java.util.Scanner;

public class Usuario {
	//Funcionario funcionario = new Funcionario();
	Scanner scan = new Scanner(System.in);
	private String nomeUsuario;
	private String login;
	private String senha;
	private String nome;
	private String senhaApp;
	public String msg;
	
	public Usuario() {}
	public Usuario(String msg) {
		this.msg = msg;
	}
	
	public void cadastroSenha() {
		System.out.println("cadastro do login");
		String loginA = scan.next();
		System.out.println("cadastro do senha");
		String senhaA = scan.next();
		setNomeUsuario(loginA);
		setSenhaApp(senhaA);
		System.out.println("que tipo de usuário vc é: ");
		System.out.println("Cadastro de usuário da clinica OdontoSmilly\n"
				+ "[1] para cadastra Funcionário\n"
				+ "[2] para cadastra Paciente\n"
				+"=====================================================\n"
				+"Selecione umas das opçoes\n"
				+"OU tecle em qualquer tecla para SAIR do programa...\n"
				+"=====================================================");
		
	}
	public void efetuandoLogin() { 
		
		System.out.print("Informe um LOGIN válido: ");
		login = scan.next();
		System.out.print("Insira uma SENHA válida: ");
		senha = scan.next();
	
	}
	
	public void verificadorLogin() {// verificando se o cliente já tem cadastro no bando de dados
		if ((getNomeUsuario() == login) && (getSenhaApp() == senha)) {
			System.out.println("seja bam vindo ao central de atendimento ");
		}
		else {
			System.out.println("vc não possui cadastro no nosso banco de dados");
			cadastroSenha();
		}
	}


	public Scanner getScan() {
		return scan;
	}


	public void setScan(Scanner scan) {
		this.scan = scan;
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenhaApp() {
		return senhaApp;
	}


	public void setSenhaApp(String senhaApp) {
		this.senhaApp = senhaApp;
	}
}
