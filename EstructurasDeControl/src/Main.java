public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------------------------
        //System.out.println(numeroIf + "Es negativo");
        System.out.println("Hello world!");

        int numeroIf = 5;
        if (numeroIf < 0){
            System.out.println(numeroIf + " Es negativo");
        } else if (numeroIf > 0) {
            System.out.println(numeroIf + " Es Positivo");
        }else {System.out.println(numeroIf + " Es 0");}
        //----------------------------------------------------------------------
        // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            numeroWhile++;
            System.out.println(numeroWhile);

        }while (numeroWhile < 3);
        //------------------------------------------------------------------
        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for (var numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        //---------------------------------------------------------------
        //para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        var estacion = "Primavera";

        switch (estacion){
            case "Verano":
                System.out.println("Es " + estacion);
                break;
            case "Invierno" :
                System.out.println("Es " + estacion);
                break;
            case "Otoño" :
                System.out.println("Es " + estacion);
                break;
            case "Primavera" :
                System.out.println("Es " + estacion);
                break;
            default: System.out.println("El valor de la variable no es una estacion valida");
        }

    }
}