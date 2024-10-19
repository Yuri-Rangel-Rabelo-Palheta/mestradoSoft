package trabalho02;

public class Copo extends RecipienteDecorator {
    public Copo(Sorvete sorvete) {
        super(sorvete, "Copo", 0.20);
    }
}