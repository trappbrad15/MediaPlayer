/*    */ package java.io;
/*    */ 
/*    */ public class FilterInputStream extends InputStream
/*    */ {
/*    */   protected volatile InputStream in;
/*    */ 
/*    */   protected FilterInputStream(InputStream in)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.FilterInputStream
 * JD-Core Version:    0.6.2
 */