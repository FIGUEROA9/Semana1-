package co.edu.sena.pedrofigueroa.sem2;
class Cliente{
    private String nombre;
    private String cedula;
    private String telefono;

    public Cliente(){

    }
    public Cliente(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }


    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del cliente no puede estar vacío");
        }
    }

    public String getCedula() {

        return cedula;
    }
    public void setCedula(String cedula) {
        if (cedula != null && !cedula.isEmpty()) {
            this.cedula = cedula;
        } else {
            System.out.println("Error: La cédula no puede estar vacía");
        }
    }

    public String getTelefono() {

        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void Datos() {
        System.out.println("coordial saludo sr. abogado mi nombre es:  " + nombre + " mi numero de cedula es: " + cedula + " y mi telefono de contacto es: " + telefono );
    }
}