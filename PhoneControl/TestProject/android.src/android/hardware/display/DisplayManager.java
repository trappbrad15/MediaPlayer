/*    */ package android.hardware.display;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.view.Display;
/*    */ 
/*    */ public final class DisplayManager
/*    */ {
/*    */   public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
/*    */ 
/*    */   DisplayManager()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public Display getDisplay(int displayId) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Display[] getDisplays() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Display[] getDisplays(String category) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void registerDisplayListener(DisplayListener listener, Handler handler) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void unregisterDisplayListener(DisplayListener listener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface DisplayListener
/*    */   {
/*    */     public abstract void onDisplayAdded(int paramInt);
/*    */ 
/*    */     public abstract void onDisplayRemoved(int paramInt);
/*    */ 
/*    */     public abstract void onDisplayChanged(int paramInt);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.display.DisplayManager
 * JD-Core Version:    0.6.2
 */