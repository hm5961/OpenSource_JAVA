package chap8;

import java.io.File;

public class prac08 {
	public static void main(String[] args) {
		File f;
		File sub[];
		try {
			f = new File("c:\\");
			sub = f.listFiles();

			long max = -1;
			int maxi = -1;
			for (int i = 0; i < sub.length; i++) {
				if (max < sub[i].length()) {
					max = sub[i].length();
					maxi = i;
				}
			}
			System.out.println("���� ū ������ " + sub[maxi].getPath() + "  " + sub[maxi].length() + "����Ʈ");

		} catch (Exception e) {}
	}
}
