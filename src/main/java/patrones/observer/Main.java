package patrones.observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();
        ReceptorTV receptorTV = new ReceptorTV();
        ReceptorRadio receptorRadio = new ReceptorRadio();
        emisora.meteReceptor(receptorTV);
        emisora.meteReceptor(receptorRadio);
        emisora.emite();
    }
}
