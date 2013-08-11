/*   */ package android.nfc.tech;
/*   */ 
/*   */ import android.nfc.FormatException;
/*   */ import android.nfc.NdefMessage;
/*   */ import android.nfc.Tag;
/*   */ import java.io.IOException;
/*   */ 
/*   */ public final class NdefFormatable extends BasicTagTechnology
/*   */ {
/*   */   NdefFormatable()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static NdefFormatable get(Tag tag) { throw new RuntimeException("Stub!"); } 
/* 7 */   public void format(NdefMessage firstMessage) throws IOException, FormatException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void formatReadOnly(NdefMessage firstMessage) throws IOException, FormatException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.nfc.tech.NdefFormatable
 * JD-Core Version:    0.6.2
 */