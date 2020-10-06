
public class Teste {

	public static void main(String[] args) {

		Agencia agenciaCentral = new Agencia(1, "Central do Brasil");
		
		Endereco enderecoAgencia = new Endereco("rua a", "bairro a", "cidade a", "uf");
		agenciaCentral.setEndereco(enderecoAgencia);
		
		Gerente gerente = new Gerente();
		gerente.setNome("manoel gerente");
		gerente.setTelefone("telefone gerente");
		gerente.setMeta(100000);
		Endereco enderecoGerente = new Endereco("rua b", "bairro b", "cidade b", "uf");
		gerente.setEndereco(enderecoGerente);
		
		agenciaCentral.setGerente(gerente);
		
		
		
		
		
	}

}
