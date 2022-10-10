public class Main {
    public static void main(String[] args) {
        Cliente clienteUno = new Cliente(15,"Jorge", 312127, 15000);
        Trabajador trabajadorUno = new Trabajador(20,"Pedro",12634,80000);


        System.out.println("Nombre: " + clienteUno.nombre);
        System.out.println("Edad: " + clienteUno.edad);
        System.out.println("Telefono: " + clienteUno.telefono);
        System.out.println("Credito: " + clienteUno.GetCredito());

        System.out.println("------Trabajador-----------");

        System.out.println("Nombre: " + trabajadorUno.nombre);
        System.out.println("Edad: " + trabajadorUno.edad);
        System.out.println("Telefono: " +  trabajadorUno.telefono);
        System.out.println("Salario: " + trabajadorUno.GetSalario());




    }


}

class Personas{
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Personas{
    private int credito;

    public Cliente(int edad , String nombre, int telefono, int credito){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;
    }

    public  int GetCredito(){
        return this.credito;
    }

    public void SetCredito(int credito){
        this.credito = credito;
    }


}

class  Trabajador extends  Personas{
    private int salario;

    public Trabajador(int edad , String nombre, int telefono, int salario){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
    }

    public  int GetSalario(){
        return this.salario;
    }

    public void SetSalario(int salario){
        this.salario = salario;
    }

}