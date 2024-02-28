package estudos.java.testesRabbitMQ2.testesRabbitMQ2.entity;

import org.springframework.stereotype.Component;

@Component
public class Pagamento {

    private String numeroPedido;
    private int valor;
    private String produto;

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public int getValor() {
        return valor;
    }

    public String getProduto() {
        return produto;
    }

}
