package JAXB;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

//Esta clase sirve para leer el xml con JAXB
public class JAXB {

	public static void main(String[] args) throws JAXBException {
			//Creamos el contexto de donde tenemos la raiz con el JAXB
			JAXBContext context = JAXBContext.newInstance(Empresa.class);
			//Guardamos el contexto en un unmarshaller
			Unmarshaller unmarshaller = context.createUnmarshaller();
			//Expresamos que en este caso la clase empresa es el contexto del unmarshaller y le damos el xml
			Empresa empresa =(Empresa) unmarshaller.unmarshal(new File("empresa.xml"));
		
			System.out.println("Nombre: "+empresa.getNombre());
			
			ArrayList<Empleado> empleados = empresa.getEmpleados();
			
			for(Empleado e: empleados) {
				System.out.println("Id: "+e.getId()+" Nombre: "+e.getNombre()+" Edad: "+e.getEdad()+" Meses trabajados: "+e.getMeses_trabajados()+" Puesto: "+e.getPuesto()+" Saldo: "+e.getSueldo());
			}
	}

}
//En esta clase no hubo errores