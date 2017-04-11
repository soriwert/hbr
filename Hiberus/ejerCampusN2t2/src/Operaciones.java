
public class Operaciones  extends CreaVector{
	private int max,min,tamaño;
	public Operaciones(int tamaño){
		super(tamaño);
		this.tamaño=tamaño;

	}
	public int getSumaValores(int pos1, int pos2, int tamaño){
		int suma=0;
		suma=vector[pos1]+vector[pos2];
		return suma;
	}

	public double getMedia(){
		double media=0;
		int contador=0;
		for (int i=0; i<vector.length;i++){
			media+=vector[i];
			contador++;
		}
		media/=contador;
		return media;
	}
	public void setCopiarMatriz(int []matriz){

		for (int i=0; i<vector.length; i++){
			matriz[i]=vector[i];
		}
	}
	public void setIntroNum(int pos, int numero){
		vector[pos]=numero;
	}

	public void setMaxMin(){
		max=vector[0];
		min=vector[0];
		for (int i=0; i<vector.length;i++){
			if(vector[i]<min){
				min=vector[i];
			}
			else if (vector[i]>max){
				max=vector[i];
			}
		}
	}
	public int getMax(){
		return max;
	}
	public int getMin(){
		return min;
	}

	public void setInvertir(){
		int k=vector.length-1;
		for(int i=0; i<vector.length; i++){
			vector[i]=vector[k];
			k--;
		}
	}
	
	//7. Write a Java program to find the duplicate 
	//values of an array of string values.
	public String setRepetidos(){
		return "";
	}
}


