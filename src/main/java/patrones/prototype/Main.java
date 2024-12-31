package patrones.prototype;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.modelo = "Seat";
        coche.marca = "Ibiza";
        coche.puertas = 5;
        System.out.println(coche);
        Coche clon = null;
        try {
            clon = coche.clonar();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(clon);

    }
}
