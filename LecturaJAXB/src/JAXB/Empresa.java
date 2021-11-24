package JAXB;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//En la línea 12 le decimos que empresa es la etiqueta raiz 
//En la línea 13 le damos el nombre y orden de las etiquetas que contiene empresa.
@XmlRootElement(name="empresa")
@XmlType(propOrder={"nombre","direccion","dueño","empleados"})
public class Empresa {
	private String nombre;
	private String direccion;
	private String dueño;
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
	
	public String getDueño() {
		return dueño;
	}
	
	public void setDueño(String dueño) {
		this.dueño=dueño;
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