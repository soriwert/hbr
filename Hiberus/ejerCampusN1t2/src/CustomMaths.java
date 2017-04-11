public class CustomMaths {

	public CustomMaths(){

	}


	public static int getMCD(int numero, int numero2){
		int contador=1;
		int total=1;
		boolean salir=false;
		
		if(numero<=0){
			numero=1;
		}
		if(numero2<=0){
			numero=1;
		}
		
		while(salir==false){
			if(numero%contador==0 && numero2%contador==0){
				total*=contador;
				numero=numero/contador;
				numero2=numero2/contador;
				contador=1;
			}
			contador++;
			if(contador==100){
				salir=true;
			}
		}
		return total;
	}

	public static int getMCM(int numero, int numero2){
		int contador=2;
		int total=1;
		if(numero<=0){
			numero=1;
		}
		if(numero2<=0){
			numero=1;
		}
		
		while(contador<=numero || contador<=numero2){
			if(numero%contador==0 || numero2%contador==0){
				total*=contador;
				if (numero%contador==0){
					numero/=contador;
				}
				if (numero2%contador==0){
					numero2/=contador;
				}
			}
			else
			{
				contador++;
			}
			if(contador==100){
				contador=numero+1;
			}
		}
		return total;
	}

	public static long getFibonacci(int numero){
		
		long aux=0;
		long aux2=0;
		aux=1;
		for (int i=1; i<=numero;i++){
			aux2+=aux;
			aux=aux2-aux;	
			}
		return aux2;
	}

	public static boolean getPrimo(int numero){
		boolean esPrimo=true;
		if(numero<=0){
			esPrimo=false;
		}
		
		for(int i=2; i<numero;i++){
			if (numero%i==0){
				esPrimo=false;
			}
		}
		return esPrimo;
	}
}
