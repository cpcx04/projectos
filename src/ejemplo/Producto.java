package   ejemplo;

public class Producto {

	// Atributos

	private String codigo;
	private String nombre;
	private float precioUnitario;
	private boolean activo;

	// Constructores

	public Producto(String codigo, String nombre, float precioUnitario, boolean activo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.activo = activo;
	}

	// getters and Setters

		public String getCodigo() {
			return codigo;
		}
	
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
	
		public String getNombre() {
			return nombre;
		}
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
		public float getPrecioUnitario() {
			return precioUnitario;
		}
	
		public void setPrecioUnitario(float precioUnitario) {
			this.precioUnitario = precioUnitario;
		}
	
		public boolean isActivo() {
			return activo;
		}
	
		public void setActivo(boolean activo) {
			this.activo = activo;
		}

	
		
		//toString
	
		@Override
		public String toString() {
			return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario
					+ ", activo=" + activo + "]";
		}
		
		//Métodos
		
		
		public int compareTo(Producto p) {
			
			if (this.codigo.equalsIgnoreCase(p.getCodigo()) 
					&& this.nombre.equalsIgnoreCase(p.getNombre())
					&& this.precioUnitario==p.getPrecioUnitario())
				return 0;
			else
				return 1;
	
		}
	
		
}
