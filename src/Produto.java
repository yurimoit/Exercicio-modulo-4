public interface Produto {

    static final double descontoValor=0.1;

    default double desconto(){
        return descontoValor;
    };
}
