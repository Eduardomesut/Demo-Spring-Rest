package patrones.iterator;

public class Main {


    public static void main(String[] args) {


        Usuarios us = new Usuarios();
        us.crear(new Usuario("Juan", 23));
        us.crear(new Usuario("Peter", 23));
        us.crear(new Usuario("Jon", 23));
        us.crear(new Usuario("Mike", 23));
        System.out.println(us.next());
        System.out.println(us.next());
        System.out.println(us.next());
        System.out.println(us.next());
        System.out.println(us.next());

    }


}
