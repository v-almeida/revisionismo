public class Program {
    public static void main(String[] args) throws Exception {
        
       // 1. Crie um objeto ponto1 usando o primeiro construtor; 
       
       Ponto ponto1 = new Ponto();

       // 2. Crie um objeto ponto2 na posição (2,5); 

       Ponto ponto2 = new Ponto(2,5);

       // 4. Calcule a distância do ponto2 às coordenadas (7,2); 

       double distancia1 = ponto1.calcularDistancia(ponto2);
       System.out.printf("A distância do ponto2 às coodernadas (7,2) é %.2f ", distancia1);

       // 5. Altere o valor de x para 10 no ponto1; 

       ponto1.setX(10);

       System.out.println("\nValor de x agora é " + ponto1.getX());

       // 6. Altere o valor de y para 3 no ponto1; 

        


    }
}
