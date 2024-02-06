public class Trem extends Veiculos {
    private int NumPassageiros;

    public Trem(String marca, String modelo, int ano, int NumPassageiros) {
        super(marca, modelo, ano);
        this.NumPassageiros = NumPassageiros;
    }

    public int getNumPassageiros() {
        return NumPassageiros;
    }

    public void setNumPassageiros(int NumPassageiros) {
        this.NumPassageiros = NumPassageiros;
    }

    @Override
    public void acelerar() {
        System.out.println("O Trem " + getMarca() + " estará chegando ao seu destino na cidade de Rio Branco em breve com " + NumPassageiros + " passageiros a bordo");
    }
}