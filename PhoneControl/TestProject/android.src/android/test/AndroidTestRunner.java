/*    */ package android.test;
/*    */ 
/*    */ import android.app.Instrumentation;
/*    */ import android.content.Context;
/*    */ import java.util.List;
/*    */ import junit.framework.Test;
/*    */ import junit.framework.TestCase;
/*    */ import junit.framework.TestListener;
/*    */ import junit.framework.TestResult;
/*    */ import junit.runner.BaseTestRunner;
/*    */ 
/*    */ public class AndroidTestRunner extends BaseTestRunner
/*    */ {
/*    */   public AndroidTestRunner()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!");
/*    */   }
/*  7 */   public void setTestClassName(String testClassName, String testMethodName) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setTest(Test test) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void clearTestListeners() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void addTestListener(TestListener testListener) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected TestResult createTestResult() { throw new RuntimeException("Stub!"); } 
/* 12 */   public List<TestCase> getTestCases() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getTestClassName() { throw new RuntimeException("Stub!"); } 
/* 14 */   public TestResult getTestResult() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void runTest() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void runTest(TestResult testResult) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setContext(Context context) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setInstrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/* 20 */   @Deprecated
/*    */   public void setInstrumentaiton(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected Class loadSuiteClass(String suiteClassName) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void testStarted(String testName) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void testEnded(String testName) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void testFailed(int status, Test test, Throwable t) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void runFailed(String message) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.AndroidTestRunner
 * JD-Core Version:    0.6.2
 */