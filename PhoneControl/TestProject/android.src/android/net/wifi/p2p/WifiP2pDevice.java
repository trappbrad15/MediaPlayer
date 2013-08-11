/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class WifiP2pDevice
/*    */   implements Parcelable
/*    */ {
/*    */   public String deviceName;
/*    */   public String deviceAddress;
/*    */   public String primaryDeviceType;
/*    */   public String secondaryDeviceType;
/*    */   public static final int CONNECTED = 0;
/*    */   public static final int INVITED = 1;
/*    */   public static final int FAILED = 2;
/*    */   public static final int AVAILABLE = 3;
/*    */   public static final int UNAVAILABLE = 4;
/*    */   public int status;
/* 27 */   public static final Parcelable.Creator<WifiP2pDevice> CREATOR = null;
/*    */ 
/*    */   public WifiP2pDevice()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public WifiP2pDevice(WifiP2pDevice source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean wpsPbcSupported() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean wpsKeypadSupported() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean wpsDisplaySupported() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isServiceDiscoveryCapable() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isGroupOwner() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.p2p.WifiP2pDevice
 * JD-Core Version:    0.6.2
 */