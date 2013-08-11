/*    */ package android.database;
/*    */ 
/*    */ public abstract class AbstractWindowedCursor extends AbstractCursor
/*    */ {
/*    */   protected CursorWindow mWindow;
/*    */ 
/*    */   public AbstractWindowedCursor()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getString(int columnIndex) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); } 
/*  9 */   public short getShort(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getInt(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 11 */   public long getLong(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 12 */   public float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 13 */   public double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 16 */   @Deprecated
/*    */   public boolean isBlob(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public boolean isString(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 20 */   @Deprecated
/*    */   public boolean isLong(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 22 */   @Deprecated
/*    */   public boolean isFloat(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getType(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected void checkPosition() { throw new RuntimeException("Stub!"); } 
/* 25 */   public CursorWindow getWindow() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setWindow(CursorWindow window) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean hasWindow() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.AbstractWindowedCursor
 * JD-Core Version:    0.6.2
 */