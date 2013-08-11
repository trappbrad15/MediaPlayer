/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.Vibrator;
/*    */ import java.util.List;
/*    */ 
/*    */ public final class InputDevice
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int SOURCE_CLASS_MASK = 255;
/*    */   public static final int SOURCE_CLASS_NONE = 0;
/*    */   public static final int SOURCE_CLASS_BUTTON = 1;
/*    */   public static final int SOURCE_CLASS_POINTER = 2;
/*    */   public static final int SOURCE_CLASS_TRACKBALL = 4;
/*    */   public static final int SOURCE_CLASS_POSITION = 8;
/*    */   public static final int SOURCE_CLASS_JOYSTICK = 16;
/*    */   public static final int SOURCE_UNKNOWN = 0;
/*    */   public static final int SOURCE_KEYBOARD = 257;
/*    */   public static final int SOURCE_DPAD = 513;
/*    */   public static final int SOURCE_GAMEPAD = 1025;
/*    */   public static final int SOURCE_TOUCHSCREEN = 4098;
/*    */   public static final int SOURCE_MOUSE = 8194;
/*    */   public static final int SOURCE_STYLUS = 16386;
/*    */   public static final int SOURCE_TRACKBALL = 65540;
/*    */   public static final int SOURCE_TOUCHPAD = 1048584;
/*    */   public static final int SOURCE_TOUCH_NAVIGATION = 2097152;
/*    */   public static final int SOURCE_JOYSTICK = 16777232;
/*    */   public static final int SOURCE_ANY = -256;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_X = 0;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_Y = 1;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_PRESSURE = 2;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_SIZE = 3;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_TOUCH_MINOR = 5;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_TOOL_MAJOR = 6;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_TOOL_MINOR = 7;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MOTION_RANGE_ORIENTATION = 8;
/*    */   public static final int KEYBOARD_TYPE_NONE = 0;
/*    */   public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
/*    */   public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
/* 76 */   public static final Parcelable.Creator<InputDevice> CREATOR = null;
/*    */ 
/*    */   InputDevice()
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public static InputDevice getDevice(int id) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static int[] getDeviceIds() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getId() { throw new RuntimeException("Stub!"); } 
/* 22 */   public String getDescriptor() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isVirtual() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getSources() { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getKeyboardType() { throw new RuntimeException("Stub!"); } 
/* 27 */   public KeyCharacterMap getKeyCharacterMap() { throw new RuntimeException("Stub!"); } 
/* 28 */   public MotionRange getMotionRange(int axis) { throw new RuntimeException("Stub!"); } 
/* 29 */   public MotionRange getMotionRange(int axis, int source) { throw new RuntimeException("Stub!"); } 
/* 30 */   public List<MotionRange> getMotionRanges() { throw new RuntimeException("Stub!"); } 
/* 31 */   public Vibrator getVibrator() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 34 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class MotionRange
/*    */   {
/*    */     MotionRange()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public int getAxis() { throw new RuntimeException("Stub!"); } 
/*  9 */     public int getSource() { throw new RuntimeException("Stub!"); } 
/* 10 */     public boolean isFromSource(int source) { throw new RuntimeException("Stub!"); } 
/* 11 */     public float getMin() { throw new RuntimeException("Stub!"); } 
/* 12 */     public float getMax() { throw new RuntimeException("Stub!"); } 
/* 13 */     public float getRange() { throw new RuntimeException("Stub!"); } 
/* 14 */     public float getFlat() { throw new RuntimeException("Stub!"); } 
/* 15 */     public float getFuzz() { throw new RuntimeException("Stub!"); } 
/* 16 */     public float getResolution() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.InputDevice
 * JD-Core Version:    0.6.2
 */