/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ 
/*    */ public class TaskStackBuilder
/*    */ {
/*    */   TaskStackBuilder()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static TaskStackBuilder create(Context context) { throw new RuntimeException("Stub!"); } 
/*  6 */   public TaskStackBuilder addNextIntent(Intent nextIntent) { throw new RuntimeException("Stub!"); } 
/*  7 */   public TaskStackBuilder addNextIntentWithParentStack(Intent nextIntent) { throw new RuntimeException("Stub!"); } 
/*  8 */   public TaskStackBuilder addParentStack(Activity sourceActivity) { throw new RuntimeException("Stub!"); } 
/*  9 */   public TaskStackBuilder addParentStack(Class<?> sourceActivityClass) { throw new RuntimeException("Stub!"); } 
/* 10 */   public TaskStackBuilder addParentStack(ComponentName sourceActivityName) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getIntentCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Intent editIntentAt(int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void startActivities() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void startActivities(Bundle options) { throw new RuntimeException("Stub!"); } 
/* 15 */   public PendingIntent getPendingIntent(int requestCode, int flags) { throw new RuntimeException("Stub!"); } 
/* 16 */   public PendingIntent getPendingIntent(int requestCode, int flags, Bundle options) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Intent[] getIntents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.TaskStackBuilder
 * JD-Core Version:    0.6.2
 */