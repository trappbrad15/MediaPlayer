/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.net.wifi.WpsInfo;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class WifiP2pConfig
/*    */   implements Parcelable
/*    */ {
/*    */   public String deviceAddress;
/*    */   public WpsInfo wps;
/*    */   public int groupOwnerIntent;
/* 14 */   public static final Parcelable.Creator<WifiP2pConfig> CREATOR = null;
/*    */ 
/*    */   public WifiP2pConfig()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public WifiP2pConfig(WifiP2pConfig source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.p2p.WifiP2pConfig
 * JD-Core Version:    0.6.2
 */