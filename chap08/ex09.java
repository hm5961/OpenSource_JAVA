package chap8;

import java.io.*;

public class ex09 {
	public static void main(String[] args) {
		File src = new File("c:\\windows\\system.ini");
		File dest = new File("D:\\eclipse\\chap8\\src\\chap8\\system.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}