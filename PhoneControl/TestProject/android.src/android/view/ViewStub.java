/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.util.AttributeSet;
/*    */ import android.widget.RemoteViews.RemoteView;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public final class ViewStub extends View
/*    */ {
/*    */   public ViewStub(Context context)
/*    */   {
/* 10 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public ViewStub(Context context, int layoutResource) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public ViewStub(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*    */   public ViewStub(Context context, AttributeSet attrs, int defStyle) {
/* 14 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 15 */   public int getInflatedId() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setInflatedId(int inflatedId) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getLayoutResource() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setLayoutResource(int layoutResource) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setLayoutInflater(LayoutInflater inflater) { throw new RuntimeException("Stub!"); } 
/* 20 */   public LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setVisibility(int visibility) { throw new RuntimeException("Stub!"); } 
/* 25 */   public View inflate() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setOnInflateListener(OnInflateListener inflateListener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnInflateListener
/*    */   {
/*    */     public abstract void onInflate(ViewStub paramViewStub, View paramView);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.ViewStub
 * JD-Core Version:    0.6.2
 */