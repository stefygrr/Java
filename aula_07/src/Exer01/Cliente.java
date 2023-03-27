package Exer01;

public class Cliente {

	private String nome;
	private String cpf;
	private String telefone;
	private String cidade;
	private String estadoCivil;

	public Cliente(String nome, String cpf, String telefone, String cidade, String estadoCivil) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cidade = cidade;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return cidade;
	}

	public void setEndereço(String endereço) {
		this.cidade = endereço;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void visualizar() {
		System.out.println("****************************************");
		System.out.println("         DADOS DO CLIENTE               ");
		System.out.println("****************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("cidade: " + this.cidade);
		System.out.println("Estado civil : " + this.estadoCivil);

	}

}
