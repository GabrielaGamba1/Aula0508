
public class Main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Jo�o", 20, 182);
		
		pessoa1.setIdade(21);
	
		System.out.println("A pessoa " + pessoa1.getNome()+ " foi cadastrada com sucesso.");
	}

}
