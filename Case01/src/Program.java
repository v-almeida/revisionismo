public class Program {
    public static void main(String[] args) throws Exception {
        
        // Livro 01

        Livro livro1 = new Livro();

        System.out.println("Livro 01");
        
        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.isbn = "0130819336";
        livro1.ano = 2005;

        System.out.format("Código: %s \nTitulo: %s \nISBN: %s \nAno: %d ", livro1.codigo,
            livro1.titulo, livro1.isbn, livro1.ano
        );


    }
}
