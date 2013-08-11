/*    */ package android.text.style;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.text.Layout.Alignment;
/*    */ import android.text.ParcelableSpan;
/*    */ 
/*    */ public abstract interface AlignmentSpan extends ParagraphStyle
/*    */ {
/*    */   public abstract Layout.Alignment getAlignment();
/*    */ 
/*    */   public static class Standard
/*    */     implements AlignmentSpan, ParcelableSpan
/*    */   {
/*    */     public Standard(Layout.Alignment align)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public Standard(Parcel src) { throw new RuntimeException("Stub!"); } 
/* 10 */     public int getSpanTypeId() { throw new RuntimeException("Stub!"); } 
/* 11 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 12 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Layout.Alignment getAlignment() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.AlignmentSpan
 * JD-Core Version:    0.6.2
 */