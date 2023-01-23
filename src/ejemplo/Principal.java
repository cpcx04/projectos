package ejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		crudProducto crud2;
		Producto[] listaCrud2;
		int tam,opcion,contadorP=0;
		String codigo;
		String nombre;
		float precioUnitario,precioNuevo;
		boolean activo;

		System.out.println("Indique cuántos productos habrá");
		tam = Leer.datoInt();

		listaCrud2 = new Producto[tam];

		crud2 = new crudProducto(listaCrud2);

		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			
				switch(opcion) {
				case 1:
					crud2.imprimirTodosLosProductos();
					break;
				case 2:
					System.out.println("Indique el codigo del producto");
					codigo=Leer.dato();
					System.out.println("Indique el nombre del producto");
					nombre=Leer.dato();
					System.out.println("Diga el precio de la unidad");
					precioUnitario=Leer.datoFloat();
					crud2.add(new Producto(codigo,nombre,precioUnitario,true),contadorP);
					break;
				case 3:
					System.out.println("Indique el codigo");
					crud2.imprimirActivos();
					codigo=Leer.dato();
					System.out.println("Indique nuevo precio");
					precioNuevo=Leer.datoFloat();
					crud2.editPrecio(codigo, precioNuevo);
					break;
				case 4:
					System.out.println("Indique el codigo del producto que desea deshabilitar");
					codigo=Leer.dato();
					crud2.delete(crud2.findById(codigo));
					break;
				case 5:
					crud2.imprimirActivos();
					break;
				case 0:
					break;
				default:
					break;
				}
		} while (opcion != 0);
		System.out.println("Gracias por utilizar nuestro programa.");

	}

	private static void imprimirMenu() {
		System.out.println("¿Qué desea realizar?");
		System.out.println("1.Ver productos .\n" + "2.Añadir producto. \n" + "3.Modificar.\n"
				+ "4.Borrar producto." + "\n5.Ver productos activos"+"\n0.Salir");
	}

}