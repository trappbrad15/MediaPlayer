/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class MultiAutoCompleteTextView extends AutoCompleteTextView
/*    */ {
/*    */   public MultiAutoCompleteTextView(Context context)
/*    */   {
/* 19 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public MultiAutoCompleteTextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public MultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 22 */   public void setTokenizer(Tokenizer t) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void performFiltering(CharSequence text, int keyCode) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean enoughToFilter() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void performValidation() { throw new RuntimeException("Stub!"); } 
/* 26 */   protected void performFiltering(CharSequence text, int start, int end, int keyCode) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void replaceText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class CommaTokenizer
/*    */     implements MultiAutoCompleteTextView.Tokenizer
/*    */   {
/*    */     public CommaTokenizer()
/*    */     {
/* 14 */       throw new RuntimeException("Stub!"); } 
/* 15 */     public int findTokenStart(CharSequence text, int cursor) { throw new RuntimeException("Stub!"); } 
/* 16 */     public int findTokenEnd(CharSequence text, int cursor) { throw new RuntimeException("Stub!"); } 
/* 17 */     public CharSequence terminateToken(CharSequence text) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static abstract interface Tokenizer
/*    */   {
/*    */     public abstract int findTokenStart(CharSequence paramCharSequence, int paramInt);
/*    */ 
/*    */     public abstract int findTokenEnd(CharSequence paramCharSequence, int paramInt);
/*    */ 
/*    */     public abstract CharSequence terminateToken(CharSequence paramCharSequence);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.MultiAutoCompleteTextView
 * JD-Core Version:    0.6.2
 */