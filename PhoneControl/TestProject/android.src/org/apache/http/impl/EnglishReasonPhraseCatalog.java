/*   */ package org.apache.http.impl;
/*   */ 
/*   */ import java.util.Locale;
/*   */ import org.apache.http.ReasonPhraseCatalog;
/*   */ 
/*   */ public class EnglishReasonPhraseCatalog
/*   */   implements ReasonPhraseCatalog
/*   */ {
/* 8 */   public static final EnglishReasonPhraseCatalog INSTANCE = null;
/*   */ 
/*   */   protected EnglishReasonPhraseCatalog()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public String getReason(int status, Locale loc) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.EnglishReasonPhraseCatalog
 * JD-Core Version:    0.6.2
 */