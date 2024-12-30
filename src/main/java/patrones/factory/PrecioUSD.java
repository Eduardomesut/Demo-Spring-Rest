package patrones.factory;

public class PrecioUSD implements Precio{
    @Override
    public double getPrecio() {
        return 0.92;
    }

    @Override
    public double setprecio(double precio) {
        return precio;
    }
}
