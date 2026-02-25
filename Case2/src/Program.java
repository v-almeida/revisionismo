public class Program {
    public static void main(String[] args) throws Exception {
        
        // 1. Crie um objeto ponto1 usando o primeiro construtor; 

        Ponto ponto1 = new Ponto();

        // 2. Crie um objeto ponto2 na posição (2,5); 

        Ponto ponto2 = new Ponto(2,5);

        // 3. Calcule a distância do ponto1 ao ponto2; 

        double distancia1 = ponto1.calcularDistancia(ponto2);
        System.out.printf("Distância entre o ponto1 ao ponto2: %.2f%n", distancia1);

        // 4. Calcule a distância do ponto2 às coordenadas (7,2);

        Ponto ponto3 = new Ponto(7,2);
        double distancia2 = ponto2.calcularDistancia(ponto3);
        System.out.printf("O calculo da distância do ponto2 pelas coodernadas (7,2) é: %.2f%n ",
            distancia2
        );

        // 5. Altere o valor de x para 11 no ponto1;

        ponto1.setX(11);
        System.out.println("Valor de X alterado para " + ponto1.getX());

        // 6. Altere o valor de y para 3 no ponto1; 

        ponto1.setY(3);

        System.out.println("Valor Y alterado para " + ponto1.getY());


    }
}
