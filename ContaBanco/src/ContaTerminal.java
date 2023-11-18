import java.util.Scanner;

public class ContaTerminal {
	 public static void main(String[]args){
	int numero;
	String agencia;
	String nomeDoCliente;
	double saldo;
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("Por favor entre com o numero da conta ");
	 numero = sc.nextInt();
	 System.out.println("Agora entre com a agencia ");
	 agencia = sc.next();
	 System.out.println(" Por favor escreva seu nome ");
	 nomeDoCliente = sc.next();
	 System.out.println(" Entre com o valor do 1º deposito ");
	 saldo = sc.nextDouble();	 
	 
	 
	 System.out.println("Ola "+ nomeDoCliente +" Obrigado por abrir uma conta conosco sua agencia é "
			 
			 + agencia + "  conta  " + numero +"  e seu saldo R$"+ saldo + "   ja esta disponivel para saque");
	  

	 }

	

}
