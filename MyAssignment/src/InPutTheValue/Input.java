package InPutTheValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int age;
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Enter Your Age:");
		age=Integer.parseInt(br.readLine());
		System.out.println("Age is:"+age);
	}

}
