package chap8;

import java.io.*;

public class ex05 {
	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };
		try {
			FileOutputStream fout = new FileOutputStream("D:\\eclipse\\chap8\\src\\chap8\\test.out");
			for (int i = 0; i < b.length; i++)
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
			fout.close();
		} catch (IOException e) {
			System.out.println("D:\\eclipse\\chap8\\src\\chap8\\test.out에 저장할 수없었습니다. 경로명을 확인해 주세요");
			return;
		}
		System.out.println("D:\\eclipse\\chap8\\src\\chap8\\test.out을 저장하였습니다.");
	}

}
