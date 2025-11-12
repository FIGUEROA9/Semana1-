Diferencias entre Programación Estructurada y Programación Orientada a Objetos (POO)

La **programación estructurada** y la **programación orientada a objetos** son dos formas distintas de organizar y desarrollar programas. 
Ambas buscan resolver problemas mediante código, pero lo hacen con enfoques diferentes.

Enfoque

La programación estructurada se basa en funciones y pasos lógicos que se ejecutan uno detrás de otro.  
En cambio, la programación orientada a objetos se enfoca en crear objetos que representan elementos del mundo real y que contienen tanto datos como comportamientos.

Organización del código

En la programación estructurada, el código se organiza mediante procedimientos y variables globales o locales.  
En la programación orientada a objetos, el código se organiza en clases que contienen atributos (datos) y métodos (acciones).

 Manejo de datos

En el enfoque estructurado, los datos están separados de las funciones que los manipulan.  
En la POO, los datos y las funciones se agrupan dentro de los objetos, lo que facilita su manejo y protección.

Reutilización

La programación estructurada tiene una reutilización limitada, ya que las funciones suelen depender del contexto del programa.  
La programación orientada a objetos permite una alta reutilización gracias a conceptos como la herencia, la composición y el polimorfismo.

Seguridad

En la programación estructurada, la seguridad de los datos es menor porque las variables pueden ser modificadas fácilmente desde distintas partes del código.  
En la POO, se mejora la seguridad mediante la encapsulación, que controla el acceso a los datos y evita modificaciones no deseadas.

Ejemplo mental

La programación estructurada puede compararse con seguir una receta paso a paso, donde todo ocurre en un orden fijo.  
La programación orientada a objetos se parece más a modelar el mundo real, donde cada objeto tiene sus propias propiedades y comportamientos.

Conclusión

En resumen, la programación estructurada es adecuada para programas pequeños o de lógica simple, 
mientras que la programación orientada a objetos es más eficiente y mantenible en proyectos grandes y complejos, donde es necesario agrupar datos y comportamientos de forma 
organizada.


Ejemplo Conceptual:

### 1. Programación Estructurada


public class Estructurado {


// Variables
static String caseCode = "C-001";
static String caseType = "Civil";
static String lawyerName = "Carlos Pérez";

// Función 
static void mostrarCaso(String code, String type, String lawyer) {
    System.out.println("Código del caso: " + code);
    System.out.println("Tipo de caso: " + type);
    System.out.println("Abogado asignado: " + lawyer);
}

public static void main(String[] args) {
    // Llamamos la función
    mostrarCaso(caseCode, caseType, lawyerName);
}
}



###  2. programación orientada a objetos


class LegalCase {
    String caseCode;
    String caseType;
    String lawyerName;

    void mostrarDatos() {
        System.out.println("Código del caso: " + caseCode);
        System.out.println("Tipo de caso: " + caseType);
        System.out.println("Abogado asignado: " + lawyerName);
    }
}

public class Principal {
    public static void main(String[] args) {

       // Instancia
        LegalCase caso = new LegalCase();
        caso.caseCode = "C-001";
        caso.caseType = "Civil";
        caso.lawyerName = "Carlos Pérez";

        // Llamar método
        caso.mostrarDatos();
    }
}


