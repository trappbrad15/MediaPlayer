/*    */ package android.content;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.UserHandle;
/*    */ import android.util.AndroidException;
/*    */ 
/*    */ public class IntentSender
/*    */   implements Parcelable
/*    */ {
/* 32 */   public static final Parcelable.Creator<IntentSender> CREATOR = null;
/*    */ 
/*    */   IntentSender()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public void sendIntent(Context context, int code, Intent intent, OnFinished onFinished, Handler handler) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void sendIntent(Context context, int code, Intent intent, OnFinished onFinished, Handler handler, String requiredPermission) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); } 
/* 20 */   @Deprecated
/*    */   public String getTargetPackage() { throw new RuntimeException("Stub!"); } 
/* 21 */   public String getCreatorPackage() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getCreatorUid() { throw new RuntimeException("Stub!"); } 
/* 23 */   public UserHandle getCreatorUserHandle() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static void writeIntentSenderOrNullToParcel(IntentSender sender, Parcel out) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static IntentSender readIntentSenderOrNullFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnFinished
/*    */   {
/*    */     public abstract void onSendFinished(IntentSender paramIntentSender, Intent paramIntent, int paramInt, String paramString, Bundle paramBundle);
/*    */   }
/*    */ 
/*    */   public static class SendIntentException extends AndroidException
/*    */   {
/*    */     public SendIntentException()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public SendIntentException(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */     public SendIntentException(Exception cause) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.IntentSender
 * JD-Core Version:    0.6.2
 */