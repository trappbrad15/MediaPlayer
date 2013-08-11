/*    */ package android.net.rtp;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ import java.net.SocketException;
/*    */ 
/*    */ public class AudioStream extends RtpStream
/*    */ {
/*    */   public AudioStream(InetAddress address)
/*    */     throws SocketException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final boolean isBusy() { throw new RuntimeException("Stub!"); } 
/*  7 */   public AudioGroup getGroup() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void join(AudioGroup group) { throw new RuntimeException("Stub!"); } 
/*  9 */   public AudioCodec getCodec() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setCodec(AudioCodec codec) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getDtmfType() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setDtmfType(int type) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.rtp.AudioStream
 * JD-Core Version:    0.6.2
 */