/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public abstract class CompoundButton extends Button
/*    */   implements Checkable
/*    */ {
/*    */   public CompoundButton(Context context)
/*    */   {
/* 10 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public CompoundButton(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public CompoundButton(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 13 */   public void toggle() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean performClick() { throw new RuntimeException("Stub!"); } 
/* 16 */   @ViewDebug.ExportedProperty
/*    */   public boolean isChecked() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setOnCheckedChangeListener(OnCheckedChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setButtonDrawable(int resid) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setButtonDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 26 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 28 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 30 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnCheckedChangeListener
/*    */   {
/*    */     public abstract void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.CompoundButton
 * JD-Core Version:    0.6.2
 */