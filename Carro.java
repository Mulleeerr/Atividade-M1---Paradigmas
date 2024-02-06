public class Carro extends Veiculos {
    private int NumPortas;

    public Carro(String marca, String modelo, int ano, int NumPortas) {
        super(marca, modelo, ano);
        this.NumPortas = NumPortas;
    }

    public int getNumPortas() {
        return NumPortas;
    }

    public void setNumPortas(int NumPortas) {
        this.NumPortas = NumPortas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + getMarca() + " está acelerando e as pessoas estão olhando");
    }
}