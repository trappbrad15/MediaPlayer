/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public abstract class ActionProvider
/*    */ {
/*    */   public ActionProvider(Context context)
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   public abstract View onCreateActionView();
/*    */ 
/* 11 */   public View onCreateActionView(MenuItem forItem) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean overridesItemVisibility() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isVisible() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void refreshVisibility() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean onPerformDefaultAction() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean hasSubMenu() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void onPrepareSubMenu(SubMenu subMenu) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setVisibilityListener(VisibilityListener listener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface VisibilityListener
/*    */   {
/*    */     public abstract void onActionProviderVisibilityChanged(boolean paramBoolean);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.ActionProvider
 * JD-Core Version:    0.6.2
 */