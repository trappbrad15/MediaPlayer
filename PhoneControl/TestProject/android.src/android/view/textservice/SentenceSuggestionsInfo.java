/*    */ package android.view.textservice;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class SentenceSuggestionsInfo
/*    */   implements Parcelable
/*    */ {
/* 14 */   public static final Parcelable.Creator<SentenceSuggestionsInfo> CREATOR = null;
/*    */ 
/*    */   public SentenceSuggestionsInfo(SuggestionsInfo[] suggestionsInfos, int[] offsets, int[] lengths)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SentenceSuggestionsInfo(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getSuggestionsCount() { throw new RuntimeException("Stub!"); } 
/* 10 */   public SuggestionsInfo getSuggestionsInfoAt(int i) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getOffsetAt(int i) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getLengthAt(int i) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.textservice.SentenceSuggestionsInfo
 * JD-Core Version:    0.6.2
 */