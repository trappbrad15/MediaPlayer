/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class WpsInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int PBC = 0;
/*    */   public static final int DISPLAY = 1;
/*    */   public static final int KEYPAD = 2;
/*    */   public static final int LABEL = 3;
/*    */   public static final int INVALID = 4;
/*    */   public int setup;
/*    */   public String pin;
/* 18 */   public static final Parcelable.Creator<WpsInfo> CREATOR = null;
/*    */ 
/*    */   public WpsInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public WpsInfo(WpsInfo source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.WpsInfo
 * JD-Core Version:    0.6.2
 */