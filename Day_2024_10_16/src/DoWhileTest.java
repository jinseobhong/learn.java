public class DoWhileTest {
	
	static int fileSize;
	static int download;
	
	public static void main(String[] args) {
		SetDownload(0);
		SetFileSize(720);
		try {
			while (download < fileSize) {
				download += 120;
				System.out.println(download + "kb Downloading");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void SetDownload(int size) {
		 download = size;
	}
	
	private static void SetFileSize(int size) {
		fileSize = size;
	}
}
