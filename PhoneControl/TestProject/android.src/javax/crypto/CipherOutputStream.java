/*    */ package javax.crypto;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class CipherOutputStream extends FilterOutputStream
/*    */ {
/*    */   public CipherOutputStream(OutputStream os, Cipher c)
/*    */   {
/*  5 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   protected CipherOutputStream(OutputStream os) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.CipherOutputStream
 * JD-Core Version:    0.6.2
 */