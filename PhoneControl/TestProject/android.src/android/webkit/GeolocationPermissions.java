/*    */ package android.webkit;
/*    */ 
/*    */ import java.util.Set;
/*    */ 
/*    */ public class GeolocationPermissions
/*    */ {
/*    */   GeolocationPermissions()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public static GeolocationPermissions getInstance() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void getOrigins(ValueCallback<Set<String>> callback) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void getAllowed(String origin, ValueCallback<Boolean> callback) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void clear(String origin) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void allow(String origin) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void clearAll() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.webkit.GeolocationPermissions
 * JD-Core Version:    0.6.2
 */