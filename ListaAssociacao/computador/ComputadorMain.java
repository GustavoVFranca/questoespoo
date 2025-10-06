package computador;
public class ComputadorMain {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "i7-12700K", 3.8f, 25f);
        Memoria memoria = new Memoria("Corsair", "Vengeance", 16f, 3200f);
        HD hd = new HD("Seagate", "Barracuda", 2000f, 7200);
        PlacaMae placaMae = new PlacaMae("ASUS", "Prime Z690", processador, hd, memoria);
        Gabinete gabinete = new Gabinete("Cooler Master", "Mid Tower", 4, placaMae);
        Teclado teclado = new Teclado("Logitech", "Mecânico");
        Mouse mouse = new Mouse("Razer", "Óptico");
        Monitor monitor = new Monitor("LG", "LED", "1920x1080");

        Computador computador = new Computador(110f, 500f, "Dell", "Inspiron XPS", gabinete, teclado, mouse, monitor);

        System.out.println(processador); 	
        System.out.println(memoria); 	
        System.out.println(hd); 	
        System.out.println(placaMae); 	
        System.out.println(gabinete); 	
        System.out.println(teclado); 	
        System.out.println(mouse); 	
        System.out.println(computador); 	
    }
}
