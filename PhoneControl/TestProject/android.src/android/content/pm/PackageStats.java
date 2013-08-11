/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class PackageStats
/*    */   implements Parcelable
/*    */ {
/*    */   public String packageName;
/*    */   public long codeSize;
/*    */   public long dataSize;
/*    */   public long cacheSize;
/*    */   public long externalCodeSize;
/*    */   public long externalDataSize;
/*    */   public long externalCacheSize;
/*    */   public long externalMediaSize;
/*    */   public long externalObbSize;
/* 21 */   public static final Parcelable.Creator<PackageStats> CREATOR = null;
/*    */ 
/*    */   public PackageStats(String pkgName)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PackageStats(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public PackageStats(PackageStats pStats) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.pm.PackageStats
 * JD-Core Version:    0.6.2
 */