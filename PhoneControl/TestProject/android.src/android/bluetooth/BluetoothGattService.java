/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class BluetoothGattService
/*    */ {
/*    */   public static final int SERVICE_TYPE_PRIMARY = 0;
/*    */   public static final int SERVICE_TYPE_SECONDARY = 1;
/*    */   protected List<BluetoothGattCharacteristic> mCharacteristics;
/*    */   protected List<BluetoothGattService> mIncludedServices;
/*    */ 
/*    */   public BluetoothGattService(UUID uuid, int serviceType)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public boolean addService(BluetoothGattService service) { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean addCharacteristic(BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); } 
/*  7 */   public UUID getUuid() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getInstanceId() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 10 */   public List<BluetoothGattService> getIncludedServices() { throw new RuntimeException("Stub!"); } 
/* 11 */   public List<BluetoothGattCharacteristic> getCharacteristics() { throw new RuntimeException("Stub!"); } 
/* 12 */   public BluetoothGattCharacteristic getCharacteristic(UUID uuid) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothGattService
 * JD-Core Version:    0.6.2
 */