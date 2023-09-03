public class Triangulos {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulos(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean ehTriangulosValido() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public boolean temLadoIgual(Triangulos outroTriangulos) {
        return this.lado1 == outroTriangulos.lado1 || this.lado1 == outroTriangulos.lado2 || this.lado1 == outroTriangulos.lado3 ||
               this.lado2 == outroTriangulos.lado1 || this.lado2 == outroTriangulos.lado2 || this.lado2 == outroTriangulos.lado3 ||
               this.lado3 == outroTriangulos.lado1 || this.lado3 == outroTriangulos.lado2 || this.lado3 == outroTriangulos.lado3;
    }

    public Triangulos TriangulosComMaiorPerimetro(Triangulos outroTriangulos) {
        double perimetro1 = this.lado1 + this.lado2 + this.lado3;
        double perimetro2 = outroTriangulos.lado1 + outroTriangulos.lado2 + outroTriangulos.lado3;

        if (perimetro1 > perimetro2) {
            return this;
        } else if (perimetro2 > perimetro1) {
            return outroTriangulos;
        } else {
            // Se os perímetros forem iguais, retornar qualquer um dos triângulos
            return this;
        }
    }

    public String obterLados() {
        return "(" + lado1 + ", " + lado2 + ", " + lado3 + ")";
    }
}
