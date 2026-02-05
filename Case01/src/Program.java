public class Program {
    public static void main(String[] args) throws Exception {

        /*Livro 01:
        Código: 1598FHK
        Título: Core Java 2
        Autores: Cay S. Horstmann e Gary Cornell
        ISBN: 0130819336
        Ano: 2005 */

        Livro livro1 = new Livro();
        System.out.println("\nLivro 1\n");

        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.autores = new String[]{
            "Cay S. Horstmann",
            "Gary Cornell"
        };
        livro1.isbn = "0130819336";
        livro1.ano = 2005;

        System.out.format("\nCodigo: %s \nTitulo: %s \nAutores: %s \nISBN: %s \nAno: %d",
            livro1.codigo, livro1.titulo, String.join(",", livro1.autores), livro1.isbn,
            livro1.ano
        );



    }
}
