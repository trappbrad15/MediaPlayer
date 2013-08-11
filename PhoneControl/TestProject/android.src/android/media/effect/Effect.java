/*   */ package android.media.effect;
/*   */ 
/*   */ public abstract class Effect
/*   */ {
/*   */   public Effect()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract String getName();
/*   */ 
/*   */   public abstract void apply(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*   */ 
/*   */   public abstract void setParameter(String paramString, Object paramObject);
/*   */ 
/* 8 */   public void setUpdateListener(EffectUpdateListener listener) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract void release();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.effect.Effect
 * JD-Core Version:    0.6.2
 */