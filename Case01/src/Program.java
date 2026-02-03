public class Program {
    public static void main(String[] args) throws Exception {

        // Livro 01

        Livro livro1 = new Livro();

        System.out.println("\nLivro 01\n");

        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.autores = new String[]{
            "Cay S. Horstmann",
            "Gary Cornell"
        };
        livro1.isbn = "0130819336";
        livro1.ano = 2005;

        // print

        System.out.format("Codigo: %s \nTitulo: %s \nutores: %s \nISBN: %s \nAno: %d \n",
            livro1.codigo, livro1.titulo, String.join(", ", livro1.autores),
            livro1.isbn, livro1.ano
        );

        // Livro 02

        Livro livro2 = new Livro();

        System.out.println("\nLivro 02\n");

        livro2.codigo = "9865PLO";
        livro2.titulo = "Java, Como programar";
        livro2.autores = new String[]{"Harvey Deitel"};
        livro2.isbn = "0130341517";
        livro2.ano = 2015;

        // print

        System.out.format("Código: %s \nTitulo: %s \nAutores: %s \nISBN: %s \nAno: %d \n ",
            livro2.codigo, livro2.titulo, String.join(" ", livro2.autores),
            livro2.isbn, livro2.ano
        );

    }
}
