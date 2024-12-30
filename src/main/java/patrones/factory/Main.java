package patrones.factory;

public class Main {

    public static void main(String[] args) {
        PrecioFactory precioFactory = new PrecioFactory("es");
        System.out.println(precioFactory.precio.getPrecio());

        PrecioFactory precioFactory2 = new PrecioFactory("uk");
        System.out.println(precioFactory2.precio.getPrecio());
        PrecioFactory precioFactory3 = new PrecioFactory("us");
        System.out.println(precioFactory3.precio.getPrecio());
        PrecioFactory precioFactory4 = new PrecioFactory("aus");

        System.out.println(precioFactory4.precio.getPrecio());

    }
}
