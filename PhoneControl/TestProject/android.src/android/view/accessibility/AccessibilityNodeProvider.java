/*   */ package android.view.accessibility;
/*   */ 
/*   */ import android.os.Bundle;
/*   */ import java.util.List;
/*   */ 
/*   */ public abstract class AccessibilityNodeProvider
/*   */ {
/*   */   public AccessibilityNodeProvider()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) { throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean performAction(int virtualViewId, int action, Bundle arguments) { throw new RuntimeException("Stub!"); } 
/* 7 */   public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text, int virtualViewId) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.accessibility.AccessibilityNodeProvider
 * JD-Core Version:    0.6.2
 */