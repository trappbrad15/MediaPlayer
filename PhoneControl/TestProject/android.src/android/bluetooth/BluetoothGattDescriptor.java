/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class BluetoothGattDescriptor
/*    */ {
/* 10 */   public static final byte[] ENABLE_NOTIFICATION_VALUE = null;
/* 11 */   public static final byte[] ENABLE_INDICATION_VALUE = null;
/* 12 */   public static final byte[] DISABLE_NOTIFICATION_VALUE = null;
/*    */   public static final int PERMISSION_READ = 1;
/*    */   public static final int PERMISSION_READ_ENCRYPTED = 2;
/*    */   public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
/*    */   public static final int PERMISSION_WRITE = 16;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED = 32;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
/*    */   public static final int PERMISSION_WRITE_SIGNED = 128;
/*    */   public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
/*    */ 
/*    */   public BluetoothGattDescriptor(UUID uuid, int permissions)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public BluetoothGattCharacteristic getCharacteristic() { throw new RuntimeException("Stub!"); } 
/*  6 */   public UUID getUuid() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getPermissions() { throw new RuntimeException("Stub!"); } 
/*  8 */   public byte[] getValue() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean setValue(byte[] value) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothGattDescriptor
 * JD-Core Version:    0.6.2
 */