/*    */ package android.renderscript;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public class RenderScript
/*    */ {
/*    */   RenderScript()
/*    */   {
/* 32 */     throw new RuntimeException("Stub!"); } 
/* 33 */   public void setMessageHandler(RSMessageHandler msg) { throw new RuntimeException("Stub!"); } 
/* 34 */   public RSMessageHandler getMessageHandler() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void sendMessage(int id, int[] data) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setErrorHandler(RSErrorHandler msg) { throw new RuntimeException("Stub!"); } 
/* 37 */   public RSErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setPriority(Priority p) { throw new RuntimeException("Stub!"); } 
/* 39 */   public final Context getApplicationContext() { throw new RuntimeException("Stub!"); } 
/* 40 */   public static RenderScript create(Context ctx) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static RenderScript create(Context ctx, ContextType ct) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void contextDump() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void finish() { throw new RuntimeException("Stub!"); } 
/* 44 */   public void destroy() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum Priority
/*    */   {
/* 29 */     LOW, 
/* 30 */     NORMAL;
/*    */   }
/*    */ 
/*    */   public static class RSErrorHandler
/*    */     implements Runnable
/*    */   {
/*    */     protected String mErrorMessage;
/*    */     protected int mErrorNum;
/*    */ 
/*    */     public RSErrorHandler()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!"); } 
/* 23 */     public void run() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static class RSMessageHandler
/*    */     implements Runnable
/*    */   {
/* 15 */     protected int[] mData = null;
/*    */     protected int mID;
/*    */     protected int mLength;
/*    */ 
/*    */     public RSMessageHandler()
/*    */     {
/* 13 */       throw new RuntimeException("Stub!"); } 
/* 14 */     public void run() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static enum ContextType
/*    */   {
/*  6 */     DEBUG, 
/*  7 */     NORMAL, 
/*  8 */     PROFILE;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.renderscript.RenderScript
 * JD-Core Version:    0.6.2
 */