public class MiniLivro extends Livro{

    private String nome;

    private double valor;

    private String genero;

    @Override
    public void generoLivro(String genero) {
        this.genero=genero;
    }

    public MiniLivro(String nome, double valor) {
        this.nome = nome;
        this.valor=valor;
    }

    @Override
    public double desconto() {
        this.valor=this.valor-(super.desconto()*this.valor);
        return this.valor;
    }

    @Override
    public String toString() {
        return "Mini livro {" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", Gênero livro='" + genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
