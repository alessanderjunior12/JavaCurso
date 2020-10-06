
public class Cliente {

	private String nomeCliente;
	private String cpf;
	private String email;
	
	
	
	public Cliente(String nomeCliente, String cpf) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
	}

	//get
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	//set
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", email=" + email + "]";
	}
	
	

	
}
