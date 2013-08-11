/*    */ package android.bluetooth;
/*    */ 
/*    */ public abstract class BluetoothGattServerCallback
/*    */ {
/*    */   public BluetoothGattServerCallback()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void onConnectionStateChange(BluetoothDevice device, int status, int newState) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void onServiceAdded(int status, BluetoothGattService service) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onCharacteristicReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onCharacteristicWriteRequest(BluetoothDevice device, int requestId, BluetoothGattCharacteristic characteristic, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onDescriptorReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onDescriptorWriteRequest(BluetoothDevice device, int requestId, BluetoothGattDescriptor descriptor, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onExecuteWrite(BluetoothDevice device, int requestId, boolean execute) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothGattServerCallback
 * JD-Core Version:    0.6.2
 */