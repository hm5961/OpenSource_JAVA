package chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class prac04 {
	public static void main(String[] args) {
		File f = null;
		BufferedReader bi = null;

		try {
			f = new File("c:\\windows\\system.ini");
			bi = new BufferedReader(new FileReader(f));

			String s = "";
			int i = 1;
			System.out.println(f.getPath() + " ������ �о� ����մϴ�.");
			while (true) {
				s = bi.readLine();
				if (s == null) {
					break;
				}
				System.out.println("\t" + i + " : " + s);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
