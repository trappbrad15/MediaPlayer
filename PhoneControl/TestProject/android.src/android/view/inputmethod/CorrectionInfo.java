/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class CorrectionInfo
/*    */   implements Parcelable
/*    */ {
/* 13 */   public static final Parcelable.Creator<CorrectionInfo> CREATOR = null;
/*    */ 
/*    */   public CorrectionInfo(int offset, CharSequence oldText, CharSequence newText)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getOffset() { throw new RuntimeException("Stub!"); } 
/*  7 */   public CharSequence getOldText() { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharSequence getNewText() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.inputmethod.CorrectionInfo
 * JD-Core Version:    0.6.2
 */