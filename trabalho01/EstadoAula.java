package trabalho01;

import java.util.Date;

//implementa o estado da aula seguindo o padrão de projeto State
public interface EstadoAula {
    void iniciarAula(Aula aula, Date dataHora);
    void encerrarAula(Aula aula, Date dataHora);
    void excluirAula(Aula aula);
}

