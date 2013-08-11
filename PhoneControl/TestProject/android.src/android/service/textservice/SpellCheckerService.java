/*    */ package android.service.textservice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.view.textservice.SentenceSuggestionsInfo;
/*    */ import android.view.textservice.SuggestionsInfo;
/*    */ import android.view.textservice.TextInfo;
/*    */ 
/*    */ public abstract class SpellCheckerService extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.textservice.SpellCheckerService";
/*    */ 
/*    */   public SpellCheckerService()
/*    */   {
/* 17 */     throw new RuntimeException("Stub!"); } 
/* 18 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public abstract Session createSession();
/*    */ 
/*    */   public static abstract class Session
/*    */   {
/*    */     public Session()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*    */     public abstract void onCreate();
/*    */ 
/*    */     public abstract SuggestionsInfo onGetSuggestions(TextInfo paramTextInfo, int paramInt);
/*    */ 
/* 10 */     public SuggestionsInfo[] onGetSuggestionsMultiple(TextInfo[] textInfos, int suggestionsLimit, boolean sequentialWords) { throw new RuntimeException("Stub!"); } 
/* 11 */     public SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(TextInfo[] textInfos, int suggestionsLimit) { throw new RuntimeException("Stub!"); } 
/* 12 */     public void onCancel() { throw new RuntimeException("Stub!"); } 
/* 13 */     public void onClose() { throw new RuntimeException("Stub!"); } 
/* 14 */     public String getLocale() { throw new RuntimeException("Stub!"); } 
/* 15 */     public Bundle getBundle() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.service.textservice.SpellCheckerService
 * JD-Core Version:    0.6.2
 */