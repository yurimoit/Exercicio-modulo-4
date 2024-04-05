public class TipoLivro extends Livro{

    private String nome;

    private double valor;

    private String tipo;

    @Override
    public void formatoLivro(String tipo) {
        this.tipo=tipo;
    }

    public TipoLivro(String nome, double valor) {
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
        return "TipoLivro{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", tipo='" + tipo + '\'' +
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
