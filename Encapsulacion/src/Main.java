public class Main {
    public static void main(String[] args) {
        Personas personaUno = new Personas();

        personaUno.SetEdad(19);
        personaUno.SetNombre("Jorge");
        personaUno.SetTelefono(1277923);

        System.out.println(personaUno.GetNombre());
        System.out.println((personaUno.GetEdad()));
        System.out.println(personaUno.GetTelefono());
    }

}

class Personas{
    private int edad, telefono;
    private String nombre;

    public void SetEdad(int edad){
        this.edad = edad;
    }

    public int GetEdad(){
        return this.edad;
    }


    public void SetTelefono(int telefono){
        this.telefono = telefono;
    }

    public int GetTelefono(){
        return this.telefono;
    }


    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String GetNombre(){
        return this.nombre;
    }




}