/*    */ package android.speech.tts;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class TextToSpeech
/*    */ {
/*    */   public static final int SUCCESS = 0;
/*    */   public static final int ERROR = -1;
/*    */   public static final int QUEUE_FLUSH = 0;
/*    */   public static final int QUEUE_ADD = 1;
/*    */   public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;
/*    */   public static final int LANG_COUNTRY_AVAILABLE = 1;
/*    */   public static final int LANG_AVAILABLE = 0;
/*    */   public static final int LANG_MISSING_DATA = -1;
/*    */   public static final int LANG_NOT_SUPPORTED = -2;
/*    */   public static final String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";
/*    */ 
/*    */   public TextToSpeech(Context context, OnInitListener listener)
/*    */   {
/* 59 */     throw new RuntimeException("Stub!"); } 
/* 60 */   public TextToSpeech(Context context, OnInitListener listener, String engine) { throw new RuntimeException("Stub!"); } 
/* 61 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 62 */   public int addSpeech(String text, String packagename, int resourceId) { throw new RuntimeException("Stub!"); } 
/* 63 */   public int addSpeech(String text, String filename) { throw new RuntimeException("Stub!"); } 
/* 64 */   public int addEarcon(String earcon, String packagename, int resourceId) { throw new RuntimeException("Stub!"); } 
/* 65 */   public int addEarcon(String earcon, String filename) { throw new RuntimeException("Stub!"); } 
/* 66 */   public int speak(String text, int queueMode, HashMap<String, String> params) { throw new RuntimeException("Stub!"); } 
/* 67 */   public int playEarcon(String earcon, int queueMode, HashMap<String, String> params) { throw new RuntimeException("Stub!"); } 
/* 68 */   public int playSilence(long durationInMs, int queueMode, HashMap<String, String> params) { throw new RuntimeException("Stub!"); } 
/* 69 */   public Set<String> getFeatures(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 70 */   public boolean isSpeaking() { throw new RuntimeException("Stub!"); } 
/* 71 */   public int stop() { throw new RuntimeException("Stub!"); } 
/* 72 */   public int setSpeechRate(float speechRate) { throw new RuntimeException("Stub!"); } 
/* 73 */   public int setPitch(float pitch) { throw new RuntimeException("Stub!"); } 
/* 74 */   public Locale getDefaultLanguage() { throw new RuntimeException("Stub!"); } 
/* 75 */   public int setLanguage(Locale loc) { throw new RuntimeException("Stub!"); } 
/* 76 */   public Locale getLanguage() { throw new RuntimeException("Stub!"); } 
/* 77 */   public int isLanguageAvailable(Locale loc) { throw new RuntimeException("Stub!"); } 
/* 78 */   public int synthesizeToFile(String text, HashMap<String, String> params, String filename) { throw new RuntimeException("Stub!"); } 
/* 80 */   @Deprecated
/*    */   public int setOnUtteranceCompletedListener(OnUtteranceCompletedListener listener) { throw new RuntimeException("Stub!"); } 
/* 81 */   public int setOnUtteranceProgressListener(UtteranceProgressListener listener) { throw new RuntimeException("Stub!"); } 
/* 83 */   @Deprecated
/*    */   public int setEngineByPackageName(String enginePackageName) { throw new RuntimeException("Stub!"); } 
/* 84 */   public String getDefaultEngine() { throw new RuntimeException("Stub!"); } 
/* 85 */   public boolean areDefaultsEnforced() { throw new RuntimeException("Stub!"); } 
/* 86 */   public List<EngineInfo> getEngines() { throw new RuntimeException("Stub!"); } 
/* 87 */   public static int getMaxSpeechInputLength() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class EngineInfo
/*    */   {
/*    */     public String name;
/*    */     public String label;
/*    */     public int icon;
/*    */ 
/*    */     public EngineInfo()
/*    */     {
/* 53 */       throw new RuntimeException("Stub!"); } 
/* 54 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public class Engine
/*    */   {
/*    */     public static final int DEFAULT_STREAM = 3;
/*    */     public static final int CHECK_VOICE_DATA_PASS = 1;
/*    */     public static final int CHECK_VOICE_DATA_FAIL = 0;
/*    */ 
/*    */     @Deprecated
/*    */     public static final int CHECK_VOICE_DATA_BAD_DATA = -1;
/*    */ 
/*    */     @Deprecated
/*    */     public static final int CHECK_VOICE_DATA_MISSING_DATA = -2;
/*    */ 
/*    */     @Deprecated
/*    */     public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3;
/*    */     public static final String INTENT_ACTION_TTS_SERVICE = "android.intent.action.TTS_SERVICE";
/*    */     public static final String SERVICE_META_DATA = "android.speech.tts";
/*    */     public static final String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA";
/*    */     public static final String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED";
/*    */     public static final String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA";
/*    */     public static final String ACTION_GET_SAMPLE_TEXT = "android.speech.tts.engine.GET_SAMPLE_TEXT";
/*    */     public static final String EXTRA_SAMPLE_TEXT = "sampleText";
/*    */     public static final String EXTRA_AVAILABLE_VOICES = "availableVoices";
/*    */     public static final String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";
/*    */ 
/*    */     @Deprecated
/*    */     public static final String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";
/*    */ 
/*    */     @Deprecated
/*    */     public static final String EXTRA_VOICE_DATA_FILES = "dataFiles";
/*    */ 
/*    */     @Deprecated
/*    */     public static final String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";
/*    */ 
/*    */     @Deprecated
/*    */     public static final String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor";
/*    */ 
/*    */     @Deprecated
/*    */     public static final String EXTRA_TTS_DATA_INSTALLED = "dataInstalled";
/*    */     public static final String KEY_PARAM_STREAM = "streamType";
/*    */     public static final String KEY_PARAM_UTTERANCE_ID = "utteranceId";
/*    */     public static final String KEY_PARAM_VOLUME = "volume";
/*    */     public static final String KEY_PARAM_PAN = "pan";
/*    */     public static final String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";
/*    */     public static final String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
/*    */ 
/*    */     public Engine()
/*    */     {
/* 15 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   @Deprecated
/*    */   public static abstract interface OnUtteranceCompletedListener
/*    */   {
/*    */     public abstract void onUtteranceCompleted(String paramString);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnInitListener
/*    */   {
/*    */     public abstract void onInit(int paramInt);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.speech.tts.TextToSpeech
 * JD-Core Version:    0.6.2
 */