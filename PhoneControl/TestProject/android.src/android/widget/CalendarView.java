/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Configuration;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class CalendarView extends FrameLayout
/*    */ {
/*    */   public CalendarView(Context context)
/*    */   {
/*  9 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public CalendarView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public CalendarView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public void setShownWeekCount(int count) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getShownWeekCount() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setSelectedWeekBackgroundColor(int color) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getSelectedWeekBackgroundColor() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setFocusedMonthDateColor(int color) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getFocusedMonthDateColor() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setUnfocusedMonthDateColor(int color) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getUnfocusedMonthDateColor() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setWeekNumberColor(int color) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getWeekNumberColor() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setWeekSeparatorLineColor(int color) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getWeekSeparatorLineColor() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setSelectedDateVerticalBar(int resourceId) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setSelectedDateVerticalBar(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 26 */   public Drawable getSelectedDateVerticalBar() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setWeekDayTextAppearance(int resourceId) { throw new RuntimeException("Stub!"); } 
/* 28 */   public int getWeekDayTextAppearance() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setDateTextAppearance(int resourceId) { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getDateTextAppearance() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 33 */   protected void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 36 */   public long getMinDate() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setMinDate(long minDate) { throw new RuntimeException("Stub!"); } 
/* 38 */   public long getMaxDate() { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setMaxDate(long maxDate) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void setShowWeekNumber(boolean showWeekNumber) { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean getShowWeekNumber() { throw new RuntimeException("Stub!"); } 
/* 42 */   public int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void setFirstDayOfWeek(int firstDayOfWeek) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void setOnDateChangeListener(OnDateChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 45 */   public long getDate() { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setDate(long date) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void setDate(long date, boolean animate, boolean center) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnDateChangeListener
/*    */   {
/*    */     public abstract void onSelectedDayChange(CalendarView paramCalendarView, int paramInt1, int paramInt2, int paramInt3);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.CalendarView
 * JD-Core Version:    0.6.2
 */