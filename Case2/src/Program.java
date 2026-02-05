public class Program {
    public static void main(String[] args) throws Exception {
        
        // construtores

        // 1. Crie um objeto ponto1 usando o primeiro construtor;

        Ponto ponto1 = new Ponto();

        // 2. Crie um objeto ponto2 na posição (2,5); 
        Ponto ponto2 = new Ponto(2, 5);

        // 3. Calcule a distância do ponto1 ao ponto2; 

        double distancia1 = ponto1.calcularDistancia(ponto2);
        System.out.printf("\nA distância entre o ponto 1 e 2 é: %.2f ", distancia1);

        // 4. Calcule a distância do ponto2 às coordenadas (7,2);

        Ponto ponto3 = new Ponto(7,2);
        double distancia2 = ponto2.calcularDistancia(ponto3);
        System.out.printf("\nA distância do ponto2 até às coordenadas (7,2) é: %.2f ", distancia2);

        // 5. Altere o valor de x para 10 no ponto1; 

        ponto1.setX(10);
        System.out.println("\nPonto1 foi setado em X para "+ ponto1.GetX());

        // 6. Altere o valor de y para 3 no ponto1; 

        ponto1.setY(3);
        System.out.println("\nPonto1 foi setado em Y para "+ ponto1.GetY());





    }
}
