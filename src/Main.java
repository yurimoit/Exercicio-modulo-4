// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Revista revista1=new Revista("Exame",150);
        revista1.desconto();

        System.out.println(revista1);


        LivroFisico livro1=new LivroFisico("Matemática",50.0);
        livro1.generoLivro("Acadêmico");
        livro1.desconto();

        System.out.println(livro1);

        MiniLivro livro2=new MiniLivro("Harry Potter e a Câmara Secreta",40.0);
        livro2.generoLivro("Fantasia e aventura");
        livro2.desconto();

        System.out.println(livro2);

        Ebook livro3=new Ebook("Alien",70.0);
        livro3.generoLivro("Ficção científica");
        livro3.desconto();

        System.out.println(livro3);



    }
}