/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.view.Window;
/*    */ 
/*    */ @Deprecated
/*    */ public class LocalActivityManager
/*    */ {
/*    */   public LocalActivityManager(Activity parent, boolean singleMode)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Window startActivity(String id, Intent intent) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Window destroyActivity(String id, boolean finish) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Activity getCurrentActivity() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getCurrentId() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Activity getActivity(String id) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void dispatchCreate(Bundle state) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Bundle saveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void dispatchResume() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void dispatchPause(boolean finishing) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void dispatchStop() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void removeAllActivities() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void dispatchDestroy(boolean finishing) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.LocalActivityManager
 * JD-Core Version:    0.6.2
 */