public class Vector3D {
    private double x, y, z;

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D sumar(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D escalar(double r) {
        return new Vector3D(r * x, r * y, r * z);
    }

    public double modulo() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public Vector3D normal() {
        double mod = this.modulo();
        return new Vector3D(x/mod, y/mod, z/mod);
    }

    public double productoEscalar(Vector3D v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }

    public Vector3D productoVectorial(Vector3D v) {
        double nx = this.y*v.z - this.z*v.y;
        double ny = this.z*v.x - this.x*v.z;
        double nz = this.x*v.y - this.y*v.x;
        return new Vector3D(nx, ny, nz);
    }

    public void mostrar() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}
