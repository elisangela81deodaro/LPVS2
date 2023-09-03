public class Main {
    public static void main(String[] args) {
        // Crie três objetos Triangulos com diferentes lados
        Triangulos Triangulos1 = new Triangulos(3, 4, 6);
        Triangulos Triangulos2 = new Triangulos(4, 7, 7);
        

        // Verifique se os triângulos são válidos
        if (Triangulos1.ehTriangulosValido()) {
            System.out.println("Triângulo 1 é válido.");
        } else {
            System.out.println("Triângulo 1 não é válido.");
        }

        if (Triangulos2.ehTriangulosValido()) {
            System.out.println("Triângulo 2 é válido.");
        } else {
            System.out.println("Triângulo 2 não é válido.");
        }

        // Verifique se os triângulos têm lados iguais entre si
        if (Triangulos1.temLadoIgual(Triangulos2)) {
            System.out.println("Triângulo 1 e Triângulo 2 têm um lado igual.");
        } else {
            System.out.println("Triângulo 1 e Triângulo 2 não têm lados iguais.");
        }

        // Encontre o triângulo com o maior perímetro
        Triangulos maiorPerimetro = Triangulos1.TriangulosComMaiorPerimetro(Triangulos2);
        System.out.println("O triângulo com maior perímetro é: " + maiorPerimetro.obterLados());
    }
}
