import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class runner {

	
	public static void main(String[] args) {
		System.out.println("TEST");
		String currentPath = System.getProperty("user.dir");
		System.out.println(currentPath);
		String test = "test";
		byte[] bytes = test.getBytes();
		System.out.println(bytes);
		System.out.println(getCRC32Checksum(bytes));
		String testt = "C:\\Users\\rob80186\\eclipse-workspace\\CBTS_Test\\src\\testing.java";
		System.out.println(getCRC32Checksum(testt.getBytes()));
		
		Path path = Paths.get("C:\\Users\\rob80186\\eclipse-workspace\\CBTS_Test\\src\\testing.java");
		try {
			byte[] data = Files.readAllBytes(path);
			System.out.println(getCRC32Checksum(data));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static long getCRC32Checksum(byte[] bytes) {
	    Checksum crc32 = new CRC32();
	    crc32.update(bytes, 0, bytes.length);
	    return crc32.getValue();
	}
	
}
