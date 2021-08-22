public class Main {

    public static void main(String[] args) {
        mediaNotas();
    }

    private static void mediaNotas(){
        float nota1 = 8.5F;
        float nota2 = 5.5F;
        float nota3 = 7.5F;
        float nota4= 6F;

        float soma = nota1 + nota2 + nota3 + nota4;
        System.out.println("A soma total de notas é: " + soma);

        float div = soma/4;
        float arredondarNota = Math.round(div);
        System.out.println("A média total foi de: " + arredondarNota);

    }

}
