import java.util.*;

public class CreaVector {
	public static int []vector;

	public CreaVector(int tamaño){
		vector = new int [tamaño];
	}

	public void setVector(){
		Random miRandom=new Random();
		int numero=10;
		for (int i=0; i<vector.length;i++){
			vector[i]=miRandom.nextInt(numero);
			System.out.print(vector[i]+ " ");
		}
		System.out.println();
	}
}
