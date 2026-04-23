package biblioteca;

public class Main {

    public static void main(String[] args) {
        CLibro libro1;
        libro1 = new CLibro("El Quijote", "Miguel de Cervantes", 10, 2);

        libro1.mostrarEstado();
        libro1.prestar(2);
        libro1.devolver(1);
        libro1.mostrarEstado();
        libro1.operativa_libro();
        libro1.devolver();
    }
}