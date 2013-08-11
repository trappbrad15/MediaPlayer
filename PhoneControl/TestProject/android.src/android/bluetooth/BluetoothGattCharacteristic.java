/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class BluetoothGattCharacteristic
/*    */ {
/*    */   public static final int PROPERTY_BROADCAST = 1;
/*    */   public static final int PROPERTY_READ = 2;
/*    */   public static final int PROPERTY_WRITE_NO_RESPONSE = 4;
/*    */   public static final int PROPERTY_WRITE = 8;
/*    */   public static final int PROPERTY_NOTIFY = 16;
/*    */   public static final int PROPERTY_INDICATE = 32;
/*    */   public static final int PROPERTY_SIGNED_WRITE = 64;
/*    */   public static final int PROPERTY_EXTENDED_PROPS = 128;
/*    */   public static final int PERMISSION_READ = 1;
/*    */   public static final int PERMISSION_READ_ENCRYPTED = 2;
/*    */   public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
/*    */   public static final int PERMISSION_WRITE = 16;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED = 32;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
/*    */   public static final int PERMISSION_WRITE_SIGNED = 128;
/*    */   public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
/*    */   public static final int WRITE_TYPE_DEFAULT = 2;
/*    */   public static final int WRITE_TYPE_NO_RESPONSE = 1;
/*    */   public static final int WRITE_TYPE_SIGNED = 4;
/*    */   public static final int FORMAT_UINT8 = 17;
/*    */   public static final int FORMAT_UINT16 = 18;
/*    */   public static final int FORMAT_UINT32 = 20;
/*    */   public static final int FORMAT_SINT8 = 33;
/*    */   public static final int FORMAT_SINT16 = 34;
/*    */   public static final int FORMAT_SINT32 = 36;
/*    */   public static final int FORMAT_SFLOAT = 50;
/*    */   public static final int FORMAT_FLOAT = 52;
/*    */   protected List<BluetoothGattDescriptor> mDescriptors;
/*    */ 
/*    */   public BluetoothGattCharacteristic(UUID uuid, int properties, int permissions)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public boolean addDescriptor(BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); } 
/*  6 */   public BluetoothGattService getService() { throw new RuntimeException("Stub!"); } 
/*  7 */   public UUID getUuid() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getInstanceId() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getProperties() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getPermissions() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getWriteType() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setWriteType(int writeType) { throw new RuntimeException("Stub!"); } 
/* 13 */   public List<BluetoothGattDescriptor> getDescriptors() { throw new RuntimeException("Stub!"); } 
/* 14 */   public BluetoothGattDescriptor getDescriptor(UUID uuid) { throw new RuntimeException("Stub!"); } 
/* 15 */   public byte[] getValue() { throw new RuntimeException("Stub!"); } 
/* 16 */   public Integer getIntValue(int formatType, int offset) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Float getFloatValue(int formatType, int offset) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getStringValue(int offset) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean setValue(byte[] value) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean setValue(int value, int formatType, int offset) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean setValue(int mantissa, int exponent, int formatType, int offset) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean setValue(String value) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothGattCharacteristic
 * JD-Core Version:    0.6.2
 */