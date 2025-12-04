package co.edu.sena.pedrofigueroa.sem1.sem2;
class Cliente {
    private String nombre;
    private String cedula;
    private String telefono;
    
    
    public Cliente(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    
    public String getNombre() {
    	 return nombre; 
     }
    public void setNombre(String nombre) { 
         this.nombre = nombre;
     }

    public String getCedula() {
    	 return cedula; 
    }
    public void setCedula(String cedula) { 
          this.cedula = cedula;
     }

    public String getTelefono() { 
          return telefono; 
     }
    public void setTelefono(String telefono) {                 this.telefono = telefono;
     }

    // Método de negocio
    public void Datos() {
        System.out.println("coordial saludo sr. abogado mi nombre es:  " + nombre + " mi numero de cedula es: " + cedula + " y mi telefono de contacto es: " + telefono );
    }
}
