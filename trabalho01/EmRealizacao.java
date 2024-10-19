package trabalho01;

import java.util.Date;

public class EmRealizacao implements EstadoAula {

    @Override
    public void iniciarAula(Aula aula, Date dataHora) {
        System.out.println("A aula já está em realização.");
    }

    @Override
    public void encerrarAula(Aula aula, Date dataHora) {
        System.out.println("Aula encerrada no estado Em Realização.");
        aula.setDataHoraFimReal(dataHora);
        aula.setEstado(new Realizada());
    }

    @Override
    public void excluirAula(Aula aula) {
        System.out.println("A aula está em andamento e não pode ser excluída.");
    }
}

