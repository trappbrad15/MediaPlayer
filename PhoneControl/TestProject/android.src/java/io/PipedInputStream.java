/*    */ package java.io;
/*    */ 
/*    */ public class PipedInputStream extends InputStream
/*    */ {
/* 15 */   protected byte[] buffer = null;
/*    */   protected int in;
/*    */   protected int out;
/*    */   protected static final int PIPE_SIZE = 1024;
/*    */ 
/*    */   public PipedInputStream()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PipedInputStream(PipedOutputStream out) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public PipedInputStream(int pipeSize) { throw new RuntimeException("Stub!"); } 
/*  8 */   public PipedInputStream(PipedOutputStream out, int pipeSize) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void connect(PipedOutputStream src) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized int read(byte[] bytes, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   protected synchronized void receive(int oneByte) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.PipedInputStream
 * JD-Core Version:    0.6.2
 */