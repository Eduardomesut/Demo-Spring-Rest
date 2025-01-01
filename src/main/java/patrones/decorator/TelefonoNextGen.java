package patrones.decorator;

public class TelefonoNextGen extends TelefonoDecorator{
    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }
    @Override
    public void crear(){
        super.crear();
        System.out.println("           -> Tengo 5G");
    }
}
