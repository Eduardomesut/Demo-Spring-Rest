package patrones.mediator;

public class ColegaConcreto2 extends Colega {
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje soy colega concreto 2");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concxreto2 envio 1 mensaje");
        mediator.reenvia(this);
    }
}
