/*    */ package android.net.rtp;
/*    */ 
/*    */ public class AudioCodec
/*    */ {
/*    */   public final int type;
/*    */   public final String rtpmap;
/*    */   public final String fmtp;
/* 15 */   public static final AudioCodec PCMU = null; public static final AudioCodec PCMA = null; public static final AudioCodec GSM = null; public static final AudioCodec GSM_EFR = null; public static final AudioCodec AMR = null;
/*    */ 
/*    */   AudioCodec()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static AudioCodec[] getCodecs() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static AudioCodec getCodec(int type, String rtpmap, String fmtp) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.rtp.AudioCodec
 * JD-Core Version:    0.6.2
 */