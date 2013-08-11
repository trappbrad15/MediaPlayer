/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class WifiP2pDeviceList
/*    */   implements Parcelable
/*    */ {
/* 13 */   public static final Parcelable.Creator<WifiP2pDeviceList> CREATOR = null;
/*    */ 
/*    */   public WifiP2pDeviceList()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public WifiP2pDeviceList(WifiP2pDeviceList source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public WifiP2pDevice get(String deviceAddress) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Collection<WifiP2pDevice> getDeviceList() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.p2p.WifiP2pDeviceList
 * JD-Core Version:    0.6.2
 */