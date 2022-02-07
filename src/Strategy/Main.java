package Strategy;

public class Main {
    public static void main(String[] args) {
        UsuariosMemoria usuarios = new UsuariosMemoria();

        usuarios.crear("Manolo");
        usuarios.crear("Pepe");
        usuarios.crear("Amanda");


        for (String usuario : usuarios.listar() ){
            System.out.println(usuario);
        }
    }
}
