/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.IntentFilter;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ public class ResolveInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public ActivityInfo activityInfo;
/*    */   public ServiceInfo serviceInfo;
/*    */   public IntentFilter filter;
/*    */   public int priority;
/*    */   public int preferredOrder;
/*    */   public int match;
/*    */   public int specificIndex;
/*    */   public boolean isDefault;
/*    */   public int labelRes;
/*    */   public CharSequence nonLocalizedLabel;
/*    */   public int icon;
/*    */   public String resolvePackageName;
/* 33 */   public static final Parcelable.Creator<ResolveInfo> CREATOR = null;
/*    */ 
/*    */   public ResolveInfo()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public ResolveInfo(ResolveInfo orig) { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final int getIconResource() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 18 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class DisplayNameComparator
/*    */     implements Comparator<ResolveInfo>
/*    */   {
/*    */     public DisplayNameComparator(PackageManager pm)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public final int compare(ResolveInfo a, ResolveInfo b) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.pm.ResolveInfo
 * JD-Core Version:    0.6.2
 */