package JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
//En la linea 8 le establecemos que estamos en la etiqueta de empleado
//Y en la 9 de decimos el nombre y su orden de sus demas etiquetas.
@XmlRootElement(name="empleado")
@XmlType(propOrder={"id","nombre","edad","meses_trabajados","puesto","sueldo"})
public class Empleado {
	
	private int id;
	private String nombre;
	private int edad;
	private int meses_trabajados;
	private String puesto;
	private int sueldo;
	/*
	public Empleado(int id, String nombre, int edad, int meses_trabajados, String puesto, int sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.meses_trabajados = meses_trabajados;
		this.puesto = puesto;
		this.sueldo = sueldo;
	}
	*/
	
	//Como este es un atributo se lo marcamos para que cuando genere el xml sepa que es atributo
	@XmlAttribute(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getMeses_trabajados() {
		return meses_trabajados;
	}
	public void setMeses_trabajados(int meses_trabajados) {
		this.meses_trabajados = meses_trabajados;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	//Aquí tuve un error en el que puse public double getSueldo y no lo cambie a int.
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
//El unico error de la clase fue el getSueldo