package pinturaPiramide;

public class piramideClasse {

	private final double[] VALORES = {127.90, 258.98 ,344.34};
	private final int LITROSL = 18;
	private final double RENDIMENTO = 4.76;
	
	private double h = 1;
	private double ab = 1;
	private int tipo = 1;
	
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		this.ab = ab;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double[] getVALORES() {
		return VALORES;
	}
	public int getLITROSL() {
		return LITROSL;
	}
	public double getRENDIMENTO() {
		return RENDIMENTO;
	}
	piramideClasse(){
		
	}
	piramideClasse(double AB, double H, int t){
		ab = AB;
		h = H;
		tipo = t;		
	}
	public double a1() {
		return Math.sqrt(h*h + ab*ab);
	}
	public double areaTriangulo() {
		return ab * a1();
	}
	public double areaBase() {
		return Math.pow(2 * ab, 2);
	}
	public double areaTotal() {
		return 4*areaTriangulo() + areaBase();
	}
	public double volumePiramide() {
		return (1.0/3.0) * areaBase() * h;
	}
	public double qTinta() {
		return areaTotal()/RENDIMENTO;
	}
	public int latas() {
		return (int) Math.ceil(qTinta()/LITROSL);
	}
	public double valorTotal() {
		return latas()*VALORES[tipo-1];
	}
	public String toString() {
		return "ab: " + ab + "\nh: " + h + "\na1: " + a1() + "\nArea do Triangulo: " + areaTriangulo() + "\nArea da Base: " + areaBase() + "\nArea Total: "+ areaTotal()
		+ "\ntipo: " + tipo + "\nlitros: " + qTinta() + "\nLatas: " + latas() + "\nvalor Total: " + valorTotal() + "\nVolume: " + volumePiramide();
	}
	
	
}
