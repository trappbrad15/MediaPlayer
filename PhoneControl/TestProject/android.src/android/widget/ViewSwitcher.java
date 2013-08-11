/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class ViewSwitcher extends ViewAnimator
/*    */ {
/*    */   public ViewSwitcher(Context context)
/*    */   {
/*  9 */     super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/* 10 */   public ViewSwitcher(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/* 11 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 14 */   public View getNextView() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setFactory(ViewFactory factory) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void reset() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface ViewFactory
/*    */   {
/*    */     public abstract View makeView();
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.ViewSwitcher
 * JD-Core Version:    0.6.2
 */