/*   */ package android.test;
/*   */ 
/*   */ import android.app.Activity;
/*   */ 
/*   */ public abstract class SingleLaunchActivityTestCase<T extends Activity> extends InstrumentationTestCase
/*   */ {
/*   */   public SingleLaunchActivityTestCase(String pkg, Class<T> activityClass)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public T getActivity() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/* 8 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 9 */   public void testActivityTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.SingleLaunchActivityTestCase
 * JD-Core Version:    0.6.2
 */