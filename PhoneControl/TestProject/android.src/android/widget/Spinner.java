/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class Spinner extends AbsSpinner
/*    */   implements DialogInterface.OnClickListener
/*    */ {
/*    */   public static final int MODE_DIALOG = 0;
/*    */   public static final int MODE_DROPDOWN = 1;
/*    */ 
/*    */   public Spinner(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public Spinner(Context context, int mode) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public Spinner(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   public Spinner(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public Spinner(Context context, AttributeSet attrs, int defStyle, int mode) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public void setPopupBackgroundDrawable(Drawable background) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setPopupBackgroundResource(int resId) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Drawable getPopupBackground() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setDropDownVerticalOffset(int pixels) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getDropDownVerticalOffset() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setDropDownHorizontalOffset(int pixels) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getDropDownHorizontalOffset() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setDropDownWidth(int pixels) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getDropDownWidth() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getGravity() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setAdapter(SpinnerAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean performClick() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setPrompt(CharSequence prompt) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setPromptId(int promptId) { throw new RuntimeException("Stub!"); } 
/* 35 */   public CharSequence getPrompt() { throw new RuntimeException("Stub!"); } 
/* 36 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.Spinner
 * JD-Core Version:    0.6.2
 */