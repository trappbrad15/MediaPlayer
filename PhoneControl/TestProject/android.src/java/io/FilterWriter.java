/*    */ package java.io;
/*    */ 
/*    */ public abstract class FilterWriter extends Writer
/*    */ {
/*    */   protected Writer out;
/*    */ 
/*    */   protected FilterWriter(Writer out)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void write(char[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void write(int oneChar) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void write(String str, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.FilterWriter
 * JD-Core Version:    0.6.2
 */