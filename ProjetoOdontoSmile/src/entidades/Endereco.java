package entidades;

public class Endereco extends Pessoas {
	private String rua;
	 private String numero;
	 private String cidade;
	 private String cep;
	 private String Bairro;
	 
	 
	
	
	 public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
	