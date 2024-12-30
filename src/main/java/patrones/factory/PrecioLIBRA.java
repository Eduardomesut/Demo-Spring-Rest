package patrones.factory;

public class PrecioLIBRA implements Precio{
    @Override
    public double getPrecio() {
        return 2;
    }

    @Override
    public double setprecio(double precio) {
        return precio;
    }
}
