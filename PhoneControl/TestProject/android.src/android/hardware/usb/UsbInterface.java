/*    */ package android.hardware.usb;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class UsbInterface
/*    */   implements Parcelable
/*    */ {
/* 16 */   public static final Parcelable.Creator<UsbInterface> CREATOR = null;
/*    */ 
/*    */   UsbInterface()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getId() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getInterfaceClass() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getInterfaceSubclass() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getInterfaceProtocol() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getEndpointCount() { throw new RuntimeException("Stub!"); } 
/* 11 */   public UsbEndpoint getEndpoint(int index) { throw new RuntimeException("Stub!"); } 
/* 12 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.usb.UsbInterface
 * JD-Core Version:    0.6.2
 */