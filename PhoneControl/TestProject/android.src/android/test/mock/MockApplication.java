/*   */ package android.test.mock;
/*   */ 
/*   */ import android.app.Application;
/*   */ import android.content.res.Configuration;
/*   */ 
/*   */ public class MockApplication extends Application
/*   */ {
/*   */   public MockApplication()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void onTerminate() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.mock.MockApplication
 * JD-Core Version:    0.6.2
 */