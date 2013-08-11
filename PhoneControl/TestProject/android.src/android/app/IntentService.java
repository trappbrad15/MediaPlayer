/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public abstract class IntentService extends Service
/*    */ {
/*    */   public IntentService(String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setIntentRedelivery(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onStart(Intent intent, int startId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int onStartCommand(Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 11 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   protected abstract void onHandleIntent(Intent paramIntent);
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.IntentService
 * JD-Core Version:    0.6.2
 */