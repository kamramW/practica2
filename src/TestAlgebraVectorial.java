public class TestAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(2, 3);
        AlgebraVectorial b = new AlgebraVectorial(4, -6);

        System.out.println("Producto punto: " + a.productoPunto(b));
        System.out.println("Perpendicular: " + a.esPerpendicular(b));
        System.out.println("Paralelo: " + a.esParalelo(b));

        AlgebraVectorial proy = a.proyeccion(b);
        System.out.print("Proyección: ");
        proy.mostrar();

        System.out.println("Componente: " + a.componente(b));
    }
}
