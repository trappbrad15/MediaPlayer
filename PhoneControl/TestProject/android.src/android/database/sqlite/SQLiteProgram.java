/*    */ package android.database.sqlite;
/*    */ 
/*    */ public abstract class SQLiteProgram extends SQLiteClosable
/*    */ {
/*    */   SQLiteProgram()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  7 */   @Deprecated
/*    */   public final int getUniqueId() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void bindNull(int index) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void bindLong(int index, long value) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void bindDouble(int index, double value) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void bindString(int index, String value) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void bindBlob(int index, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void clearBindings() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void bindAllArgsAsStrings(String[] bindArgs) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteProgram
 * JD-Core Version:    0.6.2
 */