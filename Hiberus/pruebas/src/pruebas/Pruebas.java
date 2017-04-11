package pruebas;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prueba={1,2,3,1,2,3,3,7,9};
		int[] prueba2={200,200,200,200,200,200,200,200,200};
		int contador=0;
		boolean salir=false;




		for (int i=0;i<prueba.length;i++){
			for (int j=i+1; j<prueba.length-1;j++){
				
				if(prueba[i]==prueba[j]){
					for(int k=0;k<prueba2.length-1;k++){
						if(prueba2[k]!=prueba[i]){
					prueba2[contador]=prueba[i];
					contador++;
					j=prueba.length;
					k=prueba.length;
						}
					}
				}
			}
			System.out.println(prueba2[i]);
		}

	}

}
