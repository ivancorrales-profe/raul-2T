package com.RaúlDeMiguel.poo.redsocial;

public class PerfilRedSocial {

	private String nombreUsuario;
	private String nombreVisible;
	private String biografia;
	private String pais;
	private int seguidores;
	private int publicaciones;
	public PerfilRedSocial() {
		super();
	}








	private boolean verificado;
	private Estado estado;
	
	
	
	
	
	
	
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}








	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}








	public String getNombreVisible() {
		return nombreVisible;
	}








	public void setNombreVisible(String nombreVisible) {
		this.nombreVisible = nombreVisible;
	}








	public String getBiografia() {
		return biografia;
	}








	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}








	public String getPais() {
		return pais;
	}








	public void setPais(String pais) {
		this.pais = pais;
	}








	public int getSeguidores() {
		return seguidores;
	}








	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}








	public int getPublicaciones() {
		return publicaciones;
	}








	public void setPublicaciones(int publicaciones) {
		this.publicaciones = publicaciones;
	}








	public boolean isVerificado() {
		return verificado;
	}








	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}








	public Estado getEstado() {
		return estado;
	}








	public void setEstado(Estado estado) {
		this.estado = estado;
	}





public void mostrarInformacion() {
	System.out.println(this.nombreUsuario);
	
	
}


public void añadirSeguidores(int seguidores) {
	this.seguidores +=seguidores;
	
	

}

public void estadoPerfil(Estado estado) {
this.estado=estado;
	
}



public boolean activo(boolean verificado) {
	if(this.verificado) {
		System.out.println("NO ESTA ACTIVO");
	}else {
		System.out.println("ESTA ACTIVO");
	}
	return this.verificado;
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
