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
		System.out.println("que tipo de usu�rio vc �: ");
		System.out.println("Cadastro de usu�rio da clinica OdontoSmilly\n"
				+ "[1] para cadastra Funcion�rio\n"
				+ "[2] para cadastra Paciente\n"
				+"=====================================================\n"
				+"Selecione umas das op�oes\n"
				+"OU tecle em qualquer tecla para SAIR do programa...\n"
				+"=====================================================");
		
	}
	public void efetuandoLogin() { 
		
		System.out.print("Informe um LOGIN v�lido: ");
		login = scan.next();
		System.out.print("Insira uma SENHA v�lida: ");
		senha = scan.next();
	
	}
	
	public void verificadorLogin() {// verificando se o cliente j� tem cadastro no bando de dados
		if ((getNomeUsuario() == login) && (getSenhaApp() == senha)) {
			System.out.println("seja bam vindo ao central de atendimento ");
		}
		else {
			System.out.println("vc n�o possui cadastro no nosso banco de dados");
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
