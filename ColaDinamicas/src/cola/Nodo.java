package cola;

public class Nodo <T> {
	
	private T elem;
	private Nodo ps;
	
	public Nodo(T elem) {
		this.elem = elem;
		this.ps = null;
	}
	
	public void setElem(T elem) {
		this.elem = elem;
	}
	
	public T getElem() {
		return this.elem;
	}
	
	public void setPs(Nodo ps) {
		this.ps = ps;
	}
	
	public Nodo getPs() {
		return this.ps;
	}
	

}
