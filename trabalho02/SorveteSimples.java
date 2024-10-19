package trabalho02;

public class SorveteSimples implements Sorvete {
    private String sabor;
    private double precoBase;

    public SorveteSimples(String sabor, double preco) {
        this.sabor = sabor;
        this.precoBase = preco;
    }

    @Override
    public double preco() {
        return precoBase;
    }

    @Override
    public String descricao() {
        return "Sorvete de " + sabor;
    }
}
