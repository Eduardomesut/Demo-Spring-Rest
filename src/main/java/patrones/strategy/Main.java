package patrones.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UsuariosFichero usuarios = new UsuariosFichero();
        crear(usuarios, "pepe");
        crear(usuarios, "luis");
        crear(usuarios, "mike");

        for (String usuario:listar(usuarios)) {
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuario, String nombre){
        usuario.crear(nombre);
    }
    public static ArrayList<String>listar(Usuarios usuario){
        return usuario.listar();
    }
}
