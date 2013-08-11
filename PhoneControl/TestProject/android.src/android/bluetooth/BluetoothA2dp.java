/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public final class BluetoothA2dp
/*    */   implements BluetoothProfile
/*    */ {
/*    */   public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
/*    */   public static final String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
/*    */   public static final int STATE_PLAYING = 10;
/*    */   public static final int STATE_NOT_PLAYING = 11;
/*    */ 
/*    */   BluetoothA2dp()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void finalize() { throw new RuntimeException("Stub!"); } 
/*  7 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); } 
/*  8 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isA2dpPlaying(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothA2dp
 * JD-Core Version:    0.6.2
 */