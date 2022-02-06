package State;

public class EstadoHacerFoto extends Estado{

    public EstadoHacerFoto(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): El móvil ya se encontraba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): Camara abierta. Procede.";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): La foto ya se ha hecho.";
    }
}
