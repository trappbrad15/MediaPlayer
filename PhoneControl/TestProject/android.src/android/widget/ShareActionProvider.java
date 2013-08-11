/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.view.ActionProvider;
/*    */ import android.view.SubMenu;
/*    */ import android.view.View;
/*    */ 
/*    */ public class ShareActionProvider extends ActionProvider
/*    */ {
/*    */   public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
/*    */ 
/*    */   public ShareActionProvider(Context context)
/*    */   {
/*  9 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/* 10 */   public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener listener) { throw new RuntimeException("Stub!"); } 
/* 11 */   public View onCreateActionView() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean hasSubMenu() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onPrepareSubMenu(SubMenu subMenu) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setShareHistoryFileName(String shareHistoryFile) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setShareIntent(Intent shareIntent) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnShareTargetSelectedListener
/*    */   {
/*    */     public abstract boolean onShareTargetSelected(ShareActionProvider paramShareActionProvider, Intent paramIntent);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.ShareActionProvider
 * JD-Core Version:    0.6.2
 */