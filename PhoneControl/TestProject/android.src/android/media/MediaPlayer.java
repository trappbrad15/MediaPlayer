/*     */ package android.media;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.net.Uri;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.view.Surface;
/*     */ import android.view.SurfaceHolder;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class MediaPlayer
/*     */ {
/*     */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
/*     */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
/*     */   public static final String MEDIA_MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
/*     */   public static final int MEDIA_ERROR_UNKNOWN = 1;
/*     */   public static final int MEDIA_ERROR_SERVER_DIED = 100;
/*     */   public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
/*     */   public static final int MEDIA_ERROR_IO = -1004;
/*     */   public static final int MEDIA_ERROR_MALFORMED = -1007;
/*     */   public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
/*     */   public static final int MEDIA_ERROR_TIMED_OUT = -110;
/*     */   public static final int MEDIA_INFO_UNKNOWN = 1;
/*     */   public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
/*     */   public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
/*     */   public static final int MEDIA_INFO_BUFFERING_START = 701;
/*     */   public static final int MEDIA_INFO_BUFFERING_END = 702;
/*     */   public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
/*     */   public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
/*     */   public static final int MEDIA_INFO_METADATA_UPDATE = 802;
/*     */ 
/*     */   public MediaPlayer()
/*     */   {
/*  49 */     throw new RuntimeException("Stub!"); } 
/*  50 */   public void setDisplay(SurfaceHolder sh) { throw new RuntimeException("Stub!"); } 
/*  51 */   public void setSurface(Surface surface) { throw new RuntimeException("Stub!"); } 
/*  52 */   public void setVideoScalingMode(int mode) { throw new RuntimeException("Stub!"); } 
/*  53 */   public static MediaPlayer create(Context context, Uri uri) { throw new RuntimeException("Stub!"); } 
/*  54 */   public static MediaPlayer create(Context context, Uri uri, SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/*  55 */   public static MediaPlayer create(Context context, int resid) { throw new RuntimeException("Stub!"); } 
/*  56 */   public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  57 */   public void setDataSource(Context context, Uri uri, Map<String, String> headers) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  58 */   public void setDataSource(String path) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  59 */   public void setDataSource(FileDescriptor fd) throws IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*     */   public native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2) throws IOException, IllegalArgumentException, IllegalStateException;
/*     */ 
/*     */   public native void prepare() throws IOException, IllegalStateException;
/*     */ 
/*     */   public native void prepareAsync() throws IllegalStateException;
/*     */ 
/*  63 */   public void start() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  64 */   public void stop() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  65 */   public void pause() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  66 */   public void setWakeMode(Context context, int mode) { throw new RuntimeException("Stub!"); } 
/*  67 */   public void setScreenOnWhilePlaying(boolean screenOn) { throw new RuntimeException("Stub!"); } 
/*     */   public native int getVideoWidth();
/*     */ 
/*     */   public native int getVideoHeight();
/*     */ 
/*     */   public native boolean isPlaying();
/*     */ 
/*     */   public native void seekTo(int paramInt) throws IllegalStateException;
/*     */ 
/*     */   public native int getCurrentPosition();
/*     */ 
/*     */   public native int getDuration();
/*     */ 
/*     */   public native void setNextMediaPlayer(MediaPlayer paramMediaPlayer);
/*     */ 
/*  75 */   public void release() { throw new RuntimeException("Stub!"); } 
/*  76 */   public void reset() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setAudioStreamType(int paramInt);
/*     */ 
/*     */   public native void setLooping(boolean paramBoolean);
/*     */ 
/*     */   public native boolean isLooping();
/*     */ 
/*     */   public native void setVolume(float paramFloat1, float paramFloat2);
/*     */ 
/*     */   public native void setAudioSessionId(int paramInt) throws IllegalArgumentException, IllegalStateException;
/*     */ 
/*     */   public native int getAudioSessionId();
/*     */ 
/*     */   public native void attachAuxEffect(int paramInt);
/*     */ 
/*     */   public native void setAuxEffectSendLevel(float paramFloat);
/*     */ 
/*  85 */   public TrackInfo[] getTrackInfo() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  86 */   public void addTimedTextSource(String path, String mimeType) throws IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  87 */   public void addTimedTextSource(Context context, Uri uri, String mimeType) throws IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  88 */   public void addTimedTextSource(FileDescriptor fd, String mimeType) throws IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  89 */   public void addTimedTextSource(FileDescriptor fd, long offset, long length, String mimeType) throws IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  90 */   public void selectTrack(int index) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  91 */   public void deselectTrack(int index) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  92 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/*  93 */   public void setOnPreparedListener(OnPreparedListener listener) { throw new RuntimeException("Stub!"); } 
/*  94 */   public void setOnCompletionListener(OnCompletionListener listener) { throw new RuntimeException("Stub!"); } 
/*  95 */   public void setOnBufferingUpdateListener(OnBufferingUpdateListener listener) { throw new RuntimeException("Stub!"); } 
/*  96 */   public void setOnSeekCompleteListener(OnSeekCompleteListener listener) { throw new RuntimeException("Stub!"); } 
/*  97 */   public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener) { throw new RuntimeException("Stub!"); } 
/*  98 */   public void setOnTimedTextListener(OnTimedTextListener listener) { throw new RuntimeException("Stub!"); } 
/*  99 */   public void setOnErrorListener(OnErrorListener listener) { throw new RuntimeException("Stub!"); } 
/* 100 */   public void setOnInfoListener(OnInfoListener listener) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static abstract interface OnInfoListener
/*     */   {
/*     */     public abstract boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnErrorListener
/*     */   {
/*     */     public abstract boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnTimedTextListener
/*     */   {
/*     */     public abstract void onTimedText(MediaPlayer paramMediaPlayer, TimedText paramTimedText);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnVideoSizeChangedListener
/*     */   {
/*     */     public abstract void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnSeekCompleteListener
/*     */   {
/*     */     public abstract void onSeekComplete(MediaPlayer paramMediaPlayer);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnBufferingUpdateListener
/*     */   {
/*     */     public abstract void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnCompletionListener
/*     */   {
/*     */     public abstract void onCompletion(MediaPlayer paramMediaPlayer);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnPreparedListener
/*     */   {
/*     */     public abstract void onPrepared(MediaPlayer paramMediaPlayer);
/*     */   }
/*     */ 
/*     */   public static class TrackInfo
/*     */     implements Parcelable
/*     */   {
/*     */     public static final int MEDIA_TRACK_TYPE_UNKNOWN = 0;
/*     */     public static final int MEDIA_TRACK_TYPE_VIDEO = 1;
/*     */     public static final int MEDIA_TRACK_TYPE_AUDIO = 2;
/*     */     public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = 3;
/*     */ 
/*     */     TrackInfo()
/*     */     {
/*   7 */       throw new RuntimeException("Stub!"); } 
/*   8 */     public int getTrackType() { throw new RuntimeException("Stub!"); } 
/*   9 */     public String getLanguage() { throw new RuntimeException("Stub!"); } 
/*  10 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  11 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaPlayer
 * JD-Core Version:    0.6.2
 */