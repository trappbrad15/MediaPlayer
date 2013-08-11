/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.InputFilter;
/*    */ import android.text.Spannable;
/*    */ import android.text.Spanned;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public abstract class NumberKeyListener extends BaseKeyListener
/*    */   implements InputFilter
/*    */ {
/*    */   public NumberKeyListener()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract char[] getAcceptedChars();
/*    */ 
/*  8 */   protected int lookup(KeyEvent event, Spannable content) { throw new RuntimeException("Stub!"); } 
/*  9 */   public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected static boolean ok(char[] accept, char c) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.method.NumberKeyListener
 * JD-Core Version:    0.6.2
 */