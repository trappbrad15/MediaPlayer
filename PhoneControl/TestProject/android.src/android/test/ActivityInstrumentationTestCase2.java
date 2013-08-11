/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.content.Intent;
/*    */ 
/*    */ public abstract class ActivityInstrumentationTestCase2<T extends Activity> extends ActivityTestCase
/*    */ {
/*    */   @Deprecated
/*    */   public ActivityInstrumentationTestCase2(String pkg, Class<T> activityClass)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ActivityInstrumentationTestCase2(Class<T> activityClass) { throw new RuntimeException("Stub!"); } 
/*  8 */   public T getActivity() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setActivityIntent(Intent i) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setActivityInitialTouchMode(boolean initialTouchMode) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void runTest() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.ActivityInstrumentationTestCase2
 * JD-Core Version:    0.6.2
 */