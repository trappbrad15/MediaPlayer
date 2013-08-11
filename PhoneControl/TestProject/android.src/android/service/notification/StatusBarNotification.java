/*    */ package android.service.notification;
/*    */ 
/*    */ import android.app.Notification;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.UserHandle;
/*    */ 
/*    */ public class StatusBarNotification
/*    */   implements Parcelable
/*    */ {
/* 20 */   public static final Parcelable.Creator<StatusBarNotification> CREATOR = null;
/*    */ 
/*    */   public StatusBarNotification(String pkg, String basePkg, int id, String tag, int uid, int initialPid, int score, Notification notification, UserHandle user, long postTime)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public StatusBarNotification(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public StatusBarNotification clone() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isOngoing() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isClearable() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getUserId() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getPackageName() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getId() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getTag() { throw new RuntimeException("Stub!"); } 
/* 17 */   public Notification getNotification() { throw new RuntimeException("Stub!"); } 
/* 18 */   public long getPostTime() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.service.notification.StatusBarNotification
 * JD-Core Version:    0.6.2
 */