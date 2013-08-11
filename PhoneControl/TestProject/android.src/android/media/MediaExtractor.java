/*    */ package android.media;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class MediaExtractor
/*    */ {
/*    */   public static final int SEEK_TO_PREVIOUS_SYNC = 0;
/*    */   public static final int SEEK_TO_NEXT_SYNC = 1;
/*    */   public static final int SEEK_TO_CLOSEST_SYNC = 2;
/*    */   public static final int SAMPLE_FLAG_SYNC = 1;
/*    */   public static final int SAMPLE_FLAG_ENCRYPTED = 2;
/*    */ 
/*    */   public MediaExtractor()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final void setDataSource(Context context, Uri uri, Map<String, String> headers) throws IOException { throw new RuntimeException("Stub!"); } 
/*  6 */   public final void setDataSource(String path, Map<String, String> headers) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public final void setDataSource(String path) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final void setDataSource(FileDescriptor fd) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public final native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2) throws IOException;
/*    */ 
/* 10 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/*    */   public final native void release();
/*    */ 
/*    */   public final native int getTrackCount();
/*    */ 
/* 13 */   public Map<UUID, byte[]> getPsshInfo() { throw new RuntimeException("Stub!"); } 
/* 14 */   public MediaFormat getTrackFormat(int index) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public native void selectTrack(int paramInt);
/*    */ 
/*    */   public native void unselectTrack(int paramInt);
/*    */ 
/*    */   public native void seekTo(long paramLong, int paramInt);
/*    */ 
/*    */   public native boolean advance();
/*    */ 
/*    */   public native int readSampleData(ByteBuffer paramByteBuffer, int paramInt);
/*    */ 
/*    */   public native int getSampleTrackIndex();
/*    */ 
/*    */   public native long getSampleTime();
/*    */ 
/*    */   public native int getSampleFlags();
/*    */ 
/*    */   public native boolean getSampleCryptoInfo(MediaCodec.CryptoInfo paramCryptoInfo);
/*    */ 
/*    */   public native long getCachedDuration();
/*    */ 
/*    */   public native boolean hasCacheReachedEndOfStream();
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaExtractor
 * JD-Core Version:    0.6.2
 */