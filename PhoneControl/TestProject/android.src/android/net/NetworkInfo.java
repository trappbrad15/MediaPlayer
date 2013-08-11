/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class NetworkInfo
/*    */   implements Parcelable
/*    */ {
/*    */   NetworkInfo()
/*    */   {
/* 30 */     throw new RuntimeException("Stub!"); } 
/* 31 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 32 */   public int getSubtype() { throw new RuntimeException("Stub!"); } 
/* 33 */   public String getTypeName() { throw new RuntimeException("Stub!"); } 
/* 34 */   public String getSubtypeName() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean isConnectedOrConnecting() { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean isAvailable() { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean isFailover() { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean isRoaming() { throw new RuntimeException("Stub!"); } 
/* 40 */   public State getState() { throw new RuntimeException("Stub!"); } 
/* 41 */   public DetailedState getDetailedState() { throw new RuntimeException("Stub!"); } 
/* 42 */   public String getReason() { throw new RuntimeException("Stub!"); } 
/* 43 */   public String getExtraInfo() { throw new RuntimeException("Stub!"); } 
/* 44 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 45 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 46 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum DetailedState
/*    */   {
/* 16 */     AUTHENTICATING, 
/* 17 */     BLOCKED, 
/* 18 */     CAPTIVE_PORTAL_CHECK, 
/* 19 */     CONNECTED, 
/* 20 */     CONNECTING, 
/* 21 */     DISCONNECTED, 
/* 22 */     DISCONNECTING, 
/* 23 */     FAILED, 
/* 24 */     IDLE, 
/* 25 */     OBTAINING_IPADDR, 
/* 26 */     SCANNING, 
/* 27 */     SUSPENDED, 
/* 28 */     VERIFYING_POOR_LINK;
/*    */   }
/*    */ 
/*    */   public static enum State
/*    */   {
/*  7 */     CONNECTED, 
/*  8 */     CONNECTING, 
/*  9 */     DISCONNECTED, 
/* 10 */     DISCONNECTING, 
/* 11 */     SUSPENDED, 
/* 12 */     UNKNOWN;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.NetworkInfo
 * JD-Core Version:    0.6.2
 */