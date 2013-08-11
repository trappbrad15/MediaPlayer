/*    */ package android.hardware.input;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.view.InputDevice;
/*    */ 
/*    */ public final class InputManager
/*    */ {
/*    */   public static final String ACTION_QUERY_KEYBOARD_LAYOUTS = "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS";
/*    */   public static final String META_DATA_KEYBOARD_LAYOUTS = "android.hardware.input.metadata.KEYBOARD_LAYOUTS";
/*    */ 
/*    */   InputManager()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public InputDevice getInputDevice(int id) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int[] getInputDeviceIds() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void registerInputDeviceListener(InputDeviceListener listener, Handler handler) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void unregisterInputDeviceListener(InputDeviceListener listener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface InputDeviceListener
/*    */   {
/*    */     public abstract void onInputDeviceAdded(int paramInt);
/*    */ 
/*    */     public abstract void onInputDeviceRemoved(int paramInt);
/*    */ 
/*    */     public abstract void onInputDeviceChanged(int paramInt);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.input.InputManager
 * JD-Core Version:    0.6.2
 */