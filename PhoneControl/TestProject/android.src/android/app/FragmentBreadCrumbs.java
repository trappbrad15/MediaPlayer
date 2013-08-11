/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ public class FragmentBreadCrumbs extends ViewGroup
/*    */   implements FragmentManager.OnBackStackChangedListener
/*    */ {
/*    */   public FragmentBreadCrumbs(Context context)
/*    */   {
/* 10 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public FragmentBreadCrumbs(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public FragmentBreadCrumbs(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 13 */   public void setActivity(Activity a) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setMaxVisible(int visibleCrumbs) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setParentTitle(CharSequence title, CharSequence shortTitle, View.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setOnBreadCrumbClickListener(OnBreadCrumbClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setTitle(CharSequence title, CharSequence shortTitle) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onBackStackChanged() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnBreadCrumbClickListener
/*    */   {
/*    */     public abstract boolean onBreadCrumbClick(FragmentManager.BackStackEntry paramBackStackEntry, int paramInt);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.FragmentBreadCrumbs
 * JD-Core Version:    0.6.2
 */