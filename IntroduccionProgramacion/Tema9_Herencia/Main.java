public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Trabajador trabajador1 = new Trabajador();
        cliente1.nombre = "Carmen Rodríguez";
        cliente1.edad = 28;
        cliente1.telefono = 634998877;
        cliente1.credito = 12300.34f;
        trabajador1.nombre = "Pablo García";
        trabajador1.salario = 25000f;
        System.out.println("Cliente: "+ cliente1.nombre + ", "  +cliente1.edad + " años" + ", teléfono " + cliente1.telefono + ", crédito: " + cliente1.credito);
        System.out.println("Trabajador: " + trabajador1.nombre + ", sueldo " + trabajador1.salario);
    }
}
class Persona {
    String nombre;
    int telefono;
    int edad;
}
class Cliente extends Persona {
    float credito;
}
class Trabajador extends Persona {
    float salario;
}



