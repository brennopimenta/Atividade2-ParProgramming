import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("---------------------------------------------------------------------");
        System.out.println("    UTFPR - UNIVERSIDADE TECNOLOGICA FEDERAL DO PARANA");
        System.out.println("    DISCIPLINA: Métodos Ágeis de Desenvolvimento de Software");
        System.out.println("    DOCENTE: Prof. José Augusto Fabri");
        System.out.println("    DISCENTES:");
        System.out.println("        - BRENNO PIMENTA DA COSTA");
        System.out.println("        - SOLANO AMADORI TODESCHINI");
        System.out.println("");
        System.out.println("                ATIVIDADE SOBRE PROGRAMACAO EM PARES");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");

        String sNome, sHistorico;
        int nOpcao;

        /* Gravar Arquivo - Brenno */
        System.out.print("Digite o nome do Paciente: ");
        Scanner input1 = new Scanner(System.in);
        sNome = input1.nextLine();

        System.out.println("Informe o Historico do Atendimento: ");
        Scanner input2 = new Scanner(System.in);
        sHistorico = input2.nextLine();

        gravarArquivo(sNome, sHistorico);
        System.out.println("Atendimento Realizado com Sucesso!!!");
        System.out.println("*");
        System.out.println("*");

        /* Ler arquivo - (PAR) Solano e Brenno */
        System.out.println("Deseja Ler o Prontuario do Paciente? Digite: 1 - (Para Sim) e 0 - (Para Nao) -->");
        Scanner input3 = new Scanner(System.in);
        nOpcao = input3.nextInt();

        if (nOpcao == 1) {
            System.out.println("Carregando prontuario do Paciente ...");
            lerArquivo();
            System.out.println("");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Obrigado por utilizar o Sistema de Brenno e Solano!!");
        System.out.println("");
        System.out.println("Atividade Realizada utilizando a Linguagem de programacao JAVA e a ");
        System.out.println("Ferramenta Colab do Google para dividir a tela do computador facilitando");
        System.out.println("o uso da metodologia de Par-Programming defendida no XP");
    }

    // Criado por Brenno
    private static void gravarArquivo(String sNome, String sHistorico) throws IOException {
        FileWriter arquivo = new FileWriter("\\arquivo.txt");
        PrintWriter gravarArquivo = new PrintWriter(arquivo);
        gravarArquivo.printf("+-------- PRONTUARIO ------ Data: " + LocalDate.now() + "%n  ");
        gravarArquivo.printf("Nome: " + sNome + "%n Historico: " + sHistorico);
        arquivo.close();
    }

    // Criado por Brenno e Solano - Par Programming
    public static void lerArquivo() throws IOException {
        FileReader arq = new FileReader("\\arquivo.txt");
        BufferedReader lerArq = new BufferedReader(arq);
        while(lerArq.ready()){
            System.out.println(lerArq.readLine());
        }
        lerArq.close();
    }

}
