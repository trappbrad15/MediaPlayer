/*    */ package android.renderscript;
/*    */ 
/*    */ public class Type extends BaseObj
/*    */ {
/*    */   Type()
/*    */   {
/* 28 */     throw new RuntimeException("Stub!"); } 
/* 29 */   public Element getElement() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getX() { throw new RuntimeException("Stub!"); } 
/* 31 */   public int getY() { throw new RuntimeException("Stub!"); } 
/* 32 */   public int getZ() { throw new RuntimeException("Stub!"); } 
/* 33 */   public int getYuv() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean hasMipmaps() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean hasFaces() { throw new RuntimeException("Stub!"); } 
/* 36 */   public int getCount() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs, Element e)
/*    */     {
/* 19 */       throw new RuntimeException("Stub!"); } 
/* 20 */     public Builder setX(int value) { throw new RuntimeException("Stub!"); } 
/* 21 */     public Builder setY(int value) { throw new RuntimeException("Stub!"); } 
/* 22 */     public Builder setZ(int value) { throw new RuntimeException("Stub!"); } 
/* 23 */     public Builder setMipmaps(boolean value) { throw new RuntimeException("Stub!"); } 
/* 24 */     public Builder setFaces(boolean value) { throw new RuntimeException("Stub!"); } 
/* 25 */     public Builder setYuvFormat(int yuvFormat) { throw new RuntimeException("Stub!"); } 
/* 26 */     public Type create() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static enum CubemapFace
/*    */   {
/*  7 */     NEGATIVE_X, 
/*  8 */     NEGATIVE_Y, 
/*  9 */     NEGATIVE_Z, 
/* 10 */     POSITIVE_X, 
/* 11 */     POSITIVE_Y, 
/* 12 */     POSITIVE_Z, 
/* 13 */     POSITVE_X, 
/* 14 */     POSITVE_Y, 
/* 15 */     POSITVE_Z;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.renderscript.Type
 * JD-Core Version:    0.6.2
 */