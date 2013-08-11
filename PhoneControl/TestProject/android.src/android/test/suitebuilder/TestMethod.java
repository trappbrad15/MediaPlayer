/*    */ package android.test.suitebuilder;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import junit.framework.TestCase;
/*    */ 
/*    */ public class TestMethod
/*    */ {
/*    */   public TestMethod(Method method, Class<? extends TestCase> enclosingClass)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public TestMethod(String methodName, Class<? extends TestCase> enclosingClass) { throw new RuntimeException("Stub!"); } 
/*  6 */   public TestMethod(TestCase testCase) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getEnclosingClassname() { throw new RuntimeException("Stub!"); } 
/*  9 */   public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); } 
/*    */   public Class<? extends TestCase> getEnclosingClass() {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public TestCase createTest() throws InvocationTargetException, IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.suitebuilder.TestMethod
 * JD-Core Version:    0.6.2
 */