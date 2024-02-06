public class Moto extends Veiculos {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + getModelo() + " está ganhando velocidade e se aproximando a 200 km/h.");
    }
}