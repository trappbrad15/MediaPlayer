/*   */ package android.text;
/*   */ 
/*   */ @Deprecated
/*   */ public abstract class ClipboardManager
/*   */ {
/*   */   public ClipboardManager()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract CharSequence getText();
/*   */ 
/*   */   public abstract void setText(CharSequence paramCharSequence);
/*   */ 
/*   */   public abstract boolean hasText();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.ClipboardManager
 * JD-Core Version:    0.6.2
 */