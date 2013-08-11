/*   */ package android.net.wifi;
/*   */ 
/*   */ import android.os.Parcel;
/*   */ import android.os.Parcelable;
/*   */ 
/*   */ public class ScanResult
/*   */   implements Parcelable
/*   */ {
/*   */   public String SSID;
/*   */   public String BSSID;
/*   */   public String capabilities;
/*   */   public int level;
/*   */   public int frequency;
/*   */   public long timestamp;
/*   */ 
/*   */   ScanResult()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 7 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.ScanResult
 * JD-Core Version:    0.6.2
 */