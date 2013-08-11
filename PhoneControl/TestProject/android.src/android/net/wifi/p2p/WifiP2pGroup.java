/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class WifiP2pGroup
/*    */   implements Parcelable
/*    */ {
/* 17 */   public static final Parcelable.Creator<WifiP2pGroup> CREATOR = null;
/*    */ 
/*    */   public WifiP2pGroup()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public WifiP2pGroup(WifiP2pGroup source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getNetworkName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isGroupOwner() { throw new RuntimeException("Stub!"); } 
/*  9 */   public WifiP2pDevice getOwner() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Collection<WifiP2pDevice> getClientList() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getPassphrase() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getInterface() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.p2p.WifiP2pGroup
 * JD-Core Version:    0.6.2
 */