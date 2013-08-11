/*   */ package android.net;
/*   */ 
/*   */ import android.os.Parcel;
/*   */ import android.os.Parcelable;
/*   */ 
/*   */ @Deprecated
/*   */ public class DhcpInfo
/*   */   implements Parcelable
/*   */ {
/*   */   public int ipAddress;
/*   */   public int gateway;
/*   */   public int netmask;
/*   */   public int dns1;
/*   */   public int dns2;
/*   */   public int serverAddress;
/*   */   public int leaseDuration;
/*   */ 
/*   */   public DhcpInfo()
/*   */   {
/* 6 */     throw new RuntimeException("Stub!"); } 
/* 7 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.DhcpInfo
 * JD-Core Version:    0.6.2
 */