package co.edu.sena.pedrofigueroa.sem2;
import java.util.ArrayList;
public class Gestora{

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Lawyer> listaAbogados;


    public Gestora() {
        listaClientes = new ArrayList<>();
        listaAbogados = new ArrayList<>();
    }



    public void agregarCliente(Cliente c) {
        listaClientes.add(c);
        System.out.println("Cliente agregado: " + c.getNombre());
    }

    public void agregarAbogado(Lawyer a) {
        listaAbogados.add(a);
        System.out.println("Abogado agregado: " + a.getNombre());
    }

    public void mostrarClientes() {
        System.out.println("\n--- LISTA DE CLIENTES ---");
        for (Cliente c : listaClientes) {
            System.out.println("• " + c.getNombre() + " - Cédula: " + c.getCedula());
        }
    }

    public void mostrarAbogados() {
        System.out.println("\n--- LISTA DE ABOGADOS ---");
        for (Lawyer a : listaAbogados) {
            System.out.println("• " + a.getNombre() + " - Especialización: " + a.getEspecializacion());
        }
    }
}