/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class InstrumentationInfo extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String targetPackage;
/*    */   public String sourceDir;
/*    */   public String publicSourceDir;
/*    */   public String dataDir;
/*    */   public boolean handleProfiling;
/*    */   public boolean functionalTest;
/* 18 */   public static final Parcelable.Creator<InstrumentationInfo> CREATOR = null;
/*    */ 
/*    */   public InstrumentationInfo()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public InstrumentationInfo(InstrumentationInfo orig) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.pm.InstrumentationInfo
 * JD-Core Version:    0.6.2
 */