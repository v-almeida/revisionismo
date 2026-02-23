public class Program {
    public static void main(String[] args) throws Exception {

        Livro livro1 = new Livro();
        System.out.println("Livro 01");

        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.autores = new String[]{"Cay S. Horstmann", "Gary Cornell"};
        livro1.isbn = "0130819336";
        livro1.ano = 2005;


    }
}
