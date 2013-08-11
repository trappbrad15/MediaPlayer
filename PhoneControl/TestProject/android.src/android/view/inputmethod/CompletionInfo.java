/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class CompletionInfo
/*    */   implements Parcelable
/*    */ {
/* 15 */   public static final Parcelable.Creator<CompletionInfo> CREATOR = null;
/*    */ 
/*    */   public CompletionInfo(long id, int index, CharSequence text)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public CompletionInfo(long id, int index, CharSequence text, CharSequence label) { throw new RuntimeException("Stub!"); } 
/*  7 */   public long getId() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getPosition() { throw new RuntimeException("Stub!"); } 
/*  9 */   public CharSequence getText() { throw new RuntimeException("Stub!"); } 
/* 10 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.inputmethod.CompletionInfo
 * JD-Core Version:    0.6.2
 */