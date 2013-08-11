/*    */ package android.speech.tts;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import java.util.Set;
/*    */ 
/*    */ public abstract class TextToSpeechService extends Service
/*    */ {
/*    */   public TextToSpeechService()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract int onIsLanguageAvailable(String paramString1, String paramString2, String paramString3);
/*    */ 
/*    */   protected abstract String[] onGetLanguage();
/*    */ 
/*    */   protected abstract int onLoadLanguage(String paramString1, String paramString2, String paramString3);
/*    */ 
/*    */   protected abstract void onStop();
/*    */ 
/*    */   protected abstract void onSynthesizeText(SynthesisRequest paramSynthesisRequest, SynthesisCallback paramSynthesisCallback);
/*    */ 
/* 13 */   protected Set<String> onGetFeaturesForLanguage(String lang, String country, String variant) { throw new RuntimeException("Stub!"); } 
/* 14 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.speech.tts.TextToSpeechService
 * JD-Core Version:    0.6.2
 */