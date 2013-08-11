/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentCallbacks;
/*    */ import android.content.ComponentCallbacks2;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Bundle;
/*    */ 
/*    */ public class Application extends ContextWrapper
/*    */   implements ComponentCallbacks2
/*    */ {
/*    */   public Application()
/*    */   {
/* 20 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/* 21 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onTerminate() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void registerComponentCallbacks(ComponentCallbacks callback) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void unregisterComponentCallbacks(ComponentCallbacks callback) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnProvideAssistDataListener
/*    */   {
/*    */     public abstract void onProvideAssistData(Activity paramActivity, Bundle paramBundle);
/*    */   }
/*    */ 
/*    */   public static abstract interface ActivityLifecycleCallbacks
/*    */   {
/*    */     public abstract void onActivityCreated(Activity paramActivity, Bundle paramBundle);
/*    */ 
/*    */     public abstract void onActivityStarted(Activity paramActivity);
/*    */ 
/*    */     public abstract void onActivityResumed(Activity paramActivity);
/*    */ 
/*    */     public abstract void onActivityPaused(Activity paramActivity);
/*    */ 
/*    */     public abstract void onActivityStopped(Activity paramActivity);
/*    */ 
/*    */     public abstract void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle);
/*    */ 
/*    */     public abstract void onActivityDestroyed(Activity paramActivity);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.Application
 * JD-Core Version:    0.6.2
 */