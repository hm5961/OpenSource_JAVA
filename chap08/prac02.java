package chap8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class prac02 {
	public static void main(String[] args) {
		File f=null;
		FileReader fr=null;
		BufferedReader br=null;
		int c;
		try {
			f = new File("D:\\eclipse\\chap8\\src\\chap8\\phone.txt");
			fr=new FileReader(f);
			System.out.println(f.getPath()+"�� ����մϴ�.");
			br=new BufferedReader(fr,30);
			String temp="";
			while(true) {
				temp=br.readLine();
				if(temp==null) {
					break;
				}
				System.out.println(temp);
			}
			fr.close();
		} catch (IOException e) {}
	}
}
