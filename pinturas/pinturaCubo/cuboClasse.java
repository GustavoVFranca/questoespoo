package pinturaCubo;

public class cuboClasse {
	private final double [] VALORES = {101.90, 212.45, 345.56};
	private final double LITROSL = 18;
	
	private double altura = 1;
	private double rendimento = 1;
	private int tipo = 1;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double[] getValor() {
		return VALORES;
	}
	public double getLitrosLata() {
		return LITROSL;
	}
	
	cuboClasse(){
		
	}
	cuboClasse(double a, double r, int t){
		altura = a; 
		rendimento = r;
		tipo = t;
	}
	public double areaQuadrado() {
		return altura*altura;
	}
	public double volumeCubo() {
		return altura*altura*altura;
	}
	public double diagonalCubo() {
		return altura * Math.pow(3, 0.5);
	}
	public double areaTotal() {
		return 6*areaQuadrado();
	}
	public double qTinta() {
		return areaTotal()/rendimento;
	}
	public int latas() {
		return (int) Math.ceil(qTinta()/LITROSL);
	}
	public double valorTotal() {
		return latas()*VALORES[tipo-1];
	}
	public String toString() {
		return "CUBO\na: " + altura + "\nrendimento: " + rendimento + "\ntipo: " + tipo + "\n---------------" + "\nArea da Base: " + areaQuadrado() 
		+ "\nArea Total: " + areaTotal() + "\nVolume: " + volumeCubo() + "\nDiagonal do Cubo: " + diagonalCubo() + "\n---------------" + "\nLitros: " + qTinta() + "\nLatas: " + latas()
		+ "\n---------------" + "\nPreço Total: R$" + valorTotal();
	}
	
	
}
