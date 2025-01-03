package patrones.state;

public class EstadoBloqueado extends Estado{


    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));

        return "desbloquear() Móvil desbloqueado!";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara() La cámara esta bloqueada. Desbloquea el móvil antes";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto() La cámara esta bloqueada. Desbloquea el móvil antes";
    }
}
