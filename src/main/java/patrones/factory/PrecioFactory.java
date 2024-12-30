package patrones.factory;

public class PrecioFactory {
    String pais;
    Precio precio;

    private PrecioFactory() {
    }
    public PrecioFactory(String pais) {
        this.pais = pais;
        if (pais.equalsIgnoreCase("es")){
            precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("uk")) {
            precio = new PrecioLIBRA();
        } else if (pais.equalsIgnoreCase("us")) {
            precio = new PrecioUSD();
        }else {
            System.out.println("Precio no asignado");
            precio = new PrecioDefecto();
        }
    }
}
