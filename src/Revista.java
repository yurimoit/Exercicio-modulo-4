public class Revista implements Produto{

    private String nome;

    private double valor;

    @Override
    public double desconto() {
        this.valor=this.valor-(Produto.super.desconto()*this.valor);
        return this.valor;
    }

    public Revista(String nome,double valor) {
        this.nome = nome;
        this.valor=valor;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
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
}
