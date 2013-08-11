/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.Instrumentation;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import junit.framework.TestCase;
/*    */ 
/*    */ public class InstrumentationTestCase extends TestCase
/*    */ {
/*    */   public InstrumentationTestCase()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void injectInstrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/*  8 */   @Deprecated
/*    */   public void injectInsrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Instrumentation getInstrumentation() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final <T extends Activity> T launchActivity(String pkg, Class<T> activityCls, Bundle extras) { throw new RuntimeException("Stub!"); } 
/*    */   public final <T extends Activity> T launchActivityWithIntent(String pkg, Class<T> activityCls, Intent intent) {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public void runTestOnUiThread(Runnable r) throws Throwable { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void runTest() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 15 */   public void sendKeys(String keysSequence) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void sendKeys(int[] keys) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void sendRepeatedKeys(int[] keys) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.InstrumentationTestCase
 * JD-Core Version:    0.6.2
 */