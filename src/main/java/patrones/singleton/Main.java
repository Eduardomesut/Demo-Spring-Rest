package patrones.singleton;

public class Main {
    public static void main(String[] args) {
        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();

        System.out.println(app);
        System.out.println(app2);



    }
}
