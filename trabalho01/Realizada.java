package trabalho01;
import java.util.Date;

public class Realizada implements EstadoAula {

    @Override
    public void iniciarAula(Aula aula, Date dataHora) {
        System.out.println("A aula já foi realizada, não pode ser reiniciada.");
    }

    @Override
    public void encerrarAula(Aula aula, Date dataHora) {
        System.out.println("A aula já está concluída.");
    }

    @Override
    public void excluirAula(Aula aula) {
        System.out.println("Aula excluída após ser realizada.");
    }
}

