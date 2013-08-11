/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.inputmethod.CompletionInfo;
/*    */ 
/*    */ public class AutoCompleteTextView extends EditText
/*    */   implements Filter.FilterListener
/*    */ {
/*    */   public AutoCompleteTextView(Context context)
/*    */   {
/* 15 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 16 */   public AutoCompleteTextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 17 */   public AutoCompleteTextView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 18 */   public void setOnClickListener(View.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setCompletionHint(CharSequence hint) { throw new RuntimeException("Stub!"); } 
/* 20 */   public CharSequence getCompletionHint() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getDropDownWidth() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setDropDownWidth(int width) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getDropDownHeight() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setDropDownHeight(int height) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getDropDownAnchor() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setDropDownAnchor(int id) { throw new RuntimeException("Stub!"); } 
/* 27 */   public Drawable getDropDownBackground() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setDropDownBackgroundDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setDropDownBackgroundResource(int id) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setDropDownVerticalOffset(int offset) { throw new RuntimeException("Stub!"); } 
/* 31 */   public int getDropDownVerticalOffset() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setDropDownHorizontalOffset(int offset) { throw new RuntimeException("Stub!"); } 
/* 33 */   public int getDropDownHorizontalOffset() { throw new RuntimeException("Stub!"); } 
/* 34 */   public int getThreshold() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setThreshold(int threshold) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener l) { throw new RuntimeException("Stub!"); } 
/* 39 */   @Deprecated
/*    */   public AdapterView.OnItemClickListener getItemClickListener() { throw new RuntimeException("Stub!"); } 
/* 41 */   @Deprecated
/*    */   public AdapterView.OnItemSelectedListener getItemSelectedListener() { throw new RuntimeException("Stub!"); } 
/* 42 */   public AdapterView.OnItemClickListener getOnItemClickListener() { throw new RuntimeException("Stub!"); } 
/* 43 */   public AdapterView.OnItemSelectedListener getOnItemSelectedListener() { throw new RuntimeException("Stub!"); } 
/* 44 */   public void setOnDismissListener(OnDismissListener dismissListener) { throw new RuntimeException("Stub!"); } 
/* 45 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 46 */   public <T extends ListAdapter,  extends Filterable> void setAdapter(T adapter) { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 48 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 49 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean enoughToFilter() { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean isPopupShowing() { throw new RuntimeException("Stub!"); } 
/* 52 */   protected CharSequence convertSelectionToString(Object selectedItem) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void clearListSelection() { throw new RuntimeException("Stub!"); } 
/* 54 */   public void setListSelection(int position) { throw new RuntimeException("Stub!"); } 
/* 55 */   public int getListSelection() { throw new RuntimeException("Stub!"); } 
/*    */   protected void performFiltering(CharSequence text, int keyCode) {
/* 57 */     throw new RuntimeException("Stub!"); } 
/* 58 */   public void performCompletion() { throw new RuntimeException("Stub!"); } 
/* 59 */   public void onCommitCompletion(CompletionInfo completion) { throw new RuntimeException("Stub!"); } 
/* 60 */   public boolean isPerformingCompletion() { throw new RuntimeException("Stub!"); } 
/* 61 */   public void setText(CharSequence text, boolean filter) { throw new RuntimeException("Stub!"); } 
/* 62 */   protected void replaceText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void onFilterComplete(int count) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); } 
/* 65 */   protected void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); } 
/* 66 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 67 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 68 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 69 */   public void dismissDropDown() { throw new RuntimeException("Stub!"); } 
/* 70 */   protected boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 71 */   public void showDropDown() { throw new RuntimeException("Stub!"); } 
/* 72 */   public void setValidator(Validator validator) { throw new RuntimeException("Stub!"); } 
/* 73 */   public Validator getValidator() { throw new RuntimeException("Stub!"); } 
/* 74 */   public void performValidation() { throw new RuntimeException("Stub!"); } 
/* 75 */   protected Filter getFilter() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnDismissListener
/*    */   {
/*    */     public abstract void onDismiss();
/*    */   }
/*    */ 
/*    */   public static abstract interface Validator
/*    */   {
/*    */     public abstract boolean isValid(CharSequence paramCharSequence);
/*    */ 
/*    */     public abstract CharSequence fixText(CharSequence paramCharSequence);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.AutoCompleteTextView
 * JD-Core Version:    0.6.2
 */