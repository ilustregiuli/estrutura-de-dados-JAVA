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
		No refAuxiliar = this.noRefEntradaPilha; // guarda a referência atual de topo (entrada)
		this.noRefEntradaPilha = novoNo;		// altero a referência de topo para o novo No que entrou
		this.noRefEntradaPilha.setProximo(refAuxiliar); 	//	coloca como referência de próximo nó, a cópia do nó de topo antigo
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = this.noRefEntradaPilha; // nó que será retirado - o topo da pilha - guardo a referência
			this.noRefEntradaPilha = this.noRefEntradaPilha.getProximo(); // como o nó referência será retirado, então ele atualiza pra
																		  // receber aquele nó que está como seu "próximo" (de baixo)
			return noPoped; 	// retorna o nó que será retirado
		}
		return null;
	}

	@Override
	public String toString() {					// método toString vai ser usado para mostrar os nós e os próximos nós
		String stringRetorno = "---------------------\n";
		stringRetorno += "	Pilha		\n";
		stringRetorno += "----------------------\n";
		
		No noAuxiliar = this.noRefEntradaPilha;		// guarda a referência do topo da pilha 
		
		while(true) {								// loop até achar o próximo nó "null" (ou seja, o primeiro, a base da pilha)
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n"; // coloca o payload do nó atual na string de impressão
				noAuxiliar = noAuxiliar.getProximo();	// coloca como nó atual o "próximo nó"
			} else {
				break; // se o "próximo nó" for "null", sai do looping
			}
		}
		stringRetorno += "===============\n";
		return stringRetorno;
	}
	
	
}
