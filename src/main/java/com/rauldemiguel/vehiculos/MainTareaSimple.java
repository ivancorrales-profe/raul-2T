package com.rauldemiguel.vehiculos;

public class MainTareaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TareaSimple objeto1= new TareaSimple();
		objeto1.setTitulo("Nueva tarea") ;
		System.out.println(objeto1.getTitulo());
		
		TareaSimple objeto2 = new TareaSimple("Otra tarea", "nombre", true);
		System.out.println(objeto2.getTitulo());
		
		
		
		
	}

}
