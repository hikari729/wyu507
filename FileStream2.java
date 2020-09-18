package T_917;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream2 {
	public static void copyFile(String src, String des) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(des);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream out = new FileOutputStream(file);
		int c, i;
		byte buffer[] = new byte[in.read()];
		while ((c = in.read(buffer)) != -1) {
			for (i = 0; i < c; i++) {
				out.write(buffer[i]);
			}
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		String fSrc = "D:\\新建文件夹 (3)\\myfile.txt";
		String fDes = "D:\\新建文件夹 (3)\\myfile_cp2.txt";
		copyFile(fSrc, fDes);
		System.out.println("文件复制成功！");
	}
}
