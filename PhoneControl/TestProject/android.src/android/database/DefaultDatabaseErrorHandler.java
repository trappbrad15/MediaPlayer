/*   */ package android.database;
/*   */ 
/*   */ import android.database.sqlite.SQLiteDatabase;
/*   */ 
/*   */ public final class DefaultDatabaseErrorHandler
/*   */   implements DatabaseErrorHandler
/*   */ {
/*   */   public DefaultDatabaseErrorHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void onCorruption(SQLiteDatabase dbObj) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.DefaultDatabaseErrorHandler
 * JD-Core Version:    0.6.2
 */