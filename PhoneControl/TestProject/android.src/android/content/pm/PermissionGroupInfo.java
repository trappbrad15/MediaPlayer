/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class PermissionGroupInfo extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public int descriptionRes;
/*    */   public CharSequence nonLocalizedDescription;
/*    */   public static final int FLAG_PERSONAL_INFO = 1;
/*    */   public int flags;
/*    */   public int priority;
/* 18 */   public static final Parcelable.Creator<PermissionGroupInfo> CREATOR = null;
/*    */ 
/*    */   public PermissionGroupInfo()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public PermissionGroupInfo(PermissionGroupInfo orig) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharSequence loadDescription(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.pm.PermissionGroupInfo
 * JD-Core Version:    0.6.2
 */