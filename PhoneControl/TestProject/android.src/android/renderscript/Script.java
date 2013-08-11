/*    */ package android.renderscript;
/*    */ 
/*    */ public class Script extends BaseObj
/*    */ {
/*    */   Script()
/*    */   {
/* 44 */     throw new RuntimeException("Stub!"); } 
/* 45 */   protected KernelID createKernelID(int slot, int sig, Element ein, Element eout) { throw new RuntimeException("Stub!"); } 
/* 46 */   protected FieldID createFieldID(int slot, Element e) { throw new RuntimeException("Stub!"); } 
/* 47 */   protected void invoke(int slot) { throw new RuntimeException("Stub!"); } 
/* 48 */   protected void invoke(int slot, FieldPacker v) { throw new RuntimeException("Stub!"); } 
/* 49 */   protected void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v) { throw new RuntimeException("Stub!"); } 
/* 50 */   protected void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v, LaunchOptions sc) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void bindAllocation(Allocation va, int slot) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setVar(int index, float v) { throw new RuntimeException("Stub!"); } 
/* 53 */   public float getVarF(int index) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void setVar(int index, double v) { throw new RuntimeException("Stub!"); } 
/* 55 */   public double getVarD(int index) { throw new RuntimeException("Stub!"); } 
/* 56 */   public void setVar(int index, int v) { throw new RuntimeException("Stub!"); } 
/* 57 */   public int getVarI(int index) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void setVar(int index, long v) { throw new RuntimeException("Stub!"); } 
/* 59 */   public long getVarJ(int index) { throw new RuntimeException("Stub!"); } 
/* 60 */   public void setVar(int index, boolean v) { throw new RuntimeException("Stub!"); } 
/* 61 */   public boolean getVarB(int index) { throw new RuntimeException("Stub!"); } 
/* 62 */   public void setVar(int index, BaseObj o) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void setVar(int index, FieldPacker v) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void setVar(int index, FieldPacker v, Element e, int[] dims) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void getVarV(int index, FieldPacker v) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void setTimeZone(String timeZone) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class LaunchOptions
/*    */   {
/*    */     public LaunchOptions()
/*    */     {
/* 33 */       throw new RuntimeException("Stub!"); } 
/* 34 */     public LaunchOptions setX(int xstartArg, int xendArg) { throw new RuntimeException("Stub!"); } 
/* 35 */     public LaunchOptions setY(int ystartArg, int yendArg) { throw new RuntimeException("Stub!"); } 
/* 36 */     public LaunchOptions setZ(int zstartArg, int zendArg) { throw new RuntimeException("Stub!"); } 
/* 37 */     public int getXStart() { throw new RuntimeException("Stub!"); } 
/* 38 */     public int getXEnd() { throw new RuntimeException("Stub!"); } 
/* 39 */     public int getYStart() { throw new RuntimeException("Stub!"); } 
/* 40 */     public int getYEnd() { throw new RuntimeException("Stub!"); } 
/* 41 */     public int getZStart() { throw new RuntimeException("Stub!"); } 
/* 42 */     public int getZEnd() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static class FieldBase
/*    */   {
/*    */     protected Element mElement;
/*    */     protected Allocation mAllocation;
/*    */ 
/*    */     protected FieldBase()
/*    */     {
/* 21 */       throw new RuntimeException("Stub!"); } 
/* 22 */     protected void init(RenderScript rs, int dimx) { throw new RuntimeException("Stub!"); } 
/* 23 */     protected void init(RenderScript rs, int dimx, int usages) { throw new RuntimeException("Stub!"); } 
/* 24 */     public Element getElement() { throw new RuntimeException("Stub!"); } 
/* 25 */     public Type getType() { throw new RuntimeException("Stub!"); } 
/* 26 */     public Allocation getAllocation() { throw new RuntimeException("Stub!"); } 
/* 27 */     public void updateAllocation() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     Builder()
/*    */     {
/* 17 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static final class FieldID extends BaseObj
/*    */   {
/*    */     FieldID()
/*    */     {
/* 13 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static final class KernelID extends BaseObj
/*    */   {
/*    */     KernelID()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.renderscript.Script
 * JD-Core Version:    0.6.2
 */