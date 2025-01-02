package patrones.iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator{
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int posicion = 0;
    public void crear(Usuario usuario){
        usuarios.add(usuario);
    }
    @Override
    public Usuario next() {
        if (hasMore()){
            Usuario usuario = this.usuarios.get(posicion);
            posicion += 1;
            return usuario;
        }
        return null;
    }

    @Override
    public void reset() {
        posicion = 0;
    }

    @Override
    public boolean hasMore() {
        return posicion < usuarios.size();

    }
}
