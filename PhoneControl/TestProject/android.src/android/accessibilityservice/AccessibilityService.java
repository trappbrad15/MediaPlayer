/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public abstract class AccessibilityService extends Service
/*    */ {
/*    */   public static final int GESTURE_SWIPE_UP = 1;
/*    */   public static final int GESTURE_SWIPE_DOWN = 2;
/*    */   public static final int GESTURE_SWIPE_LEFT = 3;
/*    */   public static final int GESTURE_SWIPE_RIGHT = 4;
/*    */   public static final int GESTURE_SWIPE_LEFT_AND_RIGHT = 5;
/*    */   public static final int GESTURE_SWIPE_RIGHT_AND_LEFT = 6;
/*    */   public static final int GESTURE_SWIPE_UP_AND_DOWN = 7;
/*    */   public static final int GESTURE_SWIPE_DOWN_AND_UP = 8;
/*    */   public static final int GESTURE_SWIPE_LEFT_AND_UP = 9;
/*    */   public static final int GESTURE_SWIPE_LEFT_AND_DOWN = 10;
/*    */   public static final int GESTURE_SWIPE_RIGHT_AND_UP = 11;
/*    */   public static final int GESTURE_SWIPE_RIGHT_AND_DOWN = 12;
/*    */   public static final int GESTURE_SWIPE_UP_AND_LEFT = 13;
/*    */   public static final int GESTURE_SWIPE_UP_AND_RIGHT = 14;
/*    */   public static final int GESTURE_SWIPE_DOWN_AND_LEFT = 15;
/*    */   public static final int GESTURE_SWIPE_DOWN_AND_RIGHT = 16;
/*    */   public static final String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";
/*    */   public static final String SERVICE_META_DATA = "android.accessibilityservice";
/*    */   public static final int GLOBAL_ACTION_BACK = 1;
/*    */   public static final int GLOBAL_ACTION_HOME = 2;
/*    */   public static final int GLOBAL_ACTION_RECENTS = 3;
/*    */   public static final int GLOBAL_ACTION_NOTIFICATIONS = 4;
/*    */   public static final int GLOBAL_ACTION_QUICK_SETTINGS = 5;
/*    */ 
/*    */   public AccessibilityService()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void onAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
/*    */ 
/*    */   public abstract void onInterrupt();
/*    */ 
/*  8 */   protected void onServiceConnected() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected boolean onGesture(int gestureId) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected boolean onKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 11 */   public AccessibilityNodeInfo getRootInActiveWindow() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final boolean performGlobalAction(int action) { throw new RuntimeException("Stub!"); } 
/* 13 */   public final AccessibilityServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final void setServiceInfo(AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.accessibilityservice.AccessibilityService
 * JD-Core Version:    0.6.2
 */