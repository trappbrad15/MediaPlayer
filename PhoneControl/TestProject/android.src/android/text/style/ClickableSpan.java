/*   */ package android.text.style;
/*   */ 
/*   */ import android.text.TextPaint;
/*   */ import android.view.View;
/*   */ 
/*   */ public abstract class ClickableSpan extends CharacterStyle
/*   */   implements UpdateAppearance
/*   */ {
/*   */   public ClickableSpan()
/*   */   {
/* 6 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract void onClick(View paramView);
/*   */ 
/* 8 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.ClickableSpan
 * JD-Core Version:    0.6.2
 */