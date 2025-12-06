package co.edu.sena.pedrofigueroa.sem2;
 class  Lawyer {
	
	private  String nombre;
	private  String especializacion;
	private  String honorario;
	private  Cliente cliente;

    public Lawyer(){

    }
  public Lawyer(String nombre, String especializacion, String honorario, Cliente cliente) {
 	      
 	      this.nombre = nombre;
 	      this.especializacion = especializacion;
 	      this.honorario = honorario;
 	      this.cliente = cliente;
 	}
	
	
	
	
	public String getNombre() {

      return nombre;
	}

     public void setNombre(String nombre) {
         if (nombre != null && !nombre.isEmpty()) {
             this.nombre = nombre;
         } else {
             System.out.println("Error: El nombre del abogado no puede estar vacío");
         }
     }
    public String getEspecializacion() {

      return especializacion;
    }


     public void setEspecializacion(String especializacion) {
         if (especializacion != null && !especializacion.isEmpty()) {
             this.especializacion = especializacion;
         } else {
             System.out.println("Error: La especialización no puede estar vacía");
         }
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
