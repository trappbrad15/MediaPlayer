/*    */ package junit.framework;
/*    */ 
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public class TestSuite
/*    */   implements Test
/*    */ {
/*    */   public TestSuite()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public TestSuite(Class<?> theClass) { throw new RuntimeException("Stub!"); } 
/*  7 */   public TestSuite(Class<? extends TestCase> theClass, String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public TestSuite(String name) { throw new RuntimeException("Stub!"); } 
/*  9 */   public TestSuite(Class<?>[] classes) { throw new RuntimeException("Stub!"); } 
/* 10 */   public TestSuite(Class<? extends TestCase>[] classes, String name) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static Test createTest(Class<?> theClass, String name) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Constructor<?> getTestConstructor(Class<?> theClass) throws NoSuchMethodException { throw new RuntimeException("Stub!"); } 
/* 13 */   public static Test warning(String message) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void addTest(Test test) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void addTestSuite(Class<? extends TestCase> testClass) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int countTestCases() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void run(TestResult result) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void runTest(Test test, TestResult result) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setName(String name) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Test testAt(int index) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int testCount() { throw new RuntimeException("Stub!"); } 
/* 23 */   public Enumeration<Test> tests() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     junit.framework.TestSuite
 * JD-Core Version:    0.6.2
 */