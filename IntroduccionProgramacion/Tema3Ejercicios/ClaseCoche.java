public class ClaseCoche {
    //Atributos de la clase coche
    String marca;
    String combustible;
    String color;
    int puertas;

    //Constructor
    ClaseCoche (String marca, String combustible, String color, int puertas){
        this.marca = marca;
        this.combustible = combustible;
        this.color = color;
        this.puertas = puertas;
    }
    //Método añadir 1 puerta
    int sumaPuerta(){
        puertas = this.puertas +1;
        return puertas;
    }
    public static void main (String[] args) {
        ClaseCoche coche1 = new ClaseCoche("RENAULT", "DIESEL", "NEGRO", 4);
        coche1.sumaPuerta();
        System.out.println("El coche1 tiene " + coche1.puertas + " puertas.");
    }

}