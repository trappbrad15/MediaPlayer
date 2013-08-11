/*    */ package android.view.textservice;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.pm.ApplicationInfo;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class SpellCheckerSubtype
/*    */   implements Parcelable
/*    */ {
/* 17 */   public static final Parcelable.Creator<SpellCheckerSubtype> CREATOR = null;
/*    */ 
/*    */   public SpellCheckerSubtype(int nameId, String locale, String extraValue)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getNameResId() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getLocale() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getExtraValue() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean containsExtraValueKey(String key) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getExtraValueOf(String key) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharSequence getDisplayName(Context context, String packageName, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.textservice.SpellCheckerSubtype
 * JD-Core Version:    0.6.2
 */