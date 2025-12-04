package co.edu.sena.pedrofigueroa.sem1.sem2;
 class  Lawyer {
	
	private  String nombre;
	private  String especializacion;
	private  String honorario;
	private  Cliente cliente;
	
	
	
  public Lawyer(String nombre, String especializacion, String honorario, Cliente cliente) {
 	      
 	      this.nombre = nombre;
 	      this.especializacion = especializacion;
 	      this.honorario = honorario;
 	      this.cliente = cliente;
 	}
	
	
	
	
	public String getNombre() {
		         return nombre;
	}
	
	public void setNombre(String nombre){
	             this.nombre = nombre;
	   
	}
    public String getEspecializacion() {
		         return especializacion;
    }
    
    public void setEspecializacion(String especializacion){
	            this.especializacion = especializacion;
	}
	
    public String getHonorario() {
		         return honorario;
	}
	
	public void setHonorario(String honorario){
	             this.honorario = honorario;
	   
	}
	
	
	//metodo de negocio
	public void Presentacion() {
		System.out.println("coordial saludo mi nombre es: " + nombre + "y me especializo en: " + especializacion + " y el valor de mis honorarios en dolares es:   $ " + honorario);
		
		System.out.println("Atiendo al cliente: ");
		cliente.Datos();
		
		
		
	}
}
