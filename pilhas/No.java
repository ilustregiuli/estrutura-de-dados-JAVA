package pilhas;

public class No {

	private int dado;
	private No proximo = null;
	
	public No() {

	}
	
	public No(int dado) {
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}
	
	
	
	
	
}
