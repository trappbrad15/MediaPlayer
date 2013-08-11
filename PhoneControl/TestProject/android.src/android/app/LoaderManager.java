/*    */ package android.app;
/*    */ 
/*    */ import android.content.Loader;
/*    */ import android.os.Bundle;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class LoaderManager
/*    */ {
/*    */   public LoaderManager()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract <D> Loader<D> initLoader(int paramInt, Bundle paramBundle, LoaderCallbacks<D> paramLoaderCallbacks);
/*    */ 
/*    */   public abstract <D> Loader<D> restartLoader(int paramInt, Bundle paramBundle, LoaderCallbacks<D> paramLoaderCallbacks);
/*    */ 
/*    */   public abstract void destroyLoader(int paramInt);
/*    */ 
/*    */   public abstract <D> Loader<D> getLoader(int paramInt);
/*    */ 
/*    */   public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
/*    */ 
/* 16 */   public static void enableDebugLogging(boolean enabled) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface LoaderCallbacks<D>
/*    */   {
/*    */     public abstract Loader<D> onCreateLoader(int paramInt, Bundle paramBundle);
/*    */ 
/*    */     public abstract void onLoadFinished(Loader<D> paramLoader, D paramD);
/*    */ 
/*    */     public abstract void onLoaderReset(Loader<D> paramLoader);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.LoaderManager
 * JD-Core Version:    0.6.2
 */