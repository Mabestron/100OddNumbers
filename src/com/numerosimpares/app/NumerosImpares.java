package com.numerosimpares.app;

public class NumerosImpares 
{
	public static void main(String[]args)
	{
		int cont=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				cont++;
			}
		}
		System.out.println("La cantidad de impares es: "+cont);
	}
}
