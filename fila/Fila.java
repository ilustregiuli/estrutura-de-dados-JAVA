package fila;

public class Fila {
	
	private No referenciaEntrada;
	
	public Fila() {
		this.referenciaEntrada = null;
	}
	
	public void enqueue (Object obj) {		// método para adicionar na fila, recebe um novo "nó"
		No novoNo = new No(obj);
		novoNo.setProximo(this.referenciaEntrada); // o próximo nó de "novo nó" vai receber a referencia de entrada
		this.referenciaEntrada = novoNo; // e a referencia de entrada, será esse novo nó
	}
	
	public Object first() {
		if(!isEmpty()) {
			No primeiroNo = this.referenciaEntrada;
			while(true) {
				if(primeiroNo.getProximo() != null) {
					primeiroNo = primeiroNo.getProximo();
				} else {
					break;
				}
			}
			return primeiroNo.getObject();
		} else {
			return null;
		}
		
	}
	
	public Object dequeue() {
		if(!this.isEmpty()) {	// verifica se a fila está vazia
			No primeiroNo = this.referenciaEntrada;	// atribui a ref. de entrada como "Primeiro nó"
			No auxiliarNo = this.referenciaEntrada;	// atribui uma copia de ref. de entrada
			while(true) {							// loop até achar o primeiro nó
				if(primeiroNo.getProximo() != null) {	// o nó será o primeiro quando apontar para "null"
					auxiliarNo = primeiroNo;			// o auxiliar recebe o "primeiro nó" (de entrada)
					primeiroNo = primeiroNo.getProximo();	//... e o primeiro nó agora aponta para o proximo dele mesmo
				} else {							// quando ele acha o primeiro, 
					auxiliarNo.setProximo(null);	// a cópia é usada para setar a referencia do primeiro elemento como "null"
					break;
				}
			}
			return primeiroNo.getObject();
		} else {
			return null;
		}
		
	}
	
	public boolean isEmpty() {
		return this.referenciaEntrada == null ? true : false; // se o nó de referencia for "null", é porque a fila está vazia
	}
	
	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = this.referenciaEntrada; // nó auxiliar recebe a referência do último da fila (ref. entrada)
		
		if(this.referenciaEntrada != null) {
			while(true) {
				stringRetorno += "[No {objeto=" + noAuxiliar.getObject() + "}] --->";
				if(noAuxiliar.getProximo() != null) {// verifica se o proximo nó não é "null" (e não tem somente um elemento na fila)
					noAuxiliar = noAuxiliar.getProximo(); // o nó auxiliar recebe o imediatamente próximo
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}

}
