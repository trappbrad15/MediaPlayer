/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.media.MediaPlayer.OnCompletionListener;
/*    */ import android.media.MediaPlayer.OnErrorListener;
/*    */ import android.media.MediaPlayer.OnInfoListener;
/*    */ import android.media.MediaPlayer.OnPreparedListener;
/*    */ import android.net.Uri;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.SurfaceView;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class VideoView extends SurfaceView
/*    */   implements MediaController.MediaPlayerControl
/*    */ {
/*    */   public VideoView(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public VideoView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public VideoView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int resolveAdjustedSize(int desiredSize, int measureSpec) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setVideoPath(String path) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setVideoURI(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void stopPlayback() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setMediaController(MediaController controller) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setOnPreparedListener(MediaPlayer.OnPreparedListener l) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setOnCompletionListener(MediaPlayer.OnCompletionListener l) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setOnErrorListener(MediaPlayer.OnErrorListener l) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setOnInfoListener(MediaPlayer.OnInfoListener l) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean onTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void pause() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void suspend() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void resume() { throw new RuntimeException("Stub!"); } 
/* 28 */   public int getDuration() { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getCurrentPosition() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void seekTo(int msec) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean isPlaying() { throw new RuntimeException("Stub!"); } 
/* 32 */   public int getBufferPercentage() { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean canPause() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean canSeekBackward() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean canSeekForward() { throw new RuntimeException("Stub!"); } 
/* 36 */   public int getAudioSessionId() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.VideoView
 * JD-Core Version:    0.6.2
 */