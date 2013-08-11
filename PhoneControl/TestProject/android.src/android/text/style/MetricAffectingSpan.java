/*   */ package android.text.style;
/*   */ 
/*   */ import android.text.TextPaint;
/*   */ 
/*   */ public abstract class MetricAffectingSpan extends CharacterStyle
/*   */   implements UpdateLayout
/*   */ {
/*   */   public MetricAffectingSpan()
/*   */   {
/* 6 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract void updateMeasureState(TextPaint paramTextPaint);
/*   */ 
/* 8 */   public MetricAffectingSpan getUnderlying() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.MetricAffectingSpan
 * JD-Core Version:    0.6.2
 */