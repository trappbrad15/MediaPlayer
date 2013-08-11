/*    */ package android.telephony;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class NeighboringCellInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int UNKNOWN_RSSI = 99;
/*    */   public static final int UNKNOWN_CID = -1;
/* 26 */   public static final Parcelable.Creator<NeighboringCellInfo> CREATOR = null;
/*    */ 
/*    */   @Deprecated
/*    */   public NeighboringCellInfo()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  8 */   @Deprecated
/*    */   public NeighboringCellInfo(int rssi, int cid) { throw new RuntimeException("Stub!"); } 
/*  9 */   public NeighboringCellInfo(int rssi, String location, int radioType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public NeighboringCellInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getRssi() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getLac() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getCid() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getPsc() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getNetworkType() { throw new RuntimeException("Stub!"); } 
/* 17 */   @Deprecated
/*    */   public void setCid(int cid) { throw new RuntimeException("Stub!"); } 
/* 19 */   @Deprecated
/*    */   public void setRssi(int rssi) { throw new RuntimeException("Stub!"); } 
/* 20 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.telephony.NeighboringCellInfo
 * JD-Core Version:    0.6.2
 */