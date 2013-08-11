/*    */ package android.content;
/*    */ 
/*    */ public class ClipboardManager extends android.text.ClipboardManager
/*    */ {
/*    */   ClipboardManager()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void setPrimaryClip(ClipData clip) { throw new RuntimeException("Stub!"); } 
/* 11 */   public ClipData getPrimaryClip() { throw new RuntimeException("Stub!"); } 
/* 12 */   public ClipDescription getPrimaryClipDescription() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean hasPrimaryClip() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void addPrimaryClipChangedListener(OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void removePrimaryClipChangedListener(OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); } 
/* 17 */   @Deprecated
/*    */   public CharSequence getText() { throw new RuntimeException("Stub!"); } 
/* 19 */   @Deprecated
/*    */   public void setText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 21 */   @Deprecated
/*    */   public boolean hasText() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnPrimaryClipChangedListener
/*    */   {
/*    */     public abstract void onPrimaryClipChanged();
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ClipboardManager
 * JD-Core Version:    0.6.2
 */