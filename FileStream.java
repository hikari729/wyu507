package T_917;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {
	public static void main(String[] args) throws IOException {
		String fSrc = "D:\\新建文件夹 (3)\\myfile.txt";
		String fDes = "D:\\新建文件夹 (3)\\myfile_cp.txt";
		try {
			InputStream in = new FileInputStream(fSrc);
			OutputStream out = new FileOutputStream(fDes);
			long num = 0;
			int bt = 0;
			while ((bt = in.read()) != -1) {
				out.write(bt);
				num++;
			}
			System.out.println("读取字节数为：" + num + "\n文件复制成功！");
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
