public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;
    //Classe padrao com as informaçoes de marca, modelo, ano e a funçao de acelerar que se altera dependendo do veiculo
    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    //Funçoes de Get e Set da classe Veiculos
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
}
