/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.net.InetAddress;
/*    */ 
/*    */ public class WifiP2pInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public boolean groupFormed;
/*    */   public boolean isGroupOwner;
/*    */   public InetAddress groupOwnerAddress;
/* 14 */   public static final Parcelable.Creator<WifiP2pInfo> CREATOR = null;
/*    */ 
/*    */   public WifiP2pInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public WifiP2pInfo(WifiP2pInfo source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.p2p.WifiP2pInfo
 * JD-Core Version:    0.6.2
 */