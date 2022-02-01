package assignment_4;

import java.util.Scanner;

public class q1q2 {

	public void ReverseWords(String instr) {

		String revrse[]= instr.split("");
		for (int i=revrse.length-1; i>=0;i--)
		{
			System.out.println(revrse[i] + " ");
		}
	}
	public void Reverseletter(String inword)
	{
		for(int i=inword.length()-1;i>=0; i--)
		{
			System.out.print(inword.charAt(i));
		}
	}
	public static void main(String[]   args) {      
		q1q2 RevWord= new q1q2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		RevWord.ReverseWords(str);
		sc.close();
		q1q2 ReverseLetter= new q1q2();
		ReverseLetter.Reverseletter(str);

	}

}

