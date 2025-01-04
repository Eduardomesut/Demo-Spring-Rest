package patrones.state;

public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear() Ya estaba desbloqueado el móvil";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara() La cámara ya la habías abierto";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto() Realizando foto!!";
    }
}
