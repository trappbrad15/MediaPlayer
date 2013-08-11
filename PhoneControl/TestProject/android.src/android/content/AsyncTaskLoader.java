/*    */ package android.content;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class AsyncTaskLoader<D> extends Loader<D>
/*    */ {
/*    */   public AsyncTaskLoader(Context context)
/*    */   {
/*  5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public void setUpdateThrottle(long delayMS) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void onForceLoad() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected boolean onCancelLoad() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onCanceled(D data) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract D loadInBackground();
/*    */ 
/* 11 */   protected D onLoadInBackground() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void cancelLoadInBackground() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isLoadInBackgroundCanceled() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.AsyncTaskLoader
 * JD-Core Version:    0.6.2
 */