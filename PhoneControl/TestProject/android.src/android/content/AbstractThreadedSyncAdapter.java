/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public abstract class AbstractThreadedSyncAdapter
/*    */ {
/*    */ 
/*    */   @Deprecated
/*    */   public static final int LOG_SYNC_DETAILS = 2743;
/*    */ 
/*    */   public AbstractThreadedSyncAdapter(Context context, boolean autoInitialize)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public AbstractThreadedSyncAdapter(Context context, boolean autoInitialize, boolean allowParallelSyncs) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Context getContext() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final IBinder getSyncAdapterBinder() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult);
/*    */ 
/*  9 */   public void onSyncCanceled() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onSyncCanceled(Thread thread) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.AbstractThreadedSyncAdapter
 * JD-Core Version:    0.6.2
 */