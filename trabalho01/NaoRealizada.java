package trabalho01;

import java.util.Date;

public class NaoRealizada implements EstadoAula {

    @Override
    public void iniciarAula(Aula aula, Date dataHora) {
        System.out.println("A aula foi excluída e não pode ser iniciada.");
    }

    @Override
    public void encerrarAula(Aula aula, Date dataHora) {
        System.out.println("A aula foi excluída e não pode ser encerrada.");
    }

    @Override
    public void excluirAula(Aula aula) {
        System.out.println("A aula já está no estado Não Realizada.");
    }



}

