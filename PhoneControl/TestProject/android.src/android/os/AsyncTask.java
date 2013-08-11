/*    */ package android.os;
/*    */ 
/*    */ import java.util.concurrent.ExecutionException;
/*    */ import java.util.concurrent.Executor;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import java.util.concurrent.TimeoutException;
/*    */ 
/*    */ public abstract class AsyncTask<Params, Progress, Result>
/*    */ {
/* 31 */   public static final Executor THREAD_POOL_EXECUTOR = null; public static final Executor SERIAL_EXECUTOR = null;
/*    */ 
/*    */   public AsyncTask()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public final Status getStatus() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract Result doInBackground(Params[] paramArrayOfParams);
/*    */ 
/* 13 */   protected void onPreExecute() { throw new RuntimeException("Stub!"); } 
/*    */   protected void onPostExecute(Result result) {
/* 15 */     throw new RuntimeException("Stub!");
/*    */   }
/* 17 */   protected void onProgressUpdate(Progress[] values) { throw new RuntimeException("Stub!"); } 
/*    */   protected void onCancelled(Result result) {
/* 19 */     throw new RuntimeException("Stub!"); } 
/* 20 */   protected void onCancelled() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final boolean isCancelled() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); } 
/* 23 */   public final Result get() throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); } 
/* 24 */   public final Result get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); } 
/* 25 */   public final AsyncTask<Params, Progress, Result> execute(Params[] params) { throw new RuntimeException("Stub!"); } 
/* 26 */   public final AsyncTask<Params, Progress, Result> executeOnExecutor(Executor exec, Params[] params) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static void execute(Runnable runnable) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected final void publishProgress(Progress[] values) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum Status
/*    */   {
/*  6 */     FINISHED, 
/*  7 */     PENDING, 
/*  8 */     RUNNING;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.AsyncTask
 * JD-Core Version:    0.6.2
 */