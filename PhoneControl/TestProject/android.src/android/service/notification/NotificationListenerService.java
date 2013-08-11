/*    */ package android.service.notification;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public abstract class NotificationListenerService extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.notification.NotificationListenerService";
/*    */ 
/*    */   public NotificationListenerService()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void onNotificationPosted(StatusBarNotification paramStatusBarNotification);
/*    */ 
/*    */   public abstract void onNotificationRemoved(StatusBarNotification paramStatusBarNotification);
/*    */ 
/*  8 */   public final void cancelNotification(String pkg, String tag, int id) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void cancelAllNotifications() { throw new RuntimeException("Stub!"); } 
/* 10 */   public StatusBarNotification[] getActiveNotifications() { throw new RuntimeException("Stub!"); } 
/* 11 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.service.notification.NotificationListenerService
 * JD-Core Version:    0.6.2
 */