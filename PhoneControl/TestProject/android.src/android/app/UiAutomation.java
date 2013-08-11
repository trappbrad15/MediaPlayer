/*    */ package android.app;
/*    */ 
/*    */ import android.accessibilityservice.AccessibilityServiceInfo;
/*    */ import android.graphics.Bitmap;
/*    */ import android.view.InputEvent;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ import java.util.concurrent.TimeoutException;
/*    */ 
/*    */ public final class UiAutomation
/*    */ {
/*    */   public static final int ROTATION_UNFREEZE = -2;
/*    */   public static final int ROTATION_FREEZE_CURRENT = -1;
/*    */   public static final int ROTATION_FREEZE_0 = 0;
/*    */   public static final int ROTATION_FREEZE_90 = 1;
/*    */   public static final int ROTATION_FREEZE_180 = 2;
/*    */   public static final int ROTATION_FREEZE_270 = 3;
/*    */ 
/*    */   UiAutomation()
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public void setOnAccessibilityEventListener(OnAccessibilityEventListener listener) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final boolean performGlobalAction(int action) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final AccessibilityServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final void setServiceInfo(AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); } 
/* 17 */   public AccessibilityNodeInfo getRootInActiveWindow() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean injectInputEvent(InputEvent event, boolean sync) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean setRotation(int rotation) { throw new RuntimeException("Stub!"); } 
/* 20 */   public AccessibilityEvent executeAndWaitForEvent(Runnable command, AccessibilityEventFilter filter, long timeoutMillis) throws TimeoutException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void waitForIdle(long idleTimeoutMillis, long globalTimeoutMillis) throws TimeoutException { throw new RuntimeException("Stub!"); } 
/* 22 */   public Bitmap takeScreenshot() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setRunAsMonkey(boolean enable) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface AccessibilityEventFilter
/*    */   {
/*    */     public abstract boolean accept(AccessibilityEvent paramAccessibilityEvent);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnAccessibilityEventListener
/*    */   {
/*    */     public abstract void onAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.UiAutomation
 * JD-Core Version:    0.6.2
 */