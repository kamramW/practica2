public class TestMiPunto {
    public static void TestMiPunto(String[] args) {
        MiPunto p1 = new MiPunto(); // (0,0)
        MiPunto p2 = new MiPunto(10, 30.5);

        double dist = p1.distancia(p2);

        System.out.println("Distancia: " + dist);
    }
}
