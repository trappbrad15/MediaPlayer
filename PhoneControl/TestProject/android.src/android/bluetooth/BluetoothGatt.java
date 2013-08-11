/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class BluetoothGatt
/*    */   implements BluetoothProfile
/*    */ {
/*    */   public static final int GATT_SUCCESS = 0;
/*    */   public static final int GATT_READ_NOT_PERMITTED = 2;
/*    */   public static final int GATT_WRITE_NOT_PERMITTED = 3;
/*    */   public static final int GATT_INSUFFICIENT_AUTHENTICATION = 5;
/*    */   public static final int GATT_REQUEST_NOT_SUPPORTED = 6;
/*    */   public static final int GATT_INSUFFICIENT_ENCRYPTION = 15;
/*    */   public static final int GATT_INVALID_OFFSET = 7;
/*    */   public static final int GATT_INVALID_ATTRIBUTE_LENGTH = 13;
/*    */   public static final int GATT_FAILURE = 257;
/*    */ 
/*    */   BluetoothGatt()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void disconnect() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean connect() { throw new RuntimeException("Stub!"); } 
/*  9 */   public BluetoothDevice getDevice() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean discoverServices() { throw new RuntimeException("Stub!"); } 
/* 11 */   public List<BluetoothGattService> getServices() { throw new RuntimeException("Stub!"); } 
/* 12 */   public BluetoothGattService getService(UUID uuid) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean readCharacteristic(BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean writeCharacteristic(BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean readDescriptor(BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean writeDescriptor(BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean beginReliableWrite() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean executeReliableWrite() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void abortReliableWrite(BluetoothDevice mDevice) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean setCharacteristicNotification(BluetoothGattCharacteristic characteristic, boolean enable) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean readRemoteRssi() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); } 
/* 23 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); } 
/* 24 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothGatt
 * JD-Core Version:    0.6.2
 */