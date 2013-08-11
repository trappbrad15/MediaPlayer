/*    */ package android.view.textservice;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class SpellCheckerInfo
/*    */   implements Parcelable
/*    */ {
/* 18 */   public static final Parcelable.Creator<SpellCheckerInfo> CREATOR = null;
/*    */ 
/*    */   SpellCheckerInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getId() { throw new RuntimeException("Stub!"); } 
/*  7 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getPackageName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 12 */   public ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getSettingsActivity() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getSubtypeCount() { throw new RuntimeException("Stub!"); } 
/* 15 */   public SpellCheckerSubtype getSubtypeAt(int index) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.textservice.SpellCheckerInfo
 * JD-Core Version:    0.6.2
 */