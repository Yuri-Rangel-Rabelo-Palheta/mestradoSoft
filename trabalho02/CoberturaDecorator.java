package trabalho02;

public abstract class CoberturaDecorator implements Sorvete {
    protected Sorvete sorvete;
    protected String descricaoCobertura;

    public CoberturaDecorator(Sorvete sorvete, String descricao) {
        this.sorvete = sorvete;
        this.descricaoCobertura = descricao;
    }

    @Override
    public double preco() {
        return sorvete.preco() + 0.50;
    }

    @Override
    public String descricao() {
        return sorvete.descricao() + " com cobertura de " + descricaoCobertura;
    }
}

