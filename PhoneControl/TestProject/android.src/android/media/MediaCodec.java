/*    */ package android.media;
/*    */ 
/*    */ import android.view.Surface;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public final class MediaCodec
/*    */ {
/*    */   public static final int BUFFER_FLAG_SYNC_FRAME = 1;
/*    */   public static final int BUFFER_FLAG_CODEC_CONFIG = 2;
/*    */   public static final int BUFFER_FLAG_END_OF_STREAM = 4;
/*    */   public static final int CONFIGURE_FLAG_ENCODE = 1;
/*    */   public static final int CRYPTO_MODE_UNENCRYPTED = 0;
/*    */   public static final int CRYPTO_MODE_AES_CTR = 1;
/*    */   public static final int INFO_TRY_AGAIN_LATER = -1;
/*    */   public static final int INFO_OUTPUT_FORMAT_CHANGED = -2;
/*    */   public static final int INFO_OUTPUT_BUFFERS_CHANGED = -3;
/*    */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
/*    */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
/*    */ 
/*    */   MediaCodec()
/*    */   {
/* 31 */     throw new RuntimeException("Stub!"); } 
/* 32 */   public static MediaCodec createDecoderByType(String type) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static MediaCodec createEncoderByType(String type) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static MediaCodec createByCodecName(String name) { throw new RuntimeException("Stub!"); } 
/* 35 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/*    */   public final native void release();
/*    */ 
/* 37 */   public void configure(MediaFormat format, Surface surface, MediaCrypto crypto, int flags) { throw new RuntimeException("Stub!"); } 
/*    */   public final native Surface createInputSurface();
/*    */ 
/*    */   public final native void start();
/*    */ 
/*    */   public final native void stop();
/*    */ 
/*    */   public final native void flush();
/*    */ 
/*    */   public final native void queueInputBuffer(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4) throws MediaCodec.CryptoException;
/*    */ 
/*    */   public final native void queueSecureInputBuffer(int paramInt1, int paramInt2, CryptoInfo paramCryptoInfo, long paramLong, int paramInt3) throws MediaCodec.CryptoException;
/*    */ 
/*    */   public final native int dequeueInputBuffer(long paramLong);
/*    */ 
/*    */   public final native int dequeueOutputBuffer(BufferInfo paramBufferInfo, long paramLong);
/*    */ 
/*    */   public final native void releaseOutputBuffer(int paramInt, boolean paramBoolean);
/*    */ 
/*    */   public final native void signalEndOfInputStream();
/*    */ 
/* 48 */   public final MediaFormat getOutputFormat() { throw new RuntimeException("Stub!"); } 
/* 49 */   public ByteBuffer[] getInputBuffers() { throw new RuntimeException("Stub!"); } 
/* 50 */   public ByteBuffer[] getOutputBuffers() { throw new RuntimeException("Stub!"); } 
/*    */   public final native void setVideoScalingMode(int paramInt);
/*    */ 
/*    */   public final native String getName();
/*    */ 
/* 53 */   public MediaCodecInfo getCodecInfo() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class CryptoInfo
/*    */   {
/*    */     public int numSubSamples;
/* 25 */     public int[] numBytesOfClearData = null;
/* 26 */     public int[] numBytesOfEncryptedData = null;
/* 27 */     public byte[] key = null;
/* 28 */     public byte[] iv = null;
/*    */     public int mode;
/*    */ 
/*    */     public CryptoInfo()
/*    */     {
/* 21 */       throw new RuntimeException("Stub!"); } 
/* 22 */     public void set(int newNumSubSamples, int[] newNumBytesOfClearData, int[] newNumBytesOfEncryptedData, byte[] newKey, byte[] newIV, int newMode) { throw new RuntimeException("Stub!"); } 
/* 23 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static final class CryptoException extends RuntimeException
/*    */   {
/*    */     public CryptoException(int errorCode, String detailMessage)
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public int getErrorCode() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static final class BufferInfo
/*    */   {
/*    */     public int offset;
/*    */     public int size;
/*    */     public long presentationTimeUs;
/*    */     public int flags;
/*    */ 
/*    */     public BufferInfo()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public void set(int newOffset, int newSize, long newTimeUs, int newFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaCodec
 * JD-Core Version:    0.6.2
 */