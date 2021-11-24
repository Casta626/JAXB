package JAXB;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
//Esta clase es para hacer un nuevo xml con JAXB
public class EscrituraJAXB {

	public static void main(String[] args) throws JAXBException, IOException {
		//Creamos el contexto de donde tenemos la raiz con el JAXB
		JAXBContext context = JAXBContext.newInstance(Empresa.class);
		//Guardamos el contexto en un unmarshaller
		Marshaller marshaller = context.createMarshaller();
		//Expresamos que en este caso la clase empresa es el contexto del unmarshaller y le damos el xml
		Empresa empresa = new Empresa();
		
		empresa.setNombre("Mi empresa");
		empresa.setDireccion("Calle del Programador");
		empresa.setDueño("Casta");
		
		//Guardamos todos los datos del empleado aquí
		ArrayList<Empleado> empleados = new ArrayList();
		Empleado e1= new Empleado();
		e1.setId(9);
		e1.setNombre("Pepe");
		e1.setEdad(35);
		e1.setMeses_trabajados(14);
		e1.setPuesto("Cocinero/a");
		e1.setSueldo(1500);
		empleados.add(e1);
		
		//Con esta linea cargamos todos los empleados que tengamos en el array de empleados
		empresa.setEmpleados(empleados);
		//Con esto le damos formato de xml al texto
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		//Esto es solo para verlo por pantalla
		marshaller.marshal(empresa, System.out);
		//Con esto le pasamos el marshal y le decimos que nos cree otro archivo, en este caso un xml nuevo.
		marshaller.marshal(empresa, new FileWriter("empresa2.xml"));
		
		//En esta clase no hubo errores.
	}

}
