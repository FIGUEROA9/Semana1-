package co.edu.sena.pedrofigueroa.sem1.sem2;
public class Main {
	public static void main(String[] args) {
		
	
        Gestora sistema = new Gestora();

 Cliente cliente1 = new Cliente("martha hoyos", "1000125788" , "3125678439");
	        
		Lawyer abogado1 = new Lawyer("jesus alberto", "derecho familiar" , "59.000", cliente1);
		
		abogado1.Presentacion();
        

        // Agregarlos al sistema
        sistema.agregarCliente(cliente1);
        sistema.agregarAbogado(abogado1);

        // Mostrar todo
        sistema.mostrarClientes();
        sistema.mostrarAbogados();
    }
}		