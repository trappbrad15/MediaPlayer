/*   */ package java.io;
/*   */ 
/*   */ public abstract class OutputStream
/*   */   implements Closeable, Flushable
/*   */ {
/*   */   public OutputStream()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void write(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 9 */   public void write(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract void write(int paramInt)
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.OutputStream
 * JD-Core Version:    0.6.2
 */