package State;

public class Main {
    public static void main(String[] args) {
        Telefono telf1 = new Telefono();
        Telefono telf2 = new Telefono();

        System.out.println(telf1.estado.desbloquear());
        System.out.println(telf1.estado.abrirCamara());
        System.out.println(telf1.estado.hacerFoto());
        System.out.println(telf1.estado.hacerFoto());
    }
}
