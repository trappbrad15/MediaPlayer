/*    */ package android.media;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public final class MediaFormat
/*    */ {
/*    */   public static final String KEY_MIME = "mime";
/*    */   public static final String KEY_SAMPLE_RATE = "sample-rate";
/*    */   public static final String KEY_CHANNEL_COUNT = "channel-count";
/*    */   public static final String KEY_WIDTH = "width";
/*    */   public static final String KEY_HEIGHT = "height";
/*    */   public static final String KEY_MAX_INPUT_SIZE = "max-input-size";
/*    */   public static final String KEY_BIT_RATE = "bitrate";
/*    */   public static final String KEY_COLOR_FORMAT = "color-format";
/*    */   public static final String KEY_FRAME_RATE = "frame-rate";
/*    */   public static final String KEY_I_FRAME_INTERVAL = "i-frame-interval";
/*    */   public static final String KEY_DURATION = "durationUs";
/*    */   public static final String KEY_IS_ADTS = "is-adts";
/*    */   public static final String KEY_CHANNEL_MASK = "channel-mask";
/*    */   public static final String KEY_AAC_PROFILE = "aac-profile";
/*    */   public static final String KEY_FLAC_COMPRESSION_LEVEL = "flac-compression-level";
/*    */ 
/*    */   public MediaFormat()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final boolean containsKey(String name) { throw new RuntimeException("Stub!"); } 
/*  6 */   public final int getInteger(String name) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final long getLong(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final float getFloat(String name) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final String getString(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final ByteBuffer getByteBuffer(String name) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void setInteger(String name, int value) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void setLong(String name, long value) { throw new RuntimeException("Stub!"); } 
/* 13 */   public final void setFloat(String name, float value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final void setString(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final void setByteBuffer(String name, ByteBuffer bytes) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static final MediaFormat createAudioFormat(String mime, int sampleRate, int channelCount) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static final MediaFormat createVideoFormat(String mime, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaFormat
 * JD-Core Version:    0.6.2
 */