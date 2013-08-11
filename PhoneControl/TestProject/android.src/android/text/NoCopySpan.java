/*   */ package android.text;
/*   */ 
/*   */ public abstract interface NoCopySpan
/*   */ {
/*   */   public static class Concrete
/*   */     implements NoCopySpan
/*   */   {
/*   */     public Concrete()
/*   */     {
/* 7 */       throw new RuntimeException("Stub!");
/*   */     }
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.NoCopySpan
 * JD-Core Version:    0.6.2
 */