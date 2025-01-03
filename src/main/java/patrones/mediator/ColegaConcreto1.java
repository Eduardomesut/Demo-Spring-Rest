package patrones.mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje soy colega concreto 1");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concxreto1 envio 1 mensaje");
        mediator.reenvia(this);
    }
}
