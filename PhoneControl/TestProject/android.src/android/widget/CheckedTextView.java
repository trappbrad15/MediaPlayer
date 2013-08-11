/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class CheckedTextView extends TextView
/*    */   implements Checkable
/*    */ {
/*    */   public CheckedTextView(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public CheckedTextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public CheckedTextView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   public void toggle() { throw new RuntimeException("Stub!"); } 
/* 11 */   @ViewDebug.ExportedProperty
/*    */   public boolean isChecked() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setCheckMarkDrawable(int resid) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setCheckMarkDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Drawable getCheckMarkDrawable() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.CheckedTextView
 * JD-Core Version:    0.6.2
 */