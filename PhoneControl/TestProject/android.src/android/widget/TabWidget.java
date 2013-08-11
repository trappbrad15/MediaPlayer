/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.View.OnFocusChangeListener;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class TabWidget extends LinearLayout
/*    */   implements View.OnFocusChangeListener
/*    */ {
/*    */   public TabWidget(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public TabWidget(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public TabWidget(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); } 
/* 11 */   public View getChildTabViewAt(int index) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getTabCount() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setDividerDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setDividerDrawable(int resId) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setLeftStripDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setLeftStripDrawable(int resId) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setRightStripDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setRightStripDrawable(int resId) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setStripEnabled(boolean stripEnabled) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isStripEnabled() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void childDrawableStateChanged(View child) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setCurrentTab(int index) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void sendAccessibilityEventUnchecked(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void focusCurrentTab(int index) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void addView(View child) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void removeAllViews() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void onFocusChange(View v, boolean hasFocus) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.TabWidget
 * JD-Core Version:    0.6.2
 */