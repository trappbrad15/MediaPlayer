/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public enum SupplicantState
/*    */   implements Parcelable
/*    */ {
/*  5 */   ASSOCIATED, 
/*  6 */   ASSOCIATING, 
/*  7 */   AUTHENTICATING, 
/*  8 */   COMPLETED, 
/*  9 */   DISCONNECTED, 
/* 10 */   DORMANT, 
/* 11 */   FOUR_WAY_HANDSHAKE, 
/* 12 */   GROUP_HANDSHAKE, 
/* 13 */   INACTIVE, 
/* 14 */   INTERFACE_DISABLED, 
/* 15 */   INVALID, 
/* 16 */   SCANNING, 
/* 17 */   UNINITIALIZED;
/*    */ 
/* 18 */   public static boolean isValidState(SupplicantState state) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.SupplicantState
 * JD-Core Version:    0.6.2
 */