/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.FilterInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class InflaterInputStream extends FilterInputStream
/*    */ {
/*    */   protected Inflater inf;
/* 18 */   protected byte[] buf = null;
/*    */   protected int len;
/*    */ 
/*    */   public InflaterInputStream(InputStream is)
/*    */   {
/*  5 */     super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public InflaterInputStream(InputStream is, Inflater inflater) { super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public InflaterInputStream(InputStream is, Inflater inflater, int bufferSize) { super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void fill() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.zip.InflaterInputStream
 * JD-Core Version:    0.6.2
 */