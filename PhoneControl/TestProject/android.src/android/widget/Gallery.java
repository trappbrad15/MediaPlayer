/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Bundle;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.GestureDetector.OnGestureListener;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ import android.view.animation.Transformation;
/*    */ 
/*    */ @Deprecated
/*    */ public class Gallery extends AbsSpinner
/*    */   implements GestureDetector.OnGestureListener
/*    */ {
/*    */   public Gallery(Context context)
/*    */   {
/* 14 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 15 */   public Gallery(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 16 */   public Gallery(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 17 */   public void setCallbackDuringFling(boolean shouldCallback) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setAnimationDuration(int animationDurationMillis) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setSpacing(int spacing) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setUnselectedAlpha(float unselectedAlpha) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected boolean getChildStaticTransformation(View child, Transformation t) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected int computeHorizontalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 23 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 24 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 26 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 27 */   public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 29 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean onSingleTapUp(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean onDown(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void onLongPress(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void onShowPress(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 38 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); } 
/* 39 */   protected ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean showContextMenuForChild(View originalView) { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean showContextMenu() { throw new RuntimeException("Stub!"); } 
/* 42 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 44 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 46 */   protected int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); } 
/* 47 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean performAccessibilityAction(int action, Bundle arguments) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class LayoutParams extends ViewGroup.LayoutParams
/*    */   {
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 10 */       super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams(int w, int h) { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams(ViewGroup.LayoutParams source) { super(); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.Gallery
 * JD-Core Version:    0.6.2
 */