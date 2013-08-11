/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class BluetoothGattServer
/*    */   implements BluetoothProfile
/*    */ {
/*    */   BluetoothGattServer()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean connect(BluetoothDevice device, boolean autoConnect) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void cancelConnection(BluetoothDevice device) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean sendResponse(BluetoothDevice device, int requestId, int status, int offset, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean notifyCharacteristicChanged(BluetoothDevice device, BluetoothGattCharacteristic characteristic, boolean confirm) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean addService(BluetoothGattService service) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean removeService(BluetoothGattService service) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void clearServices() { throw new RuntimeException("Stub!"); } 
/* 14 */   public List<BluetoothGattService> getServices() { throw new RuntimeException("Stub!"); } 
/* 15 */   public BluetoothGattService getService(UUID uuid) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); } 
/* 17 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); } 
/* 18 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothGattServer
 * JD-Core Version:    0.6.2
 */