package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean tipo = false;

        UsuariosMemoria usuarios = new UsuariosMemoria();

        crear(usuarios, "Manolo");
        crear(usuarios, "Pepe");
        crear(usuarios, "Amanda");


        for (String usuario : usuarios.listar() ){
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }

    public ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
