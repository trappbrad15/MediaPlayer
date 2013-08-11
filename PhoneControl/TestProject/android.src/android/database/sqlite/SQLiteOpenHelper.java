/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.DatabaseErrorHandler;
/*    */ 
/*    */ public abstract class SQLiteOpenHelper
/*    */ {
/*    */   public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); } 
/*  6 */   public String getDatabaseName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setWriteAheadLoggingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SQLiteDatabase getWritableDatabase() { throw new RuntimeException("Stub!"); } 
/*  9 */   public SQLiteDatabase getReadableDatabase() { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized void close() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onConfigure(SQLiteDatabase db) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void onCreate(SQLiteDatabase paramSQLiteDatabase);
/*    */ 
/*    */   public abstract void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);
/*    */ 
/* 14 */   public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void onOpen(SQLiteDatabase db) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteOpenHelper
 * JD-Core Version:    0.6.2
 */