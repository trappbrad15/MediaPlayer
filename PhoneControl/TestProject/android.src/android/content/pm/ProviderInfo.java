/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.PatternMatcher;
/*    */ 
/*    */ public final class ProviderInfo extends ComponentInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String authority;
/*    */   public String readPermission;
/*    */   public String writePermission;
/*    */   public boolean grantUriPermissions;
/* 15 */   public PatternMatcher[] uriPermissionPatterns = null;
/* 16 */   public PathPermission[] pathPermissions = null;
/*    */   public boolean multiprocess;
/*    */   public int initOrder;
/*    */   public static final int FLAG_SINGLE_USER = 1073741824;
/*    */   public int flags;
/*    */ 
/*    */   @Deprecated
/*    */   public boolean isSyncable;
/* 24 */   public static final Parcelable.Creator<ProviderInfo> CREATOR = null;
/*    */ 
/*    */   public ProviderInfo()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ProviderInfo(ProviderInfo orig) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel out, int parcelableFlags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.pm.ProviderInfo
 * JD-Core Version:    0.6.2
 */