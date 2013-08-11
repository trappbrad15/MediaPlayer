/*   */ package java.net;
/*   */ 
/*   */ public abstract interface CookiePolicy
/*   */ {
/* 5 */   public static final CookiePolicy ACCEPT_ALL = null;
/* 6 */   public static final CookiePolicy ACCEPT_NONE = null;
/* 7 */   public static final CookiePolicy ACCEPT_ORIGINAL_SERVER = null;
/*   */ 
/*   */   public abstract boolean shouldAccept(URI paramURI, HttpCookie paramHttpCookie);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.CookiePolicy
 * JD-Core Version:    0.6.2
 */