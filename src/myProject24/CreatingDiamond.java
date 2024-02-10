package myProject24;
import java.util.Scanner;

public class CreatingDiamond {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int size;
		System.out.print("Please enter a number to arrange size of the diamond that will be created:");
		size=input.nextInt();
	for(int i=1;i<=size;i++) {
		for(int n=1;n<=size-i;n++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");
		}System.out.println();
		
		
		
		

	}
	for(int i=1;i<=size;i++) {
		for(int n=1;n<=i-1;n++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*(size-i)+1;k++) {
			System.out.print("*");
		}System.out.println();
		
		
		
		

	}
		
			}
		}
	


