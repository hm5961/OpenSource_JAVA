package chap8;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ex07 {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("D:\\eclipse\\chap8\\src\\chap8\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
