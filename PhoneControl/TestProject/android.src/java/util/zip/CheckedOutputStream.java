/*   */ package java.util.zip;
/*   */ 
/*   */ import java.io.FilterOutputStream;
/*   */ import java.io.IOException;
/*   */ import java.io.OutputStream;
/*   */ 
/*   */ public class CheckedOutputStream extends FilterOutputStream
/*   */ {
/*   */   public CheckedOutputStream(OutputStream os, Checksum cs)
/*   */   {
/* 5 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public Checksum getChecksum() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void write(int val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void write(byte[] buf, int off, int nbytes) throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.zip.CheckedOutputStream
 * JD-Core Version:    0.6.2
 */