public class Tema4_SentenciasControl {
    public static void main (String [] args) {

        //Ejercicio If. Indicar si la variable numeroIf es positiva, negativa o cero

        int numeroIf = 2;
        if (numeroIf < 0) {
            System.out.println("El número " + numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo");
        } else {
            System.out.println("El número es cero");
        }

        //Ejercicio WHILE de 0 a 3 iteraciones

        int contadorWhile = 0;
        while (contadorWhile < 3) {
            System.out.println("Bucle while " + contadorWhile + " vez.");
            contadorWhile++;
        }

        //Ejercicio DO WHILE que se ejecute solo una vez

        int contadorDoWile = 1;
        do {
            System.out.println("Bucle do while " + contadorDoWile + " vez");
            contadorDoWile++;
        } while (contadorDoWile < 1);

        //Ejercicio FOR cuenta atrás

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("NumeroFor = "+ numeroFor);
        }

        //Ejercicio SWITCH

        String estacion = "OTOÑO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("ES PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("ES VERANO");
                break;
            case "OTOÑO":
                System.out.println("ES OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO");
                break;
            default:
                System.out.println("LA VARIABLE NO ES NINGUNA ESTACIÓN");
        }

    }
}
