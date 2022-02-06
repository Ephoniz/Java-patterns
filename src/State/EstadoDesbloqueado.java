package State;

public class EstadoDesbloqueado extends Estado{

    public EstadoDesbloqueado(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): El móvil ya se encontraba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): Camara abierta. Procede.";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): Camara bloqueada, por favor, abre la camara para poder usarla.";
    }
}
