/*    */ package android.database;
/*    */ 
/*    */ import android.database.sqlite.SQLiteClosable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class CursorWindow extends SQLiteClosable
/*    */   implements Parcelable
/*    */ {
/* 47 */   public static final Parcelable.Creator<CursorWindow> CREATOR = null;
/*    */ 
/*    */   public CursorWindow(String name)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  8 */   @Deprecated
/*    */   public CursorWindow(boolean localWindow) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 10 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getStartPosition() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setStartPosition(int pos) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getNumRows() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean setNumColumns(int columnNum) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean allocRow() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void freeLastRow() { throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public boolean isNull(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 20 */   @Deprecated
/*    */   public boolean isBlob(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 22 */   @Deprecated
/*    */   public boolean isLong(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 24 */   @Deprecated
/*    */   public boolean isFloat(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 26 */   @Deprecated
/*    */   public boolean isString(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 27 */   public int getType(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 28 */   public byte[] getBlob(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 29 */   public String getString(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void copyStringToBuffer(int row, int column, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); } 
/* 31 */   public long getLong(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 32 */   public double getDouble(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 33 */   public short getShort(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 34 */   public int getInt(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 35 */   public float getFloat(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean putBlob(byte[] value, int row, int column) { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean putString(String value, int row, int column) { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean putLong(long value, int row, int column) { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean putDouble(double value, int row, int column) { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean putNull(int row, int column) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static CursorWindow newFromParcel(Parcel p) { throw new RuntimeException("Stub!"); } 
/* 42 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 44 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!"); } 
/* 45 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.CursorWindow
 * JD-Core Version:    0.6.2
 */