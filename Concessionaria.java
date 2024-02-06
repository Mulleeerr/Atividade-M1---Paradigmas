public class Concessionaria {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro("Audi","RS6",2024,4);

        System.out.println("O Primeiro carro e um " + carro1.getMarca() + " , " + carro1.getModelo() + " , " + carro1.getAno());

    //Alterando atributos do carro
        carro1.setModelo("R8");
        carro1.setAno(2000);

        System.out.println("O Primeiro carro e um " + carro1.getMarca() + " , " + carro1.getModelo() + " , " + carro1.getAno());
    //Atributos Moto
        Moto moto1 = new Moto("Honda","CB1000",2015,true);

        System.out.println(moto1.getModelo());

        moto1.setModelo("Biz 125");
        moto1.setAno(2024);

        System.out.println(moto1.getModelo());
        System.out.println(moto1.getAno());
        moto1.acelerar();
    //Atributos Barco
        Barco barco1 = new Barco("BMW","Jetski",2000,"Barco de Corrida");

        System.out.println(barco1.getMarca() + " " + barco1.getModelo() + " " + barco1.getTipoBarco());

        barco1.setTipoBarco("Barco de Lazer");

        System.out.println("O barco " + barco1.getModelo() + " passou a ser um " + barco1.getTipoBarco());
        barco1.acelerar();
    //Atributos Trem
        Trem trem1 = new Trem("Mercedes","Estacao 12",2000,125);
        Trem trem2 = new Trem("BMW","Estacao 125",2024,1024);

        System.out.println(trem1.getMarca() + " " + trem1.getModelo() + " esta com " + trem1.getNumPassageiros() + " passageiros. ");
        System.out.println(trem2.getMarca() + " " + trem2.getModelo() + " esta com " + trem2.getNumPassageiros() + " passageiros. ");

        if(trem1.getNumPassageiros() > trem2.getNumPassageiros()) {
            System.out.println("O Primeiro trem tem mais passageiros");
        } else {
            System.out.println("o Segundo trem tem mais passageiros");
            trem2.acelerar();
        }

    carro1.acelerar();
    
}
}
