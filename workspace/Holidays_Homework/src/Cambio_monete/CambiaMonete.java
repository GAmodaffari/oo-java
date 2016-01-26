package Cambio_monete;
import java.util.*;
public class CambiaMonete {
	
	static int leggi(){
		Scanner tastiera= new Scanner(System.in);
		int n;
		do
		{
		 n=tastiera.nextInt();
		}
		while(n<0);
		return n;
	}
	
	

	public static void main(String[] args) {
		
		System.out.print("Inserisci Euro:");
		
		int euro = leggi();
		
		int one=0;
		int two=0;
		int five=0;
		int ten=0;
		int twenty=0;
		int fifty=0;
		int one_hundrued=0;
		int two_hundrued=0;
		int five_hundrued=0;
		
		while(euro!=0){
			if( euro-500 == 0 || euro-500 > 0){five_hundrued++; euro=euro-500;}
			else if( euro-200 == 0 || euro-200 > 0){two_hundrued++; euro=euro-200;}
			else if( euro-100 == 0 || euro-100 > 0){one_hundrued++; euro=euro-100;}
			else if( euro-50 == 0 || euro-50 > 0){fifty++; euro=euro-50;}
			else if( euro-20 == 0 || euro-20 > 0){twenty++; euro=euro-20;}
			else if( euro-10 == 0 || euro-10 > 0){ten++; euro=euro-10;}
			else if( euro-5 == 0 || euro-5 > 0){five++; euro=euro-5;}
			else if( euro-2 == 0 || euro-2 > 0){two++; euro=euro-2;}
			else if( euro-1 == 0 || euro-1 > 0){one++; euro=euro-1;}
		}
		
		System.out.println("Puoi cambiare la cifra in:");
		
		if(five_hundrued!=0){
			System.out.println(five_hundrued+" banconote da 500  ");
		}
		if(two_hundrued!=0){
			System.out.println(two_hundrued+" banconote da 200  ");
		}
		if(one_hundrued!=0){
			System.out.println(one_hundrued+" banconote da 100  ");
		}
		if(fifty!=0){
			System.out.println(fifty+" banconote da 50  ");
		}
		if(twenty!=0){
			System.out.println(twenty+" banconote da 20  ");
		}
		if(ten!=0){
			System.out.println(ten+" banconote da 10  ");
		}
		if(five!=0){
			System.out.println(five+" banconote da 5  ");
		}
		if(two!=0){
			System.out.println(two+" banconote da 2  ");
		}
		if(one!=0){
			System.out.println(one+" banconote da 1  ");
		}
		
	}
}
