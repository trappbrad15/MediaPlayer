/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ 
/*   */ public abstract class CookieHandler
/*   */ {
/*   */   public CookieHandler()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static CookieHandler getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public static void setDefault(CookieHandler cHandler) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract Map<String, List<String>> get(URI paramURI, Map<String, List<String>> paramMap)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract void put(URI paramURI, Map<String, List<String>> paramMap)
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.CookieHandler
 * JD-Core Version:    0.6.2
 */