/*   */ package android.bluetooth;
/*   */ 
/*   */ import android.os.ParcelFileDescriptor;
/*   */ 
/*   */ public abstract class BluetoothHealthCallback
/*   */ {
/*   */   public BluetoothHealthCallback()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void onHealthAppConfigurationStatusChange(BluetoothHealthAppConfiguration config, int status) { throw new RuntimeException("Stub!"); } 
/* 6 */   public void onHealthChannelStateChange(BluetoothHealthAppConfiguration config, BluetoothDevice device, int prevState, int newState, ParcelFileDescriptor fd, int channelId) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothHealthCallback
 * JD-Core Version:    0.6.2
 */