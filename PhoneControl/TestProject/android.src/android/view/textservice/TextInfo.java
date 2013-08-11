/*    */ package android.view.textservice;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class TextInfo
/*    */   implements Parcelable
/*    */ {
/* 14 */   public static final Parcelable.Creator<TextInfo> CREATOR = null;
/*    */ 
/*    */   public TextInfo(String text)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public TextInfo(String text, int cookie, int sequence) { throw new RuntimeException("Stub!"); } 
/*  7 */   public TextInfo(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getText() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getCookie() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getSequence() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.textservice.TextInfo
 * JD-Core Version:    0.6.2
 */