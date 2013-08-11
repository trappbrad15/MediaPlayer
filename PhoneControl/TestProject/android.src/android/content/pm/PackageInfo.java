/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class PackageInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String packageName;
/*    */   public int versionCode;
/*    */   public String versionName;
/*    */   public String sharedUserId;
/*    */   public int sharedUserLabel;
/*    */   public ApplicationInfo applicationInfo;
/*    */   public long firstInstallTime;
/*    */   public long lastUpdateTime;
/* 17 */   public int[] gids = null;
/* 18 */   public ActivityInfo[] activities = null;
/* 19 */   public ActivityInfo[] receivers = null;
/* 20 */   public ServiceInfo[] services = null;
/* 21 */   public ProviderInfo[] providers = null;
/* 22 */   public InstrumentationInfo[] instrumentation = null;
/* 23 */   public PermissionInfo[] permissions = null;
/* 24 */   public String[] requestedPermissions = null;
/* 25 */   public int[] requestedPermissionsFlags = null;
/*    */   public static final int REQUESTED_PERMISSION_REQUIRED = 1;
/*    */   public static final int REQUESTED_PERMISSION_GRANTED = 2;
/* 28 */   public Signature[] signatures = null;
/* 29 */   public ConfigurationInfo[] configPreferences = null;
/* 30 */   public FeatureInfo[] reqFeatures = null;
/*    */ 
/* 32 */   public static final Parcelable.Creator<PackageInfo> CREATOR = null;
/*    */ 
/*    */   public PackageInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.pm.PackageInfo
 * JD-Core Version:    0.6.2
 */