/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.Tag;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public final class NfcA extends BasicTagTechnology
/*    */ {
/*    */   NfcA()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static NfcA get(Tag tag) { throw new RuntimeException("Stub!"); } 
/*  7 */   public byte[] getAtqa() { throw new RuntimeException("Stub!"); } 
/*  8 */   public short getSak() { throw new RuntimeException("Stub!"); } 
/*  9 */   public byte[] transceive(byte[] data) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getMaxTransceiveLength() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setTimeout(int timeout) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getTimeout() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.nfc.tech.NfcA
 * JD-Core Version:    0.6.2
 */