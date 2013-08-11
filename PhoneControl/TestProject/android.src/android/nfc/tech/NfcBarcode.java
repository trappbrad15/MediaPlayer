/*   */ package android.nfc.tech;
/*   */ 
/*   */ import android.nfc.Tag;
/*   */ 
/*   */ public final class NfcBarcode extends BasicTagTechnology
/*   */ {
/*   */   public static final int TYPE_KOVIO = 1;
/*   */   public static final int TYPE_UNKNOWN = -1;
/*   */ 
/*   */   NfcBarcode()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static NfcBarcode get(Tag tag) { throw new RuntimeException("Stub!"); } 
/* 7 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 8 */   public byte[] getBarcode() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.nfc.tech.NfcBarcode
 * JD-Core Version:    0.6.2
 */