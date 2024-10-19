package trabalho01;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) throws IOException {
        Date inicioPlanejado = new Date();
        Date fimPlanejado = new Date(inicioPlanejado.getTime() + 3600000); // 1 hora depois

        Date inicioReal = new Date();
        Date fimReal = new Date();

        Date dataAtual = new Date();

        Aula aula = new Aula(inicioPlanejado, fimPlanejado);

        System.out.println("Estado atual da aula: " + aula.getEstado());
        // Transição de estados
        aula.iniciarAula(new Date());    // Muda de Planejada para Em Realização

        System.out.println("Estado atual da aula: " + aula.getEstado());
        aula.encerrarAula(new Date());   // Muda de Em Realização para Realizada

        System.out.println("Estado atual da aula: " + aula.getEstado());
        aula.excluirAula();              // Exclui após ser realizada

        System.out.println("Estado atual da aula: " + aula.getEstado());
   
        // Usuário insere as informações para iniciar a aula
        System.out.println("Inicie a aula inserindo o horário planejado de inicio (Formato dd/MM/yyyy HH:mm:ss):" );
        Scanner scanner = new Scanner(System.in);
        
        String inicioPlanejadoNaoNormalizado = scanner.nextLine();

        // Formato correto com apenas 1 espaço entre data e hora
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setLenient(false); // Garantir que a data seja estritamente validada
        try {
            inicioPlanejado = sdf.parse(inicioPlanejadoNaoNormalizado);
        } catch (ParseException e) {
            System.out.println("Erro ao converter o horário de início planejado: " + e.getMessage());
        }

        System.out.println("Horário de início planejado inserido com sucesso.");
        System.out.println("Inicie a aula inserindo o horário planejado de fim (Formato dd/MM/yyyy HH:mm:ss):" );
    

        String fimPlanejadoNaoNormalizado = scanner.nextLine();
        try {
            fimPlanejado = sdf.parse(fimPlanejadoNaoNormalizado);
        } catch (ParseException e) {
            System.out.println("Erro ao converter o horário de fim planejado: " + e.getMessage());
        }

        System.out.println("Horário de fim planejado inserido com sucesso.");
        
        aula = new Aula(inicioPlanejado, fimPlanejado);
    
        System.out.println("Aula planejada com sucesso, Estado: " + aula.getEstado().toString());

        /////////////////////////

        System.out.println("Insira a data e hora atual (Formato dd/MM/yyyy HH:mm:ss):" );
        String dataAtualNaoNormalizado = scanner.nextLine();

        try {
            dataAtual = sdf.parse(dataAtualNaoNormalizado);
            System.out.println("Data atual: " + dataAtual.toString());
            System.out.println("Data de fim planejado: " + fimPlanejado.toString());
            if (dataAtual.after(fimPlanejado)) {
                System.out.println("Aula Não Realizada, Estado: " + aula.getEstado().toString());
                aula.excluirAula();
                System.out.println("Aula excluída, Estado: " + aula.getEstado().toString());
                return; // Se a aula foi excluída, não continuar o processo
            }

            System.out.println("Aula planejada, Estado: " + aula.getEstado().toString());

        } catch (ParseException e) {
            System.out.println("Erro ao converter a data atual: " + e.getMessage());
        }

        System.out.println("Inicie a aula inserindo o horário de início real (Formato 'dd/MM/yyyy HH:mm:ss'):" );
        String inicioRealNaoNormalizado = scanner.nextLine();

        try {
            inicioReal = sdf.parse(inicioRealNaoNormalizado);
        } catch (ParseException e) {
            System.out.println("Erro ao converter o horário de início real: " + e.getMessage());
        }

        System.out.println("Horário de início real inserido com sucesso.");

        aula.iniciarAula(inicioReal);

        System.out.println("Aula iniciada com sucesso, Estado: " + aula.getEstado().toString());

        System.out.println("Finalize a aula inserindo o horário de fim real (Formato dd/MM/yyyy HH:mm:ss):" );
        String fimRealNaoNormalizado = scanner.nextLine();

        try {
            fimReal = sdf.parse(fimRealNaoNormalizado);
        } catch (ParseException e) {
            System.out.println("Erro ao converter o horário de fim real: " + e.getMessage());
        }

        System.out.println("Horário de fim real inserido com sucesso.");

        aula.encerrarAula(fimReal);

        System.out.println("Aula concluída com sucesso, Estado: " + aula.getEstado().toString());

        aula.excluirAula();

        System.out.println("Aula excluída com sucesso, Estado: " + aula.getEstado().toString());

        aula.excluirAula();

        aula.iniciarAula(dataAtual);

        aula.encerrarAula(dataAtual);
    }
}
