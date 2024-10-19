package trabalho02;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorvete sorvete = null;
        
        // Escolhendo o sabor do sorvete
        System.out.println("Escolha o sabor do sorvete:");
        System.out.println("1. Chocolate (R$1.50)");
        System.out.println("2. Morango (R$1.50)");
        System.out.println("3. Flocos (R$1.50)");
        System.out.println("4. Pavê (R$1.50)");
        System.out.println("5. Napolitano (R$1.50)");
        System.out.println("6. Chocolate Diet (R$2.00)");
        int saborEscolhido = scanner.nextInt();

        switch (saborEscolhido) {
            case 1:
                sorvete = new SorveteSimples("Chocolate", 1.50);
                break;
            case 2:
                sorvete = new SorveteSimples("Morango", 1.50);
                break;
            case 3:
                sorvete = new SorveteSimples("Flocos", 1.50);
                break;
            case 4:
                sorvete = new SorveteSimples("Pavê", 1.50);
                break;
            case 5:
                sorvete = new SorveteSimples("Napolitano", 1.50);
                break;
            case 6:
                sorvete = new SorveteSimples("Chocolate Diet", 2.00);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Escolhendo o recipiente
        System.out.println("Escolha o recipiente:");
        System.out.println("1. Copo (R$0.20)");
        System.out.println("2. Taça (Sem custo)");
        System.out.println("3. Casquinha (R$1.50)");
        int recipienteEscolhido = scanner.nextInt();

        switch (recipienteEscolhido) {
            case 1:
                sorvete = new Copo(sorvete);
                break;
            case 2:
                sorvete = new Taca(sorvete);
                break;
            case 3:
                sorvete = new Casquinha(sorvete);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Escolhendo coberturas
        System.out.println("Deseja adicionar cobertura?");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        int coberturaEscolhida = scanner.nextInt();

        while (coberturaEscolhida == 1) {
            System.out.println("Escolha a cobertura:");
            System.out.println("1. Cobertura de Chocolate (R$0.50)");
            System.out.println("2. Cobertura de Morango (R$0.50)");
            System.out.println("3. Cobertura de Caramelo (R$0.50)");
            int tipoCobertura = scanner.nextInt();

            switch (tipoCobertura) {
                case 1:
                    sorvete = new CoberturaChocolate(sorvete);
                    break;
                case 2:
                    sorvete = new CoberturaMorango(sorvete);
                    break;
                case 3:
                    sorvete = new CoberturaCaramelo(sorvete);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Deseja adicionar outra cobertura?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            coberturaEscolhida = scanner.nextInt();
        }

        // Exibindo o pedido final
        System.out.println("Seu pedido: " + sorvete.descricao());
        System.out.println("Preço total: R$ " + sorvete.preco());
        
        scanner.close();
    }
}
