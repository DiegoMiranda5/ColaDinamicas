package cola;

public class Cola {
	
	private Nodo frente;
	private Nodo fondo;
	
	public Cola() {
		this.fondo = null;
		this.frente = null;
	}
	
	public boolean isVacia() {
		return (frente == null);
	}
	
	public <T> void encolar(T elem) {
		Nodo nuevoNodo = new Nodo(elem);
		if(isVacia()) {
			fondo = frente = nuevoNodo;
		}else {
			fondo.setPs(nuevoNodo);
			fondo =  nuevoNodo;
		}
	}
	
	public void encolar(Nodo nuevoNodo) {
		if(isVacia()) {
			fondo = frente = nuevoNodo;
		}else {
			fondo.setPs(nuevoNodo);
			fondo =  nuevoNodo;
		}
	}
	
	public Nodo desencolar() {
		Nodo regresa = null;
		if(!isVacia()) {
			regresa = this.frente;
			frente = frente.getPs();
		}
		
		return regresa;	
	}
	
	public void imprimir(){
		Cola aux = new Cola();
		do {
			Nodo elem = this.desencolar();
			System.out.println(elem.getElem().toString());
			aux.encolar(elem);
		}while(!isVacia());
		restaurar(aux);
	}
	

	public void restaurar(Cola aux) {
		while(!aux.isVacia()) {
			this.encolar(aux.desencolar());
		}
	}

}
