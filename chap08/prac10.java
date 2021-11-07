package chap8;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class prac10 {
	public static void main(String[] args) {
		File f = null;
		FileReader fr = null;
		HashMap<String, String> phone;
		Scanner sc;
		try {
			phone = new HashMap<String, String>();
			f = new File("D:\\eclipse\\chap8\\src\\chap8\\phone.txt");
			fr = new FileReader(f);
			sc = new Scanner(fr);

			while (sc.hasNext()) {
				String n = sc.next();
				String t = sc.next();
				phone.put(n, t);
			}
			System.out.println("�� " + phone.size() + "���� ������ �о����ϴ�.");
			sc.close();
			sc = new Scanner(System.in);
			String temp = "";
			while (true) {
				System.out.print("�̸�>>");
				temp = sc.next();
				if (temp.equals("�׸�")) {
					break;
				}
				String tel = phone.get(temp);
				if (tel == null) {
					System.out.println("ã�� �̸��� �����ϴ�.");
				} else {
					System.out.println(tel);
				}
			}
		} catch (Exception e) {}
	}
}
