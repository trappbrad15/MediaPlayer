/*    */ package android.webkit;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Handler;
/*    */ 
/*    */ abstract class WebSyncManager
/*    */   implements Runnable
/*    */ {
/*    */   protected Handler mHandler;
/*    */   protected WebViewDatabase mDataBase;
/*    */   protected static final String LOGTAG = "websync";
/*    */ 
/*    */   protected WebSyncManager(Context context, String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void run() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void sync() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void resetSync() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void startSync() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void stopSync() { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void onSyncInit() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.webkit.WebSyncManager
 * JD-Core Version:    0.6.2
 */