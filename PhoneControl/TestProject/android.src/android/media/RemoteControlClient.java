/*    */ package android.media;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.graphics.Bitmap;
/*    */ import android.os.Looper;
/*    */ 
/*    */ public class RemoteControlClient
/*    */ {
/*    */   public static final int PLAYSTATE_STOPPED = 1;
/*    */   public static final int PLAYSTATE_PAUSED = 2;
/*    */   public static final int PLAYSTATE_PLAYING = 3;
/*    */   public static final int PLAYSTATE_FAST_FORWARDING = 4;
/*    */   public static final int PLAYSTATE_REWINDING = 5;
/*    */   public static final int PLAYSTATE_SKIPPING_FORWARDS = 6;
/*    */   public static final int PLAYSTATE_SKIPPING_BACKWARDS = 7;
/*    */   public static final int PLAYSTATE_BUFFERING = 8;
/*    */   public static final int PLAYSTATE_ERROR = 9;
/*    */   public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;
/*    */   public static final int FLAG_KEY_MEDIA_REWIND = 2;
/*    */   public static final int FLAG_KEY_MEDIA_PLAY = 4;
/*    */   public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;
/*    */   public static final int FLAG_KEY_MEDIA_PAUSE = 16;
/*    */   public static final int FLAG_KEY_MEDIA_STOP = 32;
/*    */   public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;
/*    */   public static final int FLAG_KEY_MEDIA_NEXT = 128;
/*    */   public static final int FLAG_KEY_MEDIA_POSITION_UPDATE = 256;
/*    */ 
/*    */   public RemoteControlClient(PendingIntent mediaButtonIntent)
/*    */   {
/* 22 */     throw new RuntimeException("Stub!"); } 
/* 23 */   public RemoteControlClient(PendingIntent mediaButtonIntent, Looper looper) { throw new RuntimeException("Stub!"); } 
/* 24 */   public MetadataEditor editMetadata(boolean startEmpty) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setPlaybackState(int state) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setPlaybackState(int state, long timeInMs, float playbackSpeed) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setTransportControlFlags(int transportControlFlags) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setPlaybackPositionUpdateListener(OnPlaybackPositionUpdateListener l) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setOnGetPlaybackPositionListener(OnGetPlaybackPositionListener l) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnGetPlaybackPositionListener
/*    */   {
/*    */     public abstract long onGetPlaybackPosition();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnPlaybackPositionUpdateListener
/*    */   {
/*    */     public abstract void onPlaybackPositionUpdate(long paramLong);
/*    */   }
/*    */ 
/*    */   public class MetadataEditor
/*    */   {
/*    */     public static final int BITMAP_KEY_ARTWORK = 100;
/*    */ 
/*    */     MetadataEditor()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public synchronized MetadataEditor putString(int key, String value) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/*  8 */     public synchronized MetadataEditor putLong(int key, long value) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/*  9 */     public synchronized MetadataEditor putBitmap(int key, Bitmap bitmap) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 10 */     public synchronized void clear() { throw new RuntimeException("Stub!"); } 
/* 11 */     public synchronized void apply() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.RemoteControlClient
 * JD-Core Version:    0.6.2
 */