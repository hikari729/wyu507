package T_917;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {
	public static void main(String[] args) throws IOException {
		String fSrc = "D:\\�½��ļ��� (3)\\myfile.txt";
		String fDes = "D:\\�½��ļ��� (3)\\myfile_cp.txt";
		try {
			InputStream in = new FileInputStream(fSrc);
			OutputStream out = new FileOutputStream(fDes);
			long num = 0;
			int bt = 0;
			while ((bt = in.read()) != -1) {
				out.write(bt);
				num++;
			}
			System.out.println("��ȡ�ֽ���Ϊ��" + num + "\n�ļ����Ƴɹ���");
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
