/*    */ package android.text.style;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class SuggestionSpan extends CharacterStyle
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public static final int FLAG_EASY_CORRECT = 1;
/*    */   public static final int FLAG_MISSPELLED = 2;
/*    */   public static final int FLAG_AUTO_CORRECTION = 4;
/*    */   public static final String ACTION_SUGGESTION_PICKED = "android.text.style.SUGGESTION_PICKED";
/*    */   public static final String SUGGESTION_SPAN_PICKED_AFTER = "after";
/*    */   public static final String SUGGESTION_SPAN_PICKED_BEFORE = "before";
/*    */   public static final String SUGGESTION_SPAN_PICKED_HASHCODE = "hashcode";
/*    */   public static final int SUGGESTIONS_MAX_SIZE = 5;
/* 29 */   public static final Parcelable.Creator<SuggestionSpan> CREATOR = null;
/*    */ 
/*    */   public SuggestionSpan(Context context, String[] suggestions, int flags)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public SuggestionSpan(Locale locale, String[] suggestions, int flags) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SuggestionSpan(Context context, Locale locale, String[] suggestions, int flags, Class<?> notificationTargetClass) { throw new RuntimeException("Stub!"); } 
/*  9 */   public SuggestionSpan(Parcel src) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String[] getSuggestions() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getLocale() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getFlags() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setFlags(int flags) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void updateDrawState(TextPaint tp) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.SuggestionSpan
 * JD-Core Version:    0.6.2
 */