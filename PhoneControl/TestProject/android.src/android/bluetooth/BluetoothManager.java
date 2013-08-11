/*   */ package android.bluetooth;
/*   */ 
/*   */ import android.content.Context;
/*   */ import java.util.List;
/*   */ 
/*   */ public final class BluetoothManager
/*   */ {
/*   */   BluetoothManager()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public BluetoothAdapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 6 */   public int getConnectionState(BluetoothDevice device, int profile) { throw new RuntimeException("Stub!"); } 
/* 7 */   public List<BluetoothDevice> getConnectedDevices(int profile) { throw new RuntimeException("Stub!"); } 
/* 8 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int profile, int[] states) { throw new RuntimeException("Stub!"); } 
/* 9 */   public BluetoothGattServer openGattServer(Context context, BluetoothGattServerCallback callback) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothManager
 * JD-Core Version:    0.6.2
 */