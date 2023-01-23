package ejemplo;

import java.util.Arrays;

public class crudProducto {

	/*
	 * CRUD:
	 * 
	 * C reate R ead U pdate D elete
	 * 
	 */

	// Atributos

	private Producto[] lista;
	private String codigo;

	/*
	 * Constructor para crear un objeto de esta clase para que ya pueda tener tamaño
	 * dado por el usuario
	 */

	// --------------------------------------

	// Constructores

	public crudProducto(Producto[] lista) {
		this.lista = lista;
	}

	/*
	 * Pa probar cosas con el array le instanciamos un tamaño para evitar
	 * complicaciones.
	 */

	public crudProducto() {

		int cuatro = 4;
		lista = new Producto[cuatro];

	}

	
		//METODOS
		
		
	
	// esto guarda un producto en la posicion que digamos en el main

	public void add(Producto p, int posicion) {
		lista[posicion] = p;
	}

	
	//Este nos devuelve el producto 
	
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return lista[i];
		else
			return null;
	}
	
	//Este buscador devuelve el índice del elemento que buscamos
	
	public int findByIdV2(String codigo) {
		int i=0;
		boolean encontrado = false;
		
		while (i<lista.length && !encontrado) {
			Producto deLista = lista[i];
			if(deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado=true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else 
			return -1;
		}
		//Este menos uno se devuelve para indicar que no existe
		//un producto en concreto ya que el indice nunca será negativo
		
		
		//otro buscarr
		public int findProduct (Producto p){
			int i=0;
			boolean encontrado=false;
			
			while(i<lista.length && !encontrado) {
				Producto deLista=lista[i];
				if(p.compareTo(deLista)==0)
					encontrado=true;
				else
					i++;
			}
			if(encontrado)
				return i;
			else
				return -1;
	}

	public void editPrecio(String codigo, float precioN) {

		int index = findByIdV2(codigo);

		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
		}
	}
	
	public Producto[]findAll(){
		return lista;
	}
	
	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+" "+lista[i]);
		}
	}
	public void imprimirActivos() {
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if(lista[i].isActivo()) {
				System.out.println((i+1)+" "+lista[i]);
			}
		}
	}
	
	
	//Este método te deshabilita un producto no te lo borra
	public void delete(Producto p) {
		int index= findProduct(p);
		if (index >=0)
			lista[index].setActivo(false);
	}

	// --------------------------------------

	// getters and setters
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	//toString
	@Override
	public String toString() {
		return "Lista=" + Arrays.toString(lista) + ", codigo=" + codigo + "]";
	}
	
	
	
	
	

}
