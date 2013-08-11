/*    */ package android.view.textservice;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class SuggestionsInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int RESULT_ATTR_IN_THE_DICTIONARY = 1;
/*    */   public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = 2;
/*    */   public static final int RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS = 4;
/* 20 */   public static final Parcelable.Creator<SuggestionsInfo> CREATOR = null;
/*    */ 
/*    */   public SuggestionsInfo(int suggestionsAttributes, String[] suggestions)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SuggestionsInfo(int suggestionsAttributes, String[] suggestions, int cookie, int sequence) { throw new RuntimeException("Stub!"); } 
/*  7 */   public SuggestionsInfo(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setCookieAndSequence(int cookie, int sequence) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getCookie() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getSequence() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getSuggestionsAttributes() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getSuggestionsCount() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getSuggestionAt(int i) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.textservice.SuggestionsInfo
 * JD-Core Version:    0.6.2
 */