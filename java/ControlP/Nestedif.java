package decisionmaking;
import java.util.Scanner;

public class Nestedif {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter ur status");
		 String examstatus=scanner.nextLine();
		String examtest="pass";
		if(examtest=="pass") {
			System.out.println("be ready for the round 1");
		String round1="fail";
		if(round1=="pass") {
			System.out.println("be ready for round 2");
			
		String round2="pass";
		
		if(round2=="fail") {
			System.out.println("wait for HR round");
			
		}else {
			System.out.println("go to home");
			
		}}else {
			System.out.println("go to home");
		}}else {
			System.out.println("go to home");
	}

}}
