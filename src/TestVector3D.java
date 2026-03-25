public class TestVector3D {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);

        System.out.print("Suma: ");
        a.sumar(b).mostrar();

        System.out.print("Escalar (2*a): ");
        a.escalar(2).mostrar();

        System.out.println("Modulo de a: " + a.modulo());

        System.out.print("Normal de a: ");
        a.normal().mostrar();

        System.out.println("Producto escalar: " + a.productoEscalar(b));

        System.out.print("Producto vectorial: ");
        a.productoVectorial(b).mostrar();
    }
}
