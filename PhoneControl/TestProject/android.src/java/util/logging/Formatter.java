/*   */ package java.util.logging;
/*   */ 
/*   */ public abstract class Formatter
/*   */ {
/*   */   protected Formatter()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract String format(LogRecord paramLogRecord);
/*   */ 
/* 6 */   public String formatMessage(LogRecord r) { throw new RuntimeException("Stub!"); } 
/* 7 */   public String getHead(Handler h) { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getTail(Handler h) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.logging.Formatter
 * JD-Core Version:    0.6.2
 */