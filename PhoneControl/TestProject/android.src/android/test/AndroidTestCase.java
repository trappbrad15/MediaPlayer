/*    */ package android.test;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import junit.framework.TestCase;
/*    */ 
/*    */ public class AndroidTestCase extends TestCase
/*    */ {
/*    */   protected Context mContext;
/*    */ 
/*    */   public AndroidTestCase()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/*  8 */   public void testAndroidTestCaseSetupProperly() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setContext(Context context) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Context getContext() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void assertActivityRequiresPermission(String packageName, String className, String permission) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void assertReadingContentUriRequiresPermission(Uri uri, String permission) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void assertWritingContentUriRequiresPermission(Uri uri, String permission) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void scrubClass(Class<?> testCaseClass) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.AndroidTestCase
 * JD-Core Version:    0.6.2
 */