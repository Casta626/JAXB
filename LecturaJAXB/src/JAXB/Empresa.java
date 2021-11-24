package JAXB;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//En la l�nea 12 le decimos que empresa es la etiqueta raiz 
//En la l�nea 13 le damos el nombre y orden de las etiquetas que contiene empresa.
@XmlRootElement(name="empresa")
@XmlType(propOrder={"nombre","direccion","due�o","empleados"})
public class Empresa {
	private String nombre;
	private String direccion;
	private String due�o;
	private ArrayList<Empleado> empleados= new ArrayList<Empleado>();
	
	
	public Empresa() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public String getDue�o() {
		return due�o;
	}
	
	public void setDue�o(String due�o) {
		this.due�o=due�o;
	}
	
	//Al tener la etiqueta empleados mas etiquetas dentro de el, lo pasaremos como un objeto de un array
	//y dentro de este haremos lo mismo que con empresa.
	@XmlElementWrapper(name="empleados")
	@XmlElement(name="empleado")
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados=empleados;
	}
}
//En esta clase no hubo errores