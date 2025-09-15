package pinturaCone;
public class coneClasse {
	
	private final double PI = 3.14;
	private final double RENDIMENTO = 3.45;
	private final double litrosLata = 18;
	private final double [] valores = {238.90, 467.98, 758,34};
	
	private double raio = 1;
	private double altura = 1;
	
	private int tipo = 0;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPi() {
		return PI;
	}
	
	coneClasse(int t, double r, double a){
		raio = r;
		altura = a;
		tipo = t;
	}
	coneClasse(double r, double a){
		raio = r;
		altura = a;
	}
	
	coneClasse(){
		
	}
	
	coneClasse(int t){
		tipo = t;
	}
	
	public double giratriz(){
		return Math.pow(altura*altura + raio*raio, 0.5);
	}
	public double areaTotal() {
		return PI*raio*(raio+giratriz());
	}
	public double areaFundo() {
		return PI*raio*raio;
	}
	public double areaLateral(){
		return areaTotal() - areaFundo();
	}
	public double qTinta() {
		return areaTotal()*RENDIMENTO;
	}
	public int latas() {
		return (int) Math.ceil(qTinta()/litrosLata);
	}
	public double valorTotal() {
		return latas()*valores[tipo - 1];
	}
	
	public String toString() {
		return "CONE\nraio: " + raio + "\naltura: " + altura + "\ntipo: " + tipo + "\n---------------" + "\nArea do Fundo: " + areaFundo() 
		+ "\nArea Lateral: " + areaLateral() + "\nArea Total: " + areaTotal() + "\n---------------" + "\nLitros: " + qTinta() + "\nLatas: " + latas()
		+ "\n---------------" + "\nPreço Total: R$" + valorTotal();
	}
	
}