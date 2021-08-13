package pilhas;

public class Pilha {

	private No noRefEntradaPilha;

	public Pilha() {
		this.noRefEntradaPilha = null;
	}
	
	public boolean isEmpty() {
		return noRefEntradaPilha == null ? true : false;
	}
	
	public No top() {
		return this.noRefEntradaPilha;
	}
	
	public void push(No novoNo) {
		No refAuxiliar = this.noRefEntradaPilha; // guarda a refer�ncia atual de topo (entrada)
		this.noRefEntradaPilha = novoNo;		// altero a refer�ncia de topo para o novo No que entrou
		this.noRefEntradaPilha.setProximo(refAuxiliar); 	//	coloca como refer�ncia de pr�ximo n�, a c�pia do n� de topo antigo
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = this.noRefEntradaPilha; // n� que ser� retirado - o topo da pilha - guardo a refer�ncia
			this.noRefEntradaPilha = this.noRefEntradaPilha.getProximo(); // como o n� refer�ncia ser� retirado, ent�o ele atualiza pra
																		  // receber aquele n� que est� como seu "pr�ximo" (de baixo)
			return noPoped; 	// retorna o n� que ser� retirado
		}
		return null;
	}

	@Override
	public String toString() {					// m�todo toString vai ser usado para mostrar os n�s e os pr�ximos n�s
		String stringRetorno = "---------------------\n";
		stringRetorno += "	Pilha		\n";
		stringRetorno += "----------------------\n";
		
		No noAuxiliar = this.noRefEntradaPilha;		// guarda a refer�ncia do topo da pilha 
		
		while(true) {								// loop at� achar o pr�ximo n� "null" (ou seja, o primeiro, a base da pilha)
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n"; // coloca o payload do n� atual na string de impress�o
				noAuxiliar = noAuxiliar.getProximo();	// coloca como n� atual o "pr�ximo n�"
			} else {
				break; // se o "pr�ximo n�" for "null", sai do looping
			}
		}
		stringRetorno += "===============\n";
		return stringRetorno;
	}
	
	
}
