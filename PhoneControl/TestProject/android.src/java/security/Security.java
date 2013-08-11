/*    */ package java.security;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ public final class Security
/*    */ {
/*    */   Security()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  6 */   @Deprecated
/*    */   public static String getAlgorithmProperty(String algName, String propName) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static synchronized int insertProviderAt(Provider provider, int position) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static int addProvider(Provider provider) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static synchronized void removeProvider(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static synchronized Provider[] getProviders() { throw new RuntimeException("Stub!"); } 
/* 11 */   public static synchronized Provider getProvider(String name) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Provider[] getProviders(String filter) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static synchronized Provider[] getProviders(Map<String, String> filter) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static String getProperty(String key) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static void setProperty(String key, String value) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static Set<String> getAlgorithms(String serviceName) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.Security
 * JD-Core Version:    0.6.2
 */