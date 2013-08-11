/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.os.ResultReceiver;
/*    */ import android.view.View;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public final class InputMethodManager
/*    */ {
/*    */   public static final int SHOW_IMPLICIT = 1;
/*    */   public static final int SHOW_FORCED = 2;
/*    */   public static final int RESULT_UNCHANGED_SHOWN = 0;
/*    */   public static final int RESULT_UNCHANGED_HIDDEN = 1;
/*    */   public static final int RESULT_SHOWN = 2;
/*    */   public static final int RESULT_HIDDEN = 3;
/*    */   public static final int HIDE_IMPLICIT_ONLY = 1;
/*    */   public static final int HIDE_NOT_ALWAYS = 2;
/*    */ 
/*    */   InputMethodManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public List<InputMethodInfo> getInputMethodList() { throw new RuntimeException("Stub!"); } 
/*  6 */   public List<InputMethodInfo> getEnabledInputMethodList() { throw new RuntimeException("Stub!"); } 
/*  7 */   public List<InputMethodSubtype> getEnabledInputMethodSubtypeList(InputMethodInfo imi, boolean allowsImplicitlySelectedSubtypes) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void showStatusIcon(IBinder imeToken, String packageName, int iconId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void hideStatusIcon(IBinder imeToken) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isFullscreenMode() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isActive(View view) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isActive() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isAcceptingText() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void displayCompletions(View view, CompletionInfo[] completions) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void updateExtractedText(View view, int token, ExtractedText text) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean showSoftInput(View view, int flags) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean showSoftInput(View view, int flags, ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean hideSoftInputFromWindow(IBinder windowToken, int flags) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean hideSoftInputFromWindow(IBinder windowToken, int flags, ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void toggleSoftInputFromWindow(IBinder windowToken, int showFlags, int hideFlags) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void toggleSoftInput(int showFlags, int hideFlags) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void restartInput(View view) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void updateSelection(View view, int selStart, int selEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void viewClicked(View view) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean isWatchingCursor(View view) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void updateCursor(View view, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void sendAppPrivateCommand(View view, String action, Bundle data) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setInputMethod(IBinder token, String id) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setInputMethodAndSubtype(IBinder token, String id, InputMethodSubtype subtype) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void hideSoftInputFromInputMethod(IBinder token, int flags) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void showSoftInputFromInputMethod(IBinder token, int flags) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void showInputMethodPicker() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void showInputMethodAndSubtypeEnabler(String imiId) { throw new RuntimeException("Stub!"); } 
/* 34 */   public InputMethodSubtype getCurrentInputMethodSubtype() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean setCurrentInputMethodSubtype(InputMethodSubtype subtype) { throw new RuntimeException("Stub!"); } 
/* 36 */   public Map<InputMethodInfo, List<InputMethodSubtype>> getShortcutInputMethodsAndSubtypes() { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean switchToLastInputMethod(IBinder imeToken) { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean switchToNextInputMethod(IBinder imeToken, boolean onlyCurrentIme) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setAdditionalInputMethodSubtypes(String imiId, InputMethodSubtype[] subtypes) { throw new RuntimeException("Stub!"); } 
/* 40 */   public InputMethodSubtype getLastInputMethodSubtype() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.inputmethod.InputMethodManager
 * JD-Core Version:    0.6.2
 */