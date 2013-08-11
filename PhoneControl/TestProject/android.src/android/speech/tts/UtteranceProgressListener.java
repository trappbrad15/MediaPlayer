/*   */ package android.speech.tts;
/*   */ 
/*   */ public abstract class UtteranceProgressListener
/*   */ {
/*   */   public UtteranceProgressListener()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void onStart(String paramString);
/*   */ 
/*   */   public abstract void onDone(String paramString);
/*   */ 
/*   */   public abstract void onError(String paramString);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.speech.tts.UtteranceProgressListener
 * JD-Core Version:    0.6.2
 */