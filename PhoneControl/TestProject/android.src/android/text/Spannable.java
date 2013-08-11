/*   */ package android.text;
/*   */ 
/*   */ public abstract interface Spannable extends Spanned
/*   */ {
/*   */   public abstract void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3);
/*   */ 
/*   */   public abstract void removeSpan(Object paramObject);
/*   */ 
/*   */   public static class Factory
/*   */   {
/*   */     public Factory()
/*   */     {
/* 7 */       throw new RuntimeException("Stub!"); } 
/* 8 */     public static Factory getInstance() { throw new RuntimeException("Stub!"); } 
/* 9 */     public Spannable newSpannable(CharSequence source) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.Spannable
 * JD-Core Version:    0.6.2
 */