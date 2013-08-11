/*    */ package java.io;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class PrintStream extends FilterOutputStream
/*    */   implements Appendable, Closeable
/*    */ {
/*    */   public PrintStream(OutputStream out)
/*    */   {
/*  6 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public PrintStream(OutputStream out, boolean autoFlush) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public PrintStream(OutputStream out, boolean autoFlush, String charsetName) throws UnsupportedEncodingException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  9 */   public PrintStream(File file) throws FileNotFoundException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 10 */   public PrintStream(File file, String charsetName) throws FileNotFoundException, UnsupportedEncodingException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 11 */   public PrintStream(String fileName) throws FileNotFoundException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 12 */   public PrintStream(String fileName, String charsetName) throws FileNotFoundException, UnsupportedEncodingException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean checkError() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void clearError() { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized void close() { throw new RuntimeException("Stub!"); } 
/* 16 */   public synchronized void flush() { throw new RuntimeException("Stub!"); } 
/* 17 */   public PrintStream format(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 18 */   public PrintStream format(Locale l, String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 19 */   public PrintStream printf(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 20 */   public PrintStream printf(Locale l, String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void print(char[] chars) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void print(char c) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void print(double d) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void print(float f) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void print(int i) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void print(long l) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void print(Object o) { throw new RuntimeException("Stub!"); } 
/* 28 */   public synchronized void print(String str) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void print(boolean b) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void println() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void println(char[] chars) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void println(char c) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void println(double d) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void println(float f) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void println(int i) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void println(long l) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void println(Object o) { throw new RuntimeException("Stub!"); } 
/* 38 */   public synchronized void println(String str) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void println(boolean b) { throw new RuntimeException("Stub!"); } 
/* 40 */   protected void setError() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void write(byte[] buffer, int offset, int length) { throw new RuntimeException("Stub!"); } 
/* 42 */   public synchronized void write(int oneByte) { throw new RuntimeException("Stub!"); } 
/* 43 */   public PrintStream append(char c) { throw new RuntimeException("Stub!"); } 
/* 44 */   public PrintStream append(CharSequence charSequence) { throw new RuntimeException("Stub!"); } 
/* 45 */   public PrintStream append(CharSequence charSequence, int start, int end) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.PrintStream
 * JD-Core Version:    0.6.2
 */