package CarroMotorPessoa;
public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    private Pessoa dono;
    private Motor motor;

    public Carro(String fabricante, String modelo, String cor, int ano, Pessoa dono, Motor motor) {
        setFabricante(fabricante);
        setModelo(modelo);
        setCor(cor);
        setAno(ano);
        setDono(dono);
        setMotor(motor);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if (fabricante != null && fabricante.length() > 0) {
            this.fabricante = fabricante;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && modelo.length() > 0) {
            this.modelo = modelo;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null && cor.length() > 0) {
            this.cor = cor;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Carro [fabricante=");
        builder.append(fabricante);
        builder.append(", modelo=");
        builder.append(modelo);
        builder.append(", cor=");
        builder.append(cor);
        builder.append(", ano=");
        builder.append(ano);
        builder.append(", dono=");
        builder.append(dono);
        builder.append(", motor=");
        builder.append(motor);
        builder.append("]");
        return builder.toString();
    }
}
