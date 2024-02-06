public class Barco extends Veiculos {
    private String tipoBarco;

    public Barco(String marca, String modelo, int ano, String tipoBarco) {
        super(marca, modelo, ano);
        this.tipoBarco = tipoBarco;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    @Override
    public void acelerar() {
        System.out.println("O barco está aumentando a velocidade na água.");
    }
}