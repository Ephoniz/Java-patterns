package State;

public class EstadoCamaraAbierta extends Estado{

    public EstadoCamaraAbierta(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): Movil actualmente desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): Camara ya está abierta.";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono ));
        return "hacerFoto(): Foto realizada con exito. Procede.";
    }
}
