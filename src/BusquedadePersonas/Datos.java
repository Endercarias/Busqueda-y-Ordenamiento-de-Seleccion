package BusquedadePersonas;

public class Datos implements Comparable<Datos> {
	int DPI;
	String nombre;
	int edad; 


	public Datos(int dPI, String nombre, int edad) {
		super();
		DPI = dPI;
		this.nombre = nombre;
		this.edad = edad;
	}

	public void Persona ()
	{
	DPI=0;
	nombre="";
	edad=0;

	}
	
	public void Persona (int d, String n, int e)
	{
	DPI=d;
	nombre=n;
	edad=e;

	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDPI() {
		return DPI;
	}

	public void setDPI(int dPI) {
		DPI = dPI;
	}
	
	@Override
	public int compareTo(Datos datos) {
		if (DPI < datos.DPI) {
			return -1;
		}
		if (DPI > datos.DPI) {
			return 1;
		}
		return 0;
	}


	}


