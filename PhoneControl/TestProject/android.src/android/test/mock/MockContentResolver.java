/*   */ package android.test.mock;
/*   */ 
/*   */ import android.content.ContentProvider;
/*   */ import android.content.ContentResolver;
/*   */ import android.content.Context;
/*   */ import android.database.ContentObserver;
/*   */ import android.net.Uri;
/*   */ 
/*   */ public class MockContentResolver extends ContentResolver
/*   */ {
/*   */   public MockContentResolver()
/*   */   {
/* 5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public MockContentResolver(Context context) { super((Context)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public void addProvider(String name, ContentProvider provider) { throw new RuntimeException("Stub!"); } 
/* 8 */   public void notifyChange(Uri uri, ContentObserver observer, boolean syncToNetwork) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.mock.MockContentResolver
 * JD-Core Version:    0.6.2
 */