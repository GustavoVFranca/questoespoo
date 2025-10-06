package HomeTheater;
public class HomeTheaterMain {
    public static void main(String[] args) {
        SistemaDeSom s = new SistemaDeSom("Sony", "X500", 500, 110, 60);
        SistemaDeVideo v = new SistemaDeVideo("LG", "UltraVision", "LED", "4K", 110, 120);
        HomeTheater h = new HomeTheater(s, v);

        System.out.println(s);
        System.out.println(v);
        System.out.println(h);
    }
}
