public class Main {
    public static void main(String[] args) {
        System.out.println(Suma(10,90,30));
        var miCoche = new Coche();

        miCoche.AumentaPuerta();

        System.out.println(miCoche.numeroPuertas);
    }

    public static int Suma(int a, int b, int c){
        return a + b +c ;
    }
}

class Coche {
    public int numeroPuertas = 0;

    public void AumentaPuerta(){
        numeroPuertas ++;
    }
}