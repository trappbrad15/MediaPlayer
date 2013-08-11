/*    */ package android.database.sqlite;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ 
/*    */ public abstract class SQLiteClosable
/*    */   implements Closeable
/*    */ {
/*    */   public SQLiteClosable()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void onAllReferencesReleased();
/*    */ 
/*  8 */   @Deprecated
/*    */   protected void onAllReferencesReleasedFromContainer() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void acquireReference() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void releaseReference() { throw new RuntimeException("Stub!"); } 
/* 12 */   @Deprecated
/*    */   public void releaseReferenceFromContainer() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void close() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteClosable
 * JD-Core Version:    0.6.2
 */