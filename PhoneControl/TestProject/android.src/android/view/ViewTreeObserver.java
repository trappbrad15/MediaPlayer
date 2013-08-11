/*    */ package android.view;
/*    */ 
/*    */ public final class ViewTreeObserver
/*    */ {
/*    */   ViewTreeObserver()
/*    */   {
/* 37 */     throw new RuntimeException("Stub!"); } 
/* 38 */   public void addOnWindowAttachListener(OnWindowAttachListener listener) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void removeOnWindowAttachListener(OnWindowAttachListener victim) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void addOnWindowFocusChangeListener(OnWindowFocusChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void removeOnWindowFocusChangeListener(OnWindowFocusChangeListener victim) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void addOnGlobalFocusChangeListener(OnGlobalFocusChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void removeOnGlobalFocusChangeListener(OnGlobalFocusChangeListener victim) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void addOnGlobalLayoutListener(OnGlobalLayoutListener listener) { throw new RuntimeException("Stub!"); } 
/* 46 */   @Deprecated
/*    */   public void removeGlobalOnLayoutListener(OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void removeOnGlobalLayoutListener(OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void addOnPreDrawListener(OnPreDrawListener listener) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void removeOnPreDrawListener(OnPreDrawListener victim) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void addOnDrawListener(OnDrawListener listener) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void removeOnDrawListener(OnDrawListener victim) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void addOnScrollChangedListener(OnScrollChangedListener listener) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void removeOnScrollChangedListener(OnScrollChangedListener victim) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void addOnTouchModeChangeListener(OnTouchModeChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void removeOnTouchModeChangeListener(OnTouchModeChangeListener victim) { throw new RuntimeException("Stub!"); } 
/* 56 */   public boolean isAlive() { throw new RuntimeException("Stub!"); } 
/* 57 */   public final void dispatchOnGlobalLayout() { throw new RuntimeException("Stub!"); } 
/*    */   public final boolean dispatchOnPreDraw() {
/* 59 */     throw new RuntimeException("Stub!"); } 
/* 60 */   public final void dispatchOnDraw() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnScrollChangedListener
/*    */   {
/*    */     public abstract void onScrollChanged();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnTouchModeChangeListener
/*    */   {
/*    */     public abstract void onTouchModeChanged(boolean paramBoolean);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnDrawListener
/*    */   {
/*    */     public abstract void onDraw();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnPreDrawListener
/*    */   {
/*    */     public abstract boolean onPreDraw();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGlobalLayoutListener
/*    */   {
/*    */     public abstract void onGlobalLayout();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGlobalFocusChangeListener
/*    */   {
/*    */     public abstract void onGlobalFocusChanged(View paramView1, View paramView2);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnWindowFocusChangeListener
/*    */   {
/*    */     public abstract void onWindowFocusChanged(boolean paramBoolean);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnWindowAttachListener
/*    */   {
/*    */     public abstract void onWindowAttached();
/*    */ 
/*    */     public abstract void onWindowDetached();
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.ViewTreeObserver
 * JD-Core Version:    0.6.2
 */