/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.pm.ApplicationInfo;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class InputMethodSubtype
/*    */   implements Parcelable
/*    */ {
/* 22 */   public static final Parcelable.Creator<InputMethodSubtype> CREATOR = null;
/*    */ 
/*    */   public InputMethodSubtype(int nameId, int iconId, String locale, String mode, String extraValue, boolean isAuxiliary, boolean overridesImplicitlyEnabledSubtype)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public InputMethodSubtype(int nameId, int iconId, String locale, String mode, String extraValue, boolean isAuxiliary, boolean overridesImplicitlyEnabledSubtype, int id) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getNameResId() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getIconResId() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getLocale() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getMode() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getExtraValue() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isAuxiliary() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean overridesImplicitlyEnabledSubtype() { throw new RuntimeException("Stub!"); } 
/* 14 */   public CharSequence getDisplayName(Context context, String packageName, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean containsExtraValueKey(String key) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getExtraValueOf(String key) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.inputmethod.InputMethodSubtype
 * JD-Core Version:    0.6.2
 */