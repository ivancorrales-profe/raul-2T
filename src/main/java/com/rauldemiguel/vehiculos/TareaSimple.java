package com.rauldemiguel.vehiculos;

public class TareaSimple {

	String nombre;
	private String titulo;
	boolean encontrada;
	
	public TareaSimple(String nombre, String titulo, boolean encontrada) {
		this.nombre = nombre;
		this.titulo = titulo;
		this.encontrada = encontrada;
	}
	
	public TareaSimple() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void  mostrarTarea() {
		if (encontrada) {
			System.out.println("la tarea esta completada");
		}else {
			System.out.println("La tarea NO esta completada");
		}
			
		
		public void cambiarEstado() {
			if (this.encontrada) {
				this.encontrada =false;
			}else {
				this.encontrada =true;
			}
		}
	 
	 
	}
		
	
		
