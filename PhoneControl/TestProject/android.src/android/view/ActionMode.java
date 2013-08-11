/*    */ package android.view;
/*    */ 
/*    */ public abstract class ActionMode
/*    */ {
/*    */   public ActionMode()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public void setTag(Object tag) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Object getTag() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setTitle(CharSequence paramCharSequence);
/*    */ 
/*    */   public abstract void setTitle(int paramInt);
/*    */ 
/*    */   public abstract void setSubtitle(CharSequence paramCharSequence);
/*    */ 
/*    */   public abstract void setSubtitle(int paramInt);
/*    */ 
/* 18 */   public void setTitleOptionalHint(boolean titleOptional) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean getTitleOptionalHint() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isTitleOptional() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public abstract void setCustomView(View paramView);
/*    */ 
/*    */   public abstract void invalidate();
/*    */ 
/*    */   public abstract void finish();
/*    */ 
/*    */   public abstract Menu getMenu();
/*    */ 
/*    */   public abstract CharSequence getTitle();
/*    */ 
/*    */   public abstract CharSequence getSubtitle();
/*    */ 
/*    */   public abstract View getCustomView();
/*    */ 
/*    */   public abstract MenuInflater getMenuInflater();
/*    */ 
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu);
/*    */ 
/*    */     public abstract boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu);
/*    */ 
/*    */     public abstract boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem);
/*    */ 
/*    */     public abstract void onDestroyActionMode(ActionMode paramActionMode);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.ActionMode
 * JD-Core Version:    0.6.2
 */