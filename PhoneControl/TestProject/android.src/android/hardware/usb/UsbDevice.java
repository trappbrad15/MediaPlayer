/*    */ package android.hardware.usb;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class UsbDevice
/*    */   implements Parcelable
/*    */ {
/* 23 */   public static final Parcelable.Creator<UsbDevice> CREATOR = null;
/*    */ 
/*    */   UsbDevice()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getDeviceName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getDeviceId() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getVendorId() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getProductId() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getDeviceClass() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getDeviceSubclass() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getDeviceProtocol() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getInterfaceCount() { throw new RuntimeException("Stub!"); } 
/* 14 */   public UsbInterface getInterface(int index) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 18 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static int getDeviceId(String name) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static String getDeviceName(int id) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.usb.UsbDevice
 * JD-Core Version:    0.6.2
 */