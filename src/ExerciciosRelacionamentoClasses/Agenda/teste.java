package ExerciciosRelacionamentoClasses.Agenda;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();
        String telefone = scan.nextLine();
        String email = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++){
            System.out.println("Entre com as informações do contato " + i);
            Contato c = new Contato();

            System.out.println("Entre com o nome");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone");
            telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email");
            email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
}
