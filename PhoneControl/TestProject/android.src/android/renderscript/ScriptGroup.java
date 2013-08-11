/*    */ package android.renderscript;
/*    */ 
/*    */ public final class ScriptGroup extends BaseObj
/*    */ {
/*    */   ScriptGroup()
/*    */   {
/* 13 */     throw new RuntimeException("Stub!"); } 
/* 14 */   public void setInput(Script.KernelID s, Allocation a) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setOutput(Script.KernelID s, Allocation a) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void execute() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class Builder
/*    */   {
/*    */     public Builder(RenderScript rs)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder addKernel(Script.KernelID k) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder addConnection(Type t, Script.KernelID from, Script.FieldID to) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder addConnection(Type t, Script.KernelID from, Script.KernelID to) { throw new RuntimeException("Stub!"); } 
/* 11 */     public ScriptGroup create() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.renderscript.ScriptGroup
 * JD-Core Version:    0.6.2
 */