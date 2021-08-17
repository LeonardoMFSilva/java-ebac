public class Carro {


    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    private boolean desligado;


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligado() {
        if (this.ligado == true) {
            this.ligado = false;
            System.out.println("Carro desligado!");
        } else {
            System.out.println("O carro já está desligado!");
        }
    }
}
