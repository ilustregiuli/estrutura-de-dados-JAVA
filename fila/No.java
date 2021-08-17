package fila;

public class No {

	private Object object;
	private No proximo;
	
	public No() {	
	}

	public No(Object object) {
		this.object = object;
		this.proximo = null;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
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
