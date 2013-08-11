/*    */ package android.hardware;
/*    */ 
/*    */ public final class Sensor
/*    */ {
/*    */   public static final int TYPE_ACCELEROMETER = 1;
/*    */   public static final int TYPE_MAGNETIC_FIELD = 2;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int TYPE_ORIENTATION = 3;
/*    */   public static final int TYPE_GYROSCOPE = 4;
/*    */   public static final int TYPE_LIGHT = 5;
/*    */   public static final int TYPE_PRESSURE = 6;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int TYPE_TEMPERATURE = 7;
/*    */   public static final int TYPE_PROXIMITY = 8;
/*    */   public static final int TYPE_GRAVITY = 9;
/*    */   public static final int TYPE_LINEAR_ACCELERATION = 10;
/*    */   public static final int TYPE_ROTATION_VECTOR = 11;
/*    */   public static final int TYPE_RELATIVE_HUMIDITY = 12;
/*    */   public static final int TYPE_AMBIENT_TEMPERATURE = 13;
/*    */   public static final int TYPE_MAGNETIC_FIELD_UNCALIBRATED = 14;
/*    */   public static final int TYPE_GAME_ROTATION_VECTOR = 15;
/*    */   public static final int TYPE_GYROSCOPE_UNCALIBRATED = 16;
/*    */   public static final int TYPE_SIGNIFICANT_MOTION = 17;
/*    */   public static final int TYPE_ALL = -1;
/*    */ 
/*    */   Sensor()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  6 */   public String getVendor() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getType() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/*  9 */   public float getMaximumRange() { throw new RuntimeException("Stub!"); } 
/* 10 */   public float getResolution() { throw new RuntimeException("Stub!"); } 
/* 11 */   public float getPower() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getMinDelay() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.Sensor
 * JD-Core Version:    0.6.2
 */