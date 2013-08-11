/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class MediaController extends FrameLayout
/*    */ {
/*    */   public MediaController(Context context, AttributeSet attrs)
/*    */   {
/* 19 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public MediaController(Context context, boolean useFastForward) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public MediaController(Context context) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 22 */   public void onFinishInflate() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setMediaPlayer(MediaPlayerControl player) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setAnchorView(View view) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void show() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void show(int timeout) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isShowing() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void hide() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean onTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setPrevNextListeners(View.OnClickListener next, View.OnClickListener prev) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface MediaPlayerControl
/*    */   {
/*    */     public abstract void start();
/*    */ 
/*    */     public abstract void pause();
/*    */ 
/*    */     public abstract int getDuration();
/*    */ 
/*    */     public abstract int getCurrentPosition();
/*    */ 
/*    */     public abstract void seekTo(int paramInt);
/*    */ 
/*    */     public abstract boolean isPlaying();
/*    */ 
/*    */     public abstract int getBufferPercentage();
/*    */ 
/*    */     public abstract boolean canPause();
/*    */ 
/*    */     public abstract boolean canSeekBackward();
/*    */ 
/*    */     public abstract boolean canSeekForward();
/*    */ 
/*    */     public abstract int getAudioSessionId();
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.MediaController
 * JD-Core Version:    0.6.2
 */