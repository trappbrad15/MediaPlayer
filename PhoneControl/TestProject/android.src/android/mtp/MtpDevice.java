/*    */ package android.mtp;
/*    */ 
/*    */ import android.hardware.usb.UsbDevice;
/*    */ import android.hardware.usb.UsbDeviceConnection;
/*    */ 
/*    */ public final class MtpDevice
/*    */ {
/*    */   public MtpDevice(UsbDevice device)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public boolean open(UsbDeviceConnection connection) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getDeviceName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getDeviceId() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public MtpDeviceInfo getDeviceInfo() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int[] getStorageIds() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int[] getObjectHandles(int storageId, int format, int objectHandle) { throw new RuntimeException("Stub!"); } 
/* 14 */   public byte[] getObject(int objectHandle, int objectSize) { throw new RuntimeException("Stub!"); } 
/* 15 */   public byte[] getThumbnail(int objectHandle) { throw new RuntimeException("Stub!"); } 
/* 16 */   public MtpStorageInfo getStorageInfo(int storageId) { throw new RuntimeException("Stub!"); } 
/* 17 */   public MtpObjectInfo getObjectInfo(int objectHandle) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean deleteObject(int objectHandle) { throw new RuntimeException("Stub!"); } 
/* 19 */   public long getParent(int objectHandle) { throw new RuntimeException("Stub!"); } 
/* 20 */   public long getStorageId(int objectHandle) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean importFile(int objectHandle, String destPath) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.mtp.MtpDevice
 * JD-Core Version:    0.6.2
 */