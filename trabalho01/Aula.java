package trabalho01;

import java.util.Date;

public class Aula {
    private EstadoAula estadoAtual;
    @SuppressWarnings("unused")
    private Date dataHoraInicioPlanejado;
    @SuppressWarnings("unused")
    private Date dataHoraFimPlanejado;
    private Date dataHoraInicioReal;
    private Date dataHoraFimReal;

    public Aula(Date inicioPlanejado, Date fimPlanejado) {
        this.dataHoraInicioPlanejado = inicioPlanejado;
        this.dataHoraFimPlanejado = fimPlanejado;
        // Inicia a aula no estado Planejada
        this.estadoAtual = new Planejada();
    }

    public void setEstado(EstadoAula novoEstado) {
        this.estadoAtual = novoEstado;
    }
    public EstadoAula getEstado() {
        return this.estadoAtual;
    }

    public Date getDataHoraInicioReal() {
        return dataHoraInicioReal;
    }

    public void setDataHoraInicioReal(Date dataHoraInicioReal) {
        this.dataHoraInicioReal = dataHoraInicioReal;
    }

    public Date getDataHoraFimReal() {
        return dataHoraFimReal;
    }

    public void setDataHoraFimReal(Date dataHoraFimReal) {
        this.dataHoraFimReal = dataHoraFimReal;
    }

    public void iniciarAula(Date dataHora) {
        estadoAtual.iniciarAula(this, dataHora);
    }

    public void encerrarAula(Date dataHora) {
        estadoAtual.encerrarAula(this, dataHora);
    }

    public void excluirAula() {
        estadoAtual.excluirAula(this);
    }
}
