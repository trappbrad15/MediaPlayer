/*   */ package android.telephony;
/*   */ 
/*   */ public abstract class CellSignalStrength
/*   */ {
/*   */   CellSignalStrength()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract int getLevel();
/*   */ 
/*   */   public abstract int getAsuLevel();
/*   */ 
/*   */   public abstract int getDbm();
/*   */ 
/*   */   public abstract int hashCode();
/*   */ 
/*   */   public abstract boolean equals(Object paramObject);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.telephony.CellSignalStrength
 * JD-Core Version:    0.6.2
 */