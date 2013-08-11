/*    */ package android.hardware.usb;
/*    */ 
/*    */ public class UsbDeviceConnection
/*    */ {
/*    */   UsbDeviceConnection()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void close() { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getFileDescriptor() { throw new RuntimeException("Stub!"); } 
/*  7 */   public byte[] getRawDescriptors() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean claimInterface(UsbInterface intf, boolean force) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean releaseInterface(UsbInterface intf) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int length, int timeout) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int offset, int length, int timeout) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int bulkTransfer(UsbEndpoint endpoint, byte[] buffer, int length, int timeout) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int bulkTransfer(UsbEndpoint endpoint, byte[] buffer, int offset, int length, int timeout) { throw new RuntimeException("Stub!"); } 
/* 14 */   public UsbRequest requestWait() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getSerial() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.usb.UsbDeviceConnection
 * JD-Core Version:    0.6.2
 */