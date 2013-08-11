/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class ZipOutputStream extends DeflaterOutputStream
/*    */ {
/*    */   public static final int DEFLATED = 8;
/*    */   public static final int STORED = 0;
/*    */ 
/*    */   public ZipOutputStream(OutputStream os)
/*    */   {
/*  5 */     super((OutputStream)null, (Deflater)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void closeEntry() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void finish() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void putNextEntry(ZipEntry ze) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setComment(String comment) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setLevel(int level) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setMethod(int method) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void write(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.zip.ZipOutputStream
 * JD-Core Version:    0.6.2
 */