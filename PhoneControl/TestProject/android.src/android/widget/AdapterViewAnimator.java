/*    */ package android.widget;
/*    */ 
/*    */ import android.animation.ObjectAnimator;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public abstract class AdapterViewAnimator extends AdapterView<Adapter>
/*    */   implements Advanceable
/*    */ {
/*    */   public AdapterViewAnimator(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public AdapterViewAnimator(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public AdapterViewAnimator(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   public void setDisplayedChild(int whichChild) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getDisplayedChild() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void showNext() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void showPrevious() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 18 */   public View getCurrentView() { throw new RuntimeException("Stub!"); } 
/* 19 */   public ObjectAnimator getInAnimation() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setInAnimation(ObjectAnimator inAnimation) { throw new RuntimeException("Stub!"); } 
/* 21 */   public ObjectAnimator getOutAnimation() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setOutAnimation(ObjectAnimator outAnimation) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setInAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setOutAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setAnimateFirstView(boolean animate) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 27 */   public Adapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setAdapter(Adapter adapter) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); } 
/* 31 */   public View getSelectedView() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void deferNotifyDataSetChanged() { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean onRemoteAdapterConnected() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void onRemoteAdapterDisconnected() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void advance() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void fyiWillBeAdvancedByHostKThx() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.AdapterViewAnimator
 * JD-Core Version:    0.6.2
 */