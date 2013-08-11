/*    */ package android.hardware.usb;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class UsbEndpoint
/*    */   implements Parcelable
/*    */ {
/* 17 */   public static final Parcelable.Creator<UsbEndpoint> CREATOR = null;
/*    */ 
/*    */   UsbEndpoint()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getAddress() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getEndpointNumber() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getDirection() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getAttributes() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getMaxPacketSize() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getInterval() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.usb.UsbEndpoint
 * JD-Core Version:    0.6.2
 */