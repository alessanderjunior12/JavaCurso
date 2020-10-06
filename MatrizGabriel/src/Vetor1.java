
public class Vetor1 {

	
	public static void main(String[] args) {
		
		Pessoa v[] = new Pessoa[5];
		v[0] = new Pessoa("pessoa1","cpf1","rg1"); 
		v[1] = new Pessoa("pessoa2","cpf1","rg1"); 
		v[2] = new Pessoa("pessoa3","cpf1","rg1"); 
		v[3] = new Pessoa("pessoa4","cpf1","rg1"); 
		v[4] = new Pessoa("pessoa5","cpf1","rg1"); 
		
		System.out.println(v.length);
		
		for(int indice = 0; indice < v.length; indice++) {
			System.out.println(v[indice]);
		}
		
		
		
	}
}
