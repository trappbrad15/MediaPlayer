/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class TextClock extends TextView
/*    */ {
/*    */ 
/*    */   @Deprecated
/* 26 */   public static final CharSequence DEFAULT_FORMAT_12_HOUR = null;
/*    */ 
/*    */   @Deprecated
/* 26 */   public static final CharSequence DEFAULT_FORMAT_24_HOUR = null;
/*    */ 
/*    */   public TextClock(Context context)
/*    */   {
/*  7 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!");
/*    */   }
/*  9 */   public TextClock(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public TextClock(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   @ViewDebug.ExportedProperty
/*    */   public CharSequence getFormat12Hour() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setFormat12Hour(CharSequence format) { throw new RuntimeException("Stub!"); } 
/* 15 */   @ViewDebug.ExportedProperty
/*    */   public CharSequence getFormat24Hour() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setFormat24Hour(CharSequence format) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean is24HourModeEnabled() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getTimeZone() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setTimeZone(String timeZone) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.TextClock
 * JD-Core Version:    0.6.2
 */