import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0,numero2=0,opcion;
		Scanner teclado = new Scanner(System.in);
		CustomMaths miCustom = new CustomMaths();


		do{
			System.out.println("----Elija una opcion----");
			System.out.println("1. MCD");
			System.out.println("2. MCM");
			System.out.println("3. SERIE FIBONACCI");
			System.out.println("4. NUMEROS PRIMOS");
			System.out.println("5. SALIR");
			opcion=teclado.nextInt();


			switch(opcion){
			case 1:
				System.out.println("MCD... Introduzca 2 números por teclado: ");
				numero=teclado.nextInt();
				numero2=teclado.nextInt();
				miCustom.getMCD(numero,numero2);
				break;

			case 2:
				System.out.println("MCM... Introduzca 2 números por teclado: ");
				numero=teclado.nextInt();
				numero2=teclado.nextInt();
				miCustom.getMCM(numero, numero2);
				break;

			case 3:
				System.out.println("FIBONACCI... Introduzca un número por teclado: ");
				numero2=teclado.nextInt();
				miCustom.getFibonacci(numero2);
				break;

			case 4:
				System.out.println("PRIMO... Introduzca un número por teclado: ");
				numero=teclado.nextInt();
				System.out.println(miCustom.getPrimo(numero));
				break;
			}
		}while(opcion!=5);
	}

}
