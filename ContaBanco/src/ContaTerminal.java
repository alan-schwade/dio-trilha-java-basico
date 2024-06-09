import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String Agencia = new String();
    int Numero;
    String NomeCliente = new String();
    float Saldo;
        
        //inicio
        System.out.println("----------Simulador Conta Bancária------------");
        
            //verificação do numero da agência
            do{
            System.out.println("Por favor, Digite o número da Agência: ");
            Numero = scanner.nextInt();
                if(!validarNumero(Numero)){
                System.out.println("--ERRO: Esse número não possui 4 digitos, tente novamente--");
                }
            }while(!validarNumero(Numero));
        scanner.nextLine();
        //verificação agência
        do{
        System.out.println("Digite a Agência (xxx-x)");
        Agencia = scanner.nextLine();
        if (!validarAgencia(Agencia)){
            System.out.println("--ERRO: Tente novamente, faça como no exemplo (123-4)--");
        }}while (!validarAgencia(Agencia));

        System.out.println("Digite o seu nome: ");
        NomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        Saldo = scanner.nextFloat();

        //mensagem final
        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");

        scanner.close();
    }
    //contar digitos e validar o inteiro número
    public static boolean validarNumero(int numero){
        return (String.valueOf(numero).length() == 4);
    }
    //metodo  para validar a agência
    public static boolean validarAgencia(String agencia){
        return (agencia.charAt(3) == '-' && agencia.length() == 5);
    }
}
