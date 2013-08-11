/*   */ package java.lang;
/*   */ 
/*   */ public class InheritableThreadLocal<T> extends ThreadLocal<T>
/*   */ {
/*   */   public InheritableThreadLocal()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected T childValue(T parentValue) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.InheritableThreadLocal
 * JD-Core Version:    0.6.2
 */