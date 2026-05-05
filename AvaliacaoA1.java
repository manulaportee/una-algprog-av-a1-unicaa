import java.util.Scanner;

public class AvaliacaoA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) ao Sistema Sentinela, insira o seu nome de usuário: ");
        String nome  = scanner.next();
        System.out.println(nome + ", insira o seu cargo de ocupação: (Cientista, Engenheiro, Zelador ou Administrativo;");
        String cargo = scanner.next();
        System.out.println(nome + ", insira o nível de acesso do seu usuário (1 a 10):");
        int nivelAcesso = scanner.nextInt();

        if (nivelAcesso < 1 && nivelAcesso > 10){
            System.out.println("ERRO: Nível de acesso inválido.");
        }

        System.out.println(nome + ", insira o nível de sigilo da área que deseja acessar (1 a 10): ");
        int nivelSigilo = scanner.nextInt();

        if (nivelSigilo < 1 && nivelSigilo > 10){
            System.out.println("ERRO: Nível de acesso inválido.");
        }
//---------------------------------------------
        if (nivelAcesso >= nivelSigilo){
            System.out.println("ACESSO PERMITIDO.");
        } else { 
            System.out.println("INFORMAÇÕES DO USUÁRIO: \nNome: " + nome + "\nCargo: " + cargo);
            System.out.println("ALERTA DE SEGURANÇA! Tentativa de acesso indevido detectada! \nO seu nível de acesso é mais baixo que a área de sigilo solicitada.");
            System.out.println("ACESSO NEGADO.");
            return;
        }
//---------------------------------------------
        System.out.println("INFORMAÇÕES DO USUÁRIO: \nNome: " + nome + "\nCargo: " + cargo + "\nNível Acesso: " + nivelAcesso + "\nNível Sigilo: " + nivelSigilo);

        int nivelAutoridade = nivelAcesso - nivelSigilo;
        System.out.println("O saldo de autoridade do usuário é: " + nivelAutoridade);
        scanner.close();        
    }
}
