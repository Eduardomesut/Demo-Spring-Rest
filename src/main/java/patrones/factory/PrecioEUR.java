package patrones.factory;

public class PrecioEUR implements Precio{
    @Override
    public double getPrecio() {
        return 1;
    }

    @Override
    public double setprecio(double precio) {
        return precio;
    }


}
