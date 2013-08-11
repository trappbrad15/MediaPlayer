/*   */ package java.io;
/*   */ 
/*   */ import java.nio.charset.Charset;
/*   */ 
/*   */ public class FileReader extends InputStreamReader
/*   */ {
/*   */   public FileReader(File file)
/*   */     throws FileNotFoundException
/*   */   {
/* 5 */     super((InputStream)null, (Charset)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public FileReader(FileDescriptor fd) { super((InputStream)null, (Charset)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public FileReader(String filename) throws FileNotFoundException { super((InputStream)null, (Charset)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.FileReader
 * JD-Core Version:    0.6.2
 */