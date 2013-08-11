/*    */ package java.io;
/*    */ 
/*    */ @Deprecated
/*    */ public class StringBufferInputStream extends InputStream
/*    */ {
/*    */   protected String buffer;
/*    */   protected int count;
/*    */   protected int pos;
/*    */ 
/*    */   public StringBufferInputStream(String str)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized int available() { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized int read() { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized int read(byte[] buffer, int offset, int length) { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized void reset() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized long skip(long charCount) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.StringBufferInputStream
 * JD-Core Version:    0.6.2
 */