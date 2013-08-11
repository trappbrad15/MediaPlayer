/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class ZipInputStream extends InflaterInputStream
/*    */ {
/*    */   public ZipInputStream(InputStream stream)
/*    */   {
/*  5 */     super((InputStream)null, (Inflater)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void closeEntry() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public ZipEntry getNextEntry() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   protected ZipEntry createZipEntry(String name) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.zip.ZipInputStream
 * JD-Core Version:    0.6.2
 */