/*    */ package java.io;
/*    */ 
/*    */ import java.nio.charset.Charset;
/*    */ import java.nio.charset.CharsetEncoder;
/*    */ 
/*    */ public class OutputStreamWriter extends Writer
/*    */ {
/*    */   public OutputStreamWriter(OutputStream out)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public OutputStreamWriter(OutputStream out, String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/*  7 */   public OutputStreamWriter(OutputStream out, Charset cs) { throw new RuntimeException("Stub!"); } 
/*  8 */   public OutputStreamWriter(OutputStream out, CharsetEncoder charsetEncoder) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getEncoding() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void write(char[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void write(int oneChar) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void write(String str, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.OutputStreamWriter
 * JD-Core Version:    0.6.2
 */