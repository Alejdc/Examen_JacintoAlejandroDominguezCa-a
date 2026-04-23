import java.util.Scanner;
public class CLibro {
    /**
     * Declaracion de Scanner
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Creacion de variables.
     */
    public String titulo;
    public String autor;
    public int ejemplares;
    public int prestados;
    public int cantidad;

    public CLibro() {
    }
   /**
    * 
    * @param titulo es el titulo del libro.
    * @param autor quien escribio el libro.
    * @param ejemplares cantidad de ejemplares existentes.
    * @param prestados la cantidad de libros prestados.
    */
    public CLibro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
/**
 * La cantidad de los libros que cambiara, esto es para poder cambiarlo en la consola y no en el codigo.
 * @return Cuando añadas la cantidad, te devolvera el numero que añadiste, para que estes seguro.
 */
   public void operativa_libro(){
 System.out.println("¿Cantidad de libros en la siguiente operacion?");
 cantidad = sc.nextInt();
 System.out.println("La siguiente cantidad que cambiara sera: " + cantidad);
    }





/**
 * Prestar libros en existencias.
 * @param cantidad es la cantidad de libros que a prestar, solo si el numero de ejemplares es mayor a la suma de ambos.
 * @return Suma cantidad a prestados.
 */
    public boolean prestar(int cantidad) {
        if ((prestados + cantidad) <= ejemplares) {
            prestados = prestados + cantidad;
            return true;
        } else {
            return false;
        }
    }
/**
 * Devolver libros prestado.
 * @param cantidad Es la cantidad de libros a devolver, solo si la resta de este y prestados es mayor o igual a 0, funcionara.
 * @return Restar en cantidad a presatados
 */
    public boolean devolver(int cantidad) {
        if ((prestados - cantidad) >= 0) {
            prestados = prestados - cantidad;
            return true;
        } else {
            return false;
        }
    }
/**
 * Mostrar el estado de el libro deseado
 * @return mostrara el estado del libro deseado.
 */
    public void mostrarEstado() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Prestados: " + prestados);
    }


 
}