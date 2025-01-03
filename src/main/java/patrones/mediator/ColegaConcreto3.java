package patrones.mediator;

public class ColegaConcreto3 extends Colega {
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje soy colega concreto 3");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concxreto3 envio 1 mensaje");
        mediator.reenvia(this);
    }
}
