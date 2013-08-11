/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.io.IOException;
/*    */ import java.util.Set;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class BluetoothAdapter
/*    */ {
/*    */   public static final int ERROR = -2147483648;
/*    */   public static final String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
/*    */   public static final String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";
/*    */   public static final String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";
/*    */   public static final int STATE_OFF = 10;
/*    */   public static final int STATE_TURNING_ON = 11;
/*    */   public static final int STATE_ON = 12;
/*    */   public static final int STATE_TURNING_OFF = 13;
/*    */   public static final String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
/*    */   public static final String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
/*    */   public static final String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
/*    */   public static final String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
/*    */   public static final String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";
/*    */   public static final String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";
/*    */   public static final int SCAN_MODE_NONE = 20;
/*    */   public static final int SCAN_MODE_CONNECTABLE = 21;
/*    */   public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
/*    */   public static final String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
/*    */   public static final String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
/*    */   public static final String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
/*    */   public static final String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
/*    */   public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";
/*    */   public static final String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";
/*    */   public static final String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";
/*    */   public static final int STATE_DISCONNECTED = 0;
/*    */   public static final int STATE_CONNECTING = 1;
/*    */   public static final int STATE_CONNECTED = 2;
/*    */   public static final int STATE_DISCONNECTING = 3;
/*    */ 
/*    */   BluetoothAdapter()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public static synchronized BluetoothAdapter getDefaultAdapter() { throw new RuntimeException("Stub!"); } 
/* 10 */   public BluetoothDevice getRemoteDevice(String address) { throw new RuntimeException("Stub!"); } 
/* 11 */   public BluetoothDevice getRemoteDevice(byte[] address) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getState() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean enable() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean disable() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getAddress() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean setName(String name) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getScanMode() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean startDiscovery() { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean cancelDiscovery() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isDiscovering() { throw new RuntimeException("Stub!"); } 
/* 23 */   public Set<BluetoothDevice> getBondedDevices() { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getProfileConnectionState(int profile) { throw new RuntimeException("Stub!"); } 
/* 25 */   public BluetoothServerSocket listenUsingRfcommWithServiceRecord(String name, UUID uuid) throws IOException { throw new RuntimeException("Stub!"); } 
/* 26 */   public BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(String name, UUID uuid) throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean getProfileProxy(Context context, BluetoothProfile.ServiceListener listener, int profile) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void closeProfileProxy(int profile, BluetoothProfile proxy) { throw new RuntimeException("Stub!"); } 
/* 29 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 30 */   public static boolean checkBluetoothAddress(String address) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean startLeScan(LeScanCallback callback) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean startLeScan(UUID[] serviceUuids, LeScanCallback callback) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void stopLeScan(LeScanCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface LeScanCallback
/*    */   {
/*    */     public abstract void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothAdapter
 * JD-Core Version:    0.6.2
 */