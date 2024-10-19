package trabalho02;

public abstract class RecipienteDecorator implements Sorvete {
    protected Sorvete sorvete;
    protected String descricaoRecipiente;
    protected double precoRecipiente;

    public RecipienteDecorator(Sorvete sorvete, String descricao, double preco) {
        this.sorvete = sorvete;
        this.descricaoRecipiente = descricao;
        this.precoRecipiente = preco;
    }

    @Override
    public double preco() {
        return sorvete.preco() + precoRecipiente;
    }

    @Override
    public String descricao() {
        return sorvete.descricao() + " no " + descricaoRecipiente;
    }
}

