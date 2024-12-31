package patrones.builder;

public class Main {
    public static void main(String[] args) {

        //Coche vehiculo = new Coche();
        Vehiculo coche = new CocheBuilder("Fiat")
                .setPuertas(5)
                .setMotor("Hibrido")
                .build();

    }
}
