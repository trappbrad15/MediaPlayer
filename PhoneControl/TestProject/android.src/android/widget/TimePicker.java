/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class TimePicker extends FrameLayout
/*    */ {
/*    */   public TimePicker(Context context)
/*    */   {
/*  9 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public TimePicker(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public TimePicker(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Integer getCurrentHour() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setCurrentHour(Integer currentHour) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setIs24HourView(Boolean is24HourView) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean is24HourView() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Integer getCurrentMinute() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setCurrentMinute(Integer currentMinute) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void onPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnTimeChangedListener
/*    */   {
/*    */     public abstract void onTimeChanged(TimePicker paramTimePicker, int paramInt1, int paramInt2);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.TimePicker
 * JD-Core Version:    0.6.2
 */