package listas;

public class TesteAddNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		
		a1.setNome("André");
		a2.setNome("Bernardo");
		a3.setNome("Carlos");
		a4.setNome("Daniel");
		a5.setNome("Eduardo");
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(4, a5);
		
		lista.listaVector();
//		System.out.println(lista.contem(a2));	
//		System.out.println(lista.pega(5).toString()); // testando colocar uma posição fora do range
		

	}

}
