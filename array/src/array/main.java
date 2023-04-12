package array;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner (System.in);
		int vector [],n,num;
		System.out.println("Ingrese el tamaño del arreglo");
		n = scan.nextInt();
		vector = new int[n];
		
		
		for(int i = 0 ; i<n; i++)
		{
			System.out.println("Ingrese un valor:");
			num = scan.nextInt();
			vector[i] = num;
			if(vector[i]<0)
			{
				System.out.println("El elemento es negativo");
			}
			
		}
		for(int j = 0; j<vector.length; j++)
		{
			System.out.println("los numeros que ingreso"+vector[j]);
		}

	}

}
