/*   */ package android.text.method;
/*   */ 
/*   */ import android.graphics.Rect;
/*   */ import android.view.View;
/*   */ 
/*   */ public abstract class ReplacementTransformationMethod
/*   */   implements TransformationMethod
/*   */ {
/*   */   public ReplacementTransformationMethod()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/*   */   protected abstract char[] getOriginal();
/*   */ 
/*   */   protected abstract char[] getReplacement();
/*   */ 
/* 8 */   public CharSequence getTransformation(CharSequence source, View v) { throw new RuntimeException("Stub!"); } 
/* 9 */   public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.method.ReplacementTransformationMethod
 * JD-Core Version:    0.6.2
 */