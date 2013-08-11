/*   */ package java.util.logging;
/*   */ 
/*   */ public class ErrorManager
/*   */ {
/*   */   public static final int GENERIC_FAILURE = 0;
/*   */   public static final int WRITE_FAILURE = 1;
/*   */   public static final int FLUSH_FAILURE = 2;
/*   */   public static final int CLOSE_FAILURE = 3;
/*   */   public static final int OPEN_FAILURE = 4;
/*   */   public static final int FORMAT_FAILURE = 5;
/*   */ 
/*   */   public ErrorManager()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void error(String message, Exception exception, int errorCode) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.logging.ErrorManager
 * JD-Core Version:    0.6.2
 */