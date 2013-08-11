/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ 
/*   */ public abstract class ResponseCache
/*   */ {
/*   */   public ResponseCache()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static ResponseCache getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public static void setDefault(ResponseCache responseCache) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract CacheResponse get(URI paramURI, String paramString, Map<String, List<String>> paramMap)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract CacheRequest put(URI paramURI, URLConnection paramURLConnection)
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.ResponseCache
 * JD-Core Version:    0.6.2
 */