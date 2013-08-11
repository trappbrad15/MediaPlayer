/*    */ package android.view.accessibility;
/*    */ 
/*    */ import android.accessibilityservice.AccessibilityServiceInfo;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import java.util.List;
/*    */ 
/*    */ public final class AccessibilityManager
/*    */ {
/*    */   AccessibilityManager()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isTouchExplorationEnabled() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void sendAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void interrupt() { throw new RuntimeException("Stub!"); } 
/* 14 */   @Deprecated
/*    */   public List<ServiceInfo> getAccessibilityServiceList() { throw new RuntimeException("Stub!"); } 
/* 15 */   public List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList() { throw new RuntimeException("Stub!"); } 
/* 16 */   public List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int feedbackTypeFlags) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean addAccessibilityStateChangeListener(AccessibilityStateChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean removeAccessibilityStateChangeListener(AccessibilityStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface AccessibilityStateChangeListener
/*    */   {
/*    */     public abstract void onAccessibilityStateChanged(boolean paramBoolean);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.accessibility.AccessibilityManager
 * JD-Core Version:    0.6.2
 */