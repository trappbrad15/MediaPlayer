/*    */ package android.database;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public final class CursorJoiner
/*    */   implements Iterator<Result>, Iterable<Result>
/*    */ {
/*    */   public CursorJoiner(Cursor cursorLeft, String[] columnNamesLeft, Cursor cursorRight, String[] columnNamesRight)
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public Iterator<Result> iterator() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean hasNext() { throw new RuntimeException("Stub!"); } 
/* 14 */   public Result next() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void remove() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum Result
/*    */   {
/*  7 */     BOTH, 
/*  8 */     LEFT, 
/*  9 */     RIGHT;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.CursorJoiner
 * JD-Core Version:    0.6.2
 */