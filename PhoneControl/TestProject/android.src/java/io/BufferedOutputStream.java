/*    */ package java.io;
/*    */ 
/*    */ public class BufferedOutputStream extends FilterOutputStream
/*    */ {
/* 11 */   protected byte[] buf = null;
/*    */   protected int count;
/*    */ 
/*    */   public BufferedOutputStream(OutputStream out)
/*    */   {
/*  5 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public BufferedOutputStream(OutputStream out, int size) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized void write(byte[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized void write(int oneByte) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.BufferedOutputStream
 * JD-Core Version:    0.6.2
 */