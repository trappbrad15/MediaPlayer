/*    */ package android.content.res;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ObbInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int OBB_OVERLAY = 1;
/*    */   public String filename;
/*    */   public String packageName;
/*    */   public int version;
/*    */   public int flags;
/* 15 */   public static final Parcelable.Creator<ObbInfo> CREATOR = null;
/*    */ 
/*    */   ObbInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.res.ObbInfo
 * JD-Core Version:    0.6.2
 */