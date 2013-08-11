/*    */ package android.view.textservice;
/*    */ 
/*    */ public class SpellCheckerSession
/*    */ {
/*    */   public static final String SERVICE_META_DATA = "android.view.textservice.scs";
/*    */ 
/*    */   SpellCheckerSession()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isSessionDisconnected() { throw new RuntimeException("Stub!"); } 
/* 11 */   public SpellCheckerInfo getSpellChecker() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void cancel() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void getSentenceSuggestions(TextInfo[] textInfos, int suggestionsLimit) { throw new RuntimeException("Stub!"); } 
/* 16 */   @Deprecated
/*    */   public void getSuggestions(TextInfo textInfo, int suggestionsLimit) { throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public void getSuggestions(TextInfo[] textInfos, int suggestionsLimit, boolean sequentialWords) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface SpellCheckerSessionListener
/*    */   {
/*    */     public abstract void onGetSuggestions(SuggestionsInfo[] paramArrayOfSuggestionsInfo);
/*    */ 
/*    */     public abstract void onGetSentenceSuggestions(SentenceSuggestionsInfo[] paramArrayOfSentenceSuggestionsInfo);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.textservice.SpellCheckerSession
 * JD-Core Version:    0.6.2
 */