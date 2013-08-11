/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class ActivityInstrumentationTestCase<T extends Activity> extends ActivityTestCase
/*    */ {
/*    */   public ActivityInstrumentationTestCase(String pkg, Class<T> activityClass)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ActivityInstrumentationTestCase(String pkg, Class<T> activityClass, boolean initialTouchMode) { throw new RuntimeException("Stub!"); } 
/*  8 */   public T getActivity() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 11 */   public void testActivityTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.ActivityInstrumentationTestCase
 * JD-Core Version:    0.6.2
 */