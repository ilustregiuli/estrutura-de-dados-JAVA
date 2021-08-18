package fila;

public class No<T> {

	private T object;
	private No<T> proximo;
	
	public No() {	
	}

	public No(T object) {
		this.object = object;
		this.proximo = null;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
	
}
