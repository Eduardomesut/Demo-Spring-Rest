package patrones.singleton;

public class Aplicacion {
    private static boolean estaCorriendo = false;

    private static Aplicacion aplicacion;

    private Aplicacion() {
    }
    public static Aplicacion getInstance(){
        if (aplicacion == null){
            estaCorriendo = true;
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }

    public boolean isEstaCorriendo() {
        return estaCorriendo;
    }

    public void setEstaCorriendo(boolean estaCorriendo) {
        this.estaCorriendo = estaCorriendo;
    }
}
