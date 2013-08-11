/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuInflater;
/*    */ import android.view.MenuItem;
/*    */ import android.view.View;
/*    */ 
/*    */ public class PopupMenu
/*    */ {
/*    */   public PopupMenu(Context context, View anchor)
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public Menu getMenu() { throw new RuntimeException("Stub!"); } 
/* 14 */   public MenuInflater getMenuInflater() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void inflate(int menuRes) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void show() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void dismiss() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setOnMenuItemClickListener(OnMenuItemClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setOnDismissListener(OnDismissListener listener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnMenuItemClickListener
/*    */   {
/*    */     public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnDismissListener
/*    */   {
/*    */     public abstract void onDismiss(PopupMenu paramPopupMenu);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.PopupMenu
 * JD-Core Version:    0.6.2
 */