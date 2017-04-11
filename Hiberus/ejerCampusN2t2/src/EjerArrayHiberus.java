import java.util.*;
public class EjerArrayHiberus{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int tamaño=0, pos1, pos2, numero, opcion;
		boolean salir=false;
		Operaciones Operaciones = new Operaciones(tamaño);
		
		do{
			try{
			System.out.println("----MENU----");
			System.out.println("1. Sumar Valores de un vector");
			System.out.println("2. Media de los elementos del vector");
			System.out.println("3. Copiar vector");
			System.out.println("4. Insertar elemento en la posicion deseada");
			System.out.println("5. Valor máximo y mínimo del vector");
			System.out.println("6. Invertir valores del vector");
			System.out.println("7. Encontrar valores duplicados.");
			System.out.println("8. Salir");
			
			opcion=teclado.nextInt();
			
			switch(opcion){
			case 1:
				System.out.println("Escriba el tamaño del vector: ");
				tamaño=teclado.nextInt();
				CreaVector vectorppal = new CreaVector(tamaño);
				vectorppal.setVector();
				
				System.out.println("Inserte las posiciones que desea sumar: ");
				pos1=teclado.nextInt();
				pos1--;
				pos2=teclado.nextInt();
				pos2--;
				System.out.println(Operaciones.getSumaValores(pos1,pos2, tamaño));
				break;
			case 2:
				System.out.println(Operaciones.getMedia());
				break;
			case 3:
				if(tamaño==0){
					System.out.println("No puede crear copia sin crear el vector primero.");
					break;
				}
				int []matriz=new int[tamaño];
				Operaciones.setCopiarMatriz(matriz);

				System.out.println("Copia creada...");
				break;
			case 4:
				System.out.println("Selecciona la posicion que quiere cambiar: ");
				pos1=teclado.nextInt();
				System.out.println("¿Por qué numero quiere cambiarlo?");
				numero=teclado.nextInt();
				Operaciones.setIntroNum(pos1, numero);
				break;
			case 5:
				Operaciones.setMaxMin();
				System.out.println(Operaciones.getMax());
				System.out.println(Operaciones.getMin());
				break;
			case 6:
				Operaciones.setInvertir();
				break;
			case 7:
				Operaciones.setRepetidos();
				break;
			case 8:
				salir=true;
				break;
			}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Ha introducido caracteres. Escriba solo un numero Entero");
			teclado.nextLine();
		}
		} while(salir==false);
		
	}

}

