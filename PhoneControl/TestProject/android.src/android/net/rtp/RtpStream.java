/*    */ package android.net.rtp;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ 
/*    */ public class RtpStream
/*    */ {
/*    */   public static final int MODE_NORMAL = 0;
/*    */   public static final int MODE_SEND_ONLY = 1;
/*    */   public static final int MODE_RECEIVE_ONLY = 2;
/*    */ 
/*    */   RtpStream()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getLocalPort() { throw new RuntimeException("Stub!"); } 
/*  7 */   public InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getRemotePort() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isBusy() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getMode() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setMode(int mode) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void associate(InetAddress address, int port) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void release() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.rtp.RtpStream
 * JD-Core Version:    0.6.2
 */