package trabalho02;


public class Casquinha extends RecipienteDecorator {
    public Casquinha(Sorvete sorvete) {
        super(sorvete, "Casquinha", 1.50);
    }
}
