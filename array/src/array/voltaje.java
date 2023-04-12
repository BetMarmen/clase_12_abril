package array;

import java.util.Scanner;

public class voltaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vector;
		int n;
		float vol,mayor=0,menor=0,suma = 0, promedio;
		System.out.println("Ingrese el tamaño del arreglo:");
		n= scan.nextInt();
		vector= new int[n];
		for(int i =0 ; i<n ;i++)
		{
			System.out.println("Ingrese el voltaje ");
			vol = scan.nextFloat();
			vector[i] = (int) vol;
			if(vector[i]<0)
			{
				System.out.println("El elemento es negativo");
			}
			
		}
		for(int j = 0; j<vector.length; j++)
		{
			if(mayor<vector[j])
			{
				mayor = vector[j];
			}
		}
		menor = mayor;
		for (int k=0 ; k<vector.length; k++)
		{
			if(menor>vector[k])
			{
				menor = vector[k];
			}
			
		}
		for(int l=0;l<vector.length ; l++ )
		{
			suma+=vector[l];
		}
		promedio = suma/n;
		System.out.println("El voltaje menor es: "+menor);
		System.out.println("El voltaje mayor es: "+mayor);
		System.out.println("El promedio es:"+promedio);
		

	}

}
