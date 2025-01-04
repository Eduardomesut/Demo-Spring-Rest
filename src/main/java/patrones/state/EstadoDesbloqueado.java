package patrones.state;

public class EstadoDesbloqueado extends Estado{
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear() El móvil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));

        return "abrirCamara() Cámara abierta puiedes hacer foto";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto() No se puede hacer foto sin abrir la cámara";
    }
}
