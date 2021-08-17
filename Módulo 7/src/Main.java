public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setAno(2021);
        carro.setModelo("5008");
        carro.setMarca("Peugeot");
        System.out.println(carro.getMarca() + ": " + carro.getModelo() + " | Ano: " + carro.getAno());
        carro.ligar();
        carro.desligado();
    }
}
