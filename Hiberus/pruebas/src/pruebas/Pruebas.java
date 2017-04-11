package pruebas;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saludo="hola que tal";
		String almacen="";
		for (int i=0; i<saludo.length();i++){
			for(int j=i+1; j<saludo.length();j++){
				if(saludo.charAt(j)==saludo.charAt(i)){
					
					almacen+=saludo.charAt(i);
					
				}
			}
		}

		System.out.println(almacen);

	}

}
