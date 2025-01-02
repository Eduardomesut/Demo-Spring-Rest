package patrones.iterator;

public interface UsuarioIterator {
    Usuario next();
    void reset();
    boolean hasMore();
}
