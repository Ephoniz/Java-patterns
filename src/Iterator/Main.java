package Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 5));
        usuarios.crear(new Usuario("dos", 34));
        usuarios.crear(new Usuario("tres", 44));
        usuarios.crear(new Usuario("cuatro", 43));
        usuarios.crear(new Usuario("cinco", 23));

        while(usuarios.hasMore()) {
            Usuario usuario = usuarios.next();
            System.out.println("Usuario es: " + usuario.getNombre());
        }

        usuarios.crear(new Usuario("seis", 14));
        usuarios.reset();
        Usuario usuario = usuarios.next();
        System.out.println("Usuario es: " + usuario.getNombre());



    }
}
