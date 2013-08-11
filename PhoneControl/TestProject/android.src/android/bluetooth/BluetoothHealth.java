/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.util.List;
/*    */ 
/*    */ public final class BluetoothHealth
/*    */   implements BluetoothProfile
/*    */ {
/*    */   public static final int SOURCE_ROLE = 1;
/*    */   public static final int SINK_ROLE = 2;
/*    */   public static final int CHANNEL_TYPE_RELIABLE = 10;
/*    */   public static final int CHANNEL_TYPE_STREAMING = 11;
/*    */   public static final int STATE_CHANNEL_DISCONNECTED = 0;
/*    */   public static final int STATE_CHANNEL_CONNECTING = 1;
/*    */   public static final int STATE_CHANNEL_CONNECTED = 2;
/*    */   public static final int STATE_CHANNEL_DISCONNECTING = 3;
/*    */   public static final int APP_CONFIG_REGISTRATION_SUCCESS = 0;
/*    */   public static final int APP_CONFIG_REGISTRATION_FAILURE = 1;
/*    */   public static final int APP_CONFIG_UNREGISTRATION_SUCCESS = 2;
/*    */   public static final int APP_CONFIG_UNREGISTRATION_FAILURE = 3;
/*    */ 
/*    */   BluetoothHealth()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean registerSinkAppConfiguration(String name, int dataType, BluetoothHealthCallback callback) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean unregisterAppConfiguration(BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean connectChannelToSource(BluetoothDevice device, BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean disconnectChannel(BluetoothDevice device, BluetoothHealthAppConfiguration config, int channelId) { throw new RuntimeException("Stub!"); } 
/* 10 */   public ParcelFileDescriptor getMainChannelFd(BluetoothDevice device, BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); } 
/* 12 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); } 
/* 13 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothHealth
 * JD-Core Version:    0.6.2
 */