public class AlgebraVectorial {
    private double x;
    private double y;

    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
    }

    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double productoPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y;
    }

    public double modulo() {
        return Math.sqrt(x * x + y * y);
    }

    public boolean esPerpendicular(AlgebraVectorial v) {
        return this.productoPunto(v) == 0;
    }


    public boolean esParalelo(AlgebraVectorial v) {
        return this.x * v.y == this.y * v.x;
    }

    public AlgebraVectorial proyeccion(AlgebraVectorial b) {
        double escalar = this.productoPunto(b) / Math.pow(b.modulo(), 2);
        return new AlgebraVectorial(escalar * b.x, escalar * b.y);
    }

    public double componente(AlgebraVectorial b) {
        return this.productoPunto(b) / b.modulo();
    }

    public void mostrar() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
