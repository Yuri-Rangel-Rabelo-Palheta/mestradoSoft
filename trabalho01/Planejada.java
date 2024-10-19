package trabalho01;

import java.util.Date;

public class Planejada implements EstadoAula {

    @Override
    public void iniciarAula(Aula aula, Date dataHora) {
        System.out.println("Aula iniciada no estado Planejada.");
        aula.setDataHoraInicioReal(dataHora);
        aula.setEstado(new EmRealizacao());
    }

    @Override
    public void encerrarAula(Aula aula, Date dataHora) {
        System.out.println("Não é possível encerrar uma aula que ainda não foi iniciada.");
    }

    @Override
    public void excluirAula(Aula aula) {
        System.out.println("Aula excluída antes de ser iniciada.");
        aula.setEstado(new NaoRealizada());
    }
}
