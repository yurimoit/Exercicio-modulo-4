// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Revista revista1=new Revista("Exame",150);
        revista1.desconto();

        System.out.println(revista1);


        TipoLivro livro1=new TipoLivro("Matemática",50.0);
        livro1.formatoLivro("fisico");
        livro1.desconto();

        System.out.println(livro1);

    }
}