/*    */ package android.media;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public final class MediaMuxer
/*    */ {
/*    */   public MediaMuxer(String path, int format)
/*    */     throws IOException
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void setOrientationHint(int degrees) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void stop() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 14 */   public int addTrack(MediaFormat format) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeSampleData(int trackIndex, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void release() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class OutputFormat
/*    */   {
/*    */     public static final int MUXER_OUTPUT_MPEG_4 = 0;
/*    */ 
/*    */     OutputFormat()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaMuxer
 * JD-Core Version:    0.6.2
 */