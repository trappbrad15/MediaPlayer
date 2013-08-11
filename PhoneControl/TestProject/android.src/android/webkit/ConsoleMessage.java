/*    */ package android.webkit;
/*    */ 
/*    */ public class ConsoleMessage
/*    */ {
/*    */   public ConsoleMessage(String message, String sourceId, int lineNumber, MessageLevel msgLevel)
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public MessageLevel messageLevel() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String message() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String sourceId() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int lineNumber() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum MessageLevel
/*    */   {
/*  6 */     DEBUG, 
/*  7 */     ERROR, 
/*  8 */     LOG, 
/*  9 */     TIP, 
/* 10 */     WARNING;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.webkit.ConsoleMessage
 * JD-Core Version:    0.6.2
 */