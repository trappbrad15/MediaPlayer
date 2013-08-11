/*    */ package java.security;
/*    */ 
/*    */ import java.io.FilterInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class DigestInputStream extends FilterInputStream
/*    */ {
/*    */   protected MessageDigest digest;
/*    */ 
/*    */   public DigestInputStream(InputStream stream, MessageDigest digest)
/*    */   {
/*  5 */     super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public MessageDigest getMessageDigest() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setMessageDigest(MessageDigest digest) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void on(boolean on) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.DigestInputStream
 * JD-Core Version:    0.6.2
 */