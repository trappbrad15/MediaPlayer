/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.database.AbstractWindowedCursor;
/*    */ import android.database.CursorWindow;
/*    */ 
/*    */ public class SQLiteCursor extends AbstractWindowedCursor
/*    */ {
/*    */   @Deprecated
/*    */   public SQLiteCursor(SQLiteDatabase db, SQLiteCursorDriver driver, String editTable, SQLiteQuery query)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public SQLiteCursor(SQLiteCursorDriver driver, String editTable, SQLiteQuery query) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SQLiteDatabase getDatabase() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean onMove(int oldPosition, int newPosition) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getColumnIndex(String columnName) { throw new RuntimeException("Stub!"); } 
/* 12 */   public String[] getColumnNames() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void deactivate() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean requery() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setWindow(CursorWindow window) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setSelectionArguments(String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteCursor
 * JD-Core Version:    0.6.2
 */