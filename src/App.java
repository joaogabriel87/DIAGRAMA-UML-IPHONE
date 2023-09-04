import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        iphone iphone = new iphone(1987, "XR","PRATA" );

        iphone.Ligar();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Menu telefone");
        System.out.println("------------------------");
        System.out.println("1 - Reprodutor Musical \n2 -  Aparelho telefonico \n3 - Navegar na internet \n4 - Desligar telefone");

         int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                iphone.selecionarMusica();
                iphone.pausar();
                iphone.tocarMusica();
                break;

            case 2:
            iphone.fazerChamada("123456789");
            iphone.receberChamada();
            break;

            case 3: 
            iphone.abirPagina("Twiiter");
            iphone.fecharPagina();
            break;

            case 4: 
            iphone.Desligar();
            break;
        
            default:
                break;
        }
    }
}
