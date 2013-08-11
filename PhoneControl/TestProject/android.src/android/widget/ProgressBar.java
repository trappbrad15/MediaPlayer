/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ import android.view.animation.Interpolator;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class ProgressBar extends View
/*    */ {
/*    */   public ProgressBar(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public ProgressBar(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public ProgressBar(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   @ViewDebug.ExportedProperty(category="progress")
/*    */   public synchronized boolean isIndeterminate() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized void setIndeterminate(boolean indeterminate) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Drawable getIndeterminateDrawable() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setIndeterminateDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Drawable getProgressDrawable() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setProgressDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void postInvalidate() { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void setProgress(int progress) { throw new RuntimeException("Stub!"); } 
/* 20 */   public synchronized void setSecondaryProgress(int secondaryProgress) { throw new RuntimeException("Stub!"); } 
/* 22 */   @ViewDebug.ExportedProperty(category="progress")
/*    */   public synchronized int getProgress() { throw new RuntimeException("Stub!"); } 
/* 24 */   @ViewDebug.ExportedProperty(category="progress")
/*    */   public synchronized int getSecondaryProgress() { throw new RuntimeException("Stub!"); } 
/* 26 */   @ViewDebug.ExportedProperty(category="progress")
/*    */   public synchronized int getMax() { throw new RuntimeException("Stub!"); } 
/* 27 */   public synchronized void setMax(int max) { throw new RuntimeException("Stub!"); } 
/* 28 */   public final synchronized void incrementProgressBy(int diff) { throw new RuntimeException("Stub!"); } 
/* 29 */   public final synchronized void incrementSecondaryProgressBy(int diff) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setInterpolator(Context context, int resID) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setInterpolator(Interpolator interpolator) { throw new RuntimeException("Stub!"); } 
/* 32 */   public Interpolator getInterpolator() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setVisibility(int v) { throw new RuntimeException("Stub!"); } 
/* 34 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void invalidateDrawable(Drawable dr) { throw new RuntimeException("Stub!"); } 
/* 36 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 37 */   protected synchronized void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 38 */   protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 39 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 40 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 42 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 43 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 44 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.ProgressBar
 * JD-Core Version:    0.6.2
 */