/*    */ package java.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class ResourceBundle
/*    */ {
/*    */   protected ResourceBundle parent;
/*    */ 
/*    */   public ResourceBundle()
/*    */   {
/* 24 */     throw new RuntimeException("Stub!"); } 
/* 25 */   public static ResourceBundle getBundle(String bundleName) throws MissingResourceException { throw new RuntimeException("Stub!"); } 
/* 26 */   public static ResourceBundle getBundle(String bundleName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static ResourceBundle getBundle(String bundleName, Locale locale, ClassLoader loader) throws MissingResourceException { throw new RuntimeException("Stub!"); } 
/* 28 */   public static ResourceBundle getBundle(String baseName, Control control) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static ResourceBundle getBundle(String baseName, Locale targetLocale, Control control) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static ResourceBundle getBundle(String baseName, Locale targetLocale, ClassLoader loader, Control control) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Enumeration<String> getKeys();
/*    */ 
/* 32 */   public Locale getLocale() { throw new RuntimeException("Stub!"); } 
/* 33 */   public final Object getObject(String key) { throw new RuntimeException("Stub!"); } 
/* 34 */   public final String getString(String key) { throw new RuntimeException("Stub!"); } 
/* 35 */   public final String[] getStringArray(String key) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract Object handleGetObject(String paramString);
/*    */ 
/* 37 */   protected void setParent(ResourceBundle bundle) { throw new RuntimeException("Stub!"); } 
/* 38 */   public static void clearCache() { throw new RuntimeException("Stub!"); } 
/* 39 */   public static void clearCache(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean containsKey(String key) { throw new RuntimeException("Stub!"); } 
/* 41 */   public Set<String> keySet() { throw new RuntimeException("Stub!"); } 
/* 42 */   protected Set<String> handleKeySet() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class Control
/*    */   {
/* 22 */     public static final List<String> FORMAT_DEFAULT = null; public static final List<String> FORMAT_CLASS = null; public static final List<String> FORMAT_PROPERTIES = null;
/*    */     public static final long TTL_DONT_CACHE = -1L;
/*    */     public static final long TTL_NO_EXPIRATION_CONTROL = -2L;
/*    */ 
/*    */     protected Control()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public static Control getControl(List<String> formats) { throw new RuntimeException("Stub!"); } 
/*  8 */     public static Control getNoFallbackControl(List<String> formats) { throw new RuntimeException("Stub!"); } 
/*  9 */     public List<Locale> getCandidateLocales(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 10 */     public List<String> getFormats(String baseName) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Locale getFallbackLocale(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 12 */     public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException { throw new RuntimeException("Stub!"); } 
/* 13 */     public long getTimeToLive(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 14 */     public boolean needsReload(String baseName, Locale locale, String format, ClassLoader loader, ResourceBundle bundle, long loadTime) { throw new RuntimeException("Stub!"); } 
/* 15 */     public String toBundleName(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 16 */     public final String toResourceName(String bundleName, String suffix) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.ResourceBundle
 * JD-Core Version:    0.6.2
 */