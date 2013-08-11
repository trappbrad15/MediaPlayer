/*    */ package android.bluetooth;
/*    */ 
/*    */ public abstract class BluetoothGattCallback
/*    */ {
/*    */   public BluetoothGattCallback()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void onServicesDiscovered(BluetoothGatt gatt, int status) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onDescriptorRead(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onReliableWriteCompleted(BluetoothGatt gatt, int status) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothGattCallback
 * JD-Core Version:    0.6.2
 */