/*   */ package android.net.wifi.p2p.nsd;
/*   */ 
/*   */ import android.os.Parcel;
/*   */ import android.os.Parcelable;
/*   */ 
/*   */ public class WifiP2pServiceInfo
/*   */   implements Parcelable
/*   */ {
/*   */   public static final int SERVICE_TYPE_ALL = 0;
/*   */   public static final int SERVICE_TYPE_BONJOUR = 1;
/*   */   public static final int SERVICE_TYPE_UPNP = 2;
/*   */   public static final int SERVICE_TYPE_VENDOR_SPECIFIC = 255;
/*   */ 
/*   */   WifiP2pServiceInfo()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 7 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.p2p.nsd.WifiP2pServiceInfo
 * JD-Core Version:    0.6.2
 */