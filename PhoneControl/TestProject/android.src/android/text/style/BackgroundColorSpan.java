/*    */ package android.text.style;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
/*    */ 
/*    */ public class BackgroundColorSpan extends CharacterStyle
/*    */   implements UpdateAppearance, ParcelableSpan
/*    */ {
/*    */   public BackgroundColorSpan(int color)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public BackgroundColorSpan(Parcel src) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getBackgroundColor() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.BackgroundColorSpan
 * JD-Core Version:    0.6.2
 */