package listas;

import java.util.Arrays;

public class Vetor {

	private Aluno [] alunos = new Aluno[100];
	private int totalDeAlunos = 0; // a cada adi��o, vai incrementando um; Al�m de total, vai ser o
								   // n�mero da pr�xima posi��o	
	
	public void adiciona(Aluno aluno) {
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos ++;
			
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		for(int i = this.totalDeAlunos - 1; i >= posicao; i-=1) { // desloca todas as posi��o para direita a partir
			this.alunos[posicao + 1] = this.alunos[i];			  // da posi��o (posicao) informada no argumento	
		}
		
		this.alunos[posicao] = aluno;	//vetor recebe o aluno informado na posi��o informada
		this.totalDeAlunos ++;			// incrementa o total
		
	}
	
	public Aluno pega(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		
	}
	
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < this.totalDeAlunos; i ++) {
			if(aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}
	
	public String toString() {
		if(this.totalDeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.totalDeAlunos - 1; i ++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	private boolean posicaoOcupada(int posicao) {					// verifica se a posi��o est� ocupada
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}
	
	private boolean posicaoValida(int posicao) {					
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public void listaVector () {											// m�todo para ver cada elemento e a posi��o de cada um
		for(int i = 0; i < this.totalDeAlunos; i++) {
		System.out.println("[" + i + "] " + alunos[i].toString());
		}	
		System.out.println("Next position available: " + "[" +this.totalDeAlunos + "]");
	}

	
	
}
