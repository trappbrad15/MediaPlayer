/*     */ package android.inputmethodservice;
/*     */ 
/*     */ import android.app.Dialog;
/*     */ import android.content.res.Configuration;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Region;
/*     */ import android.os.Bundle;
/*     */ import android.os.IBinder;
/*     */ import android.os.ResultReceiver;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.LayoutInflater;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.Window;
/*     */ import android.view.inputmethod.CompletionInfo;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.ExtractedText;
/*     */ import android.view.inputmethod.InputBinding;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import android.view.inputmethod.InputMethodSubtype;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ public class InputMethodService extends AbstractInputMethodService
/*     */ {
/*     */   public static final int BACK_DISPOSITION_DEFAULT = 0;
/*     */   public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = 1;
/*     */   public static final int BACK_DISPOSITION_WILL_DISMISS = 2;
/*     */ 
/*     */   public InputMethodService()
/*     */   {
/*  43 */     throw new RuntimeException("Stub!"); } 
/*  44 */   public void setTheme(int theme) { throw new RuntimeException("Stub!"); } 
/*  45 */   public boolean enableHardwareAcceleration() { throw new RuntimeException("Stub!"); } 
/*  46 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/*  47 */   public void onInitializeInterface() { throw new RuntimeException("Stub!"); } 
/*  48 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/*  49 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/*  50 */   public AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() { throw new RuntimeException("Stub!"); } 
/*  51 */   public AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() { throw new RuntimeException("Stub!"); } 
/*  52 */   public LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); } 
/*  53 */   public Dialog getWindow() { throw new RuntimeException("Stub!"); } 
/*  54 */   public void setBackDisposition(int disposition) { throw new RuntimeException("Stub!"); } 
/*  55 */   public int getBackDisposition() { throw new RuntimeException("Stub!"); } 
/*  56 */   public int getMaxWidth() { throw new RuntimeException("Stub!"); } 
/*  57 */   public InputBinding getCurrentInputBinding() { throw new RuntimeException("Stub!"); } 
/*  58 */   public InputConnection getCurrentInputConnection() { throw new RuntimeException("Stub!"); } 
/*  59 */   public boolean getCurrentInputStarted() { throw new RuntimeException("Stub!"); } 
/*  60 */   public EditorInfo getCurrentInputEditorInfo() { throw new RuntimeException("Stub!"); } 
/*  61 */   public void updateFullscreenMode() { throw new RuntimeException("Stub!"); } 
/*  62 */   public void onConfigureWindow(Window win, boolean isFullscreen, boolean isCandidatesOnly) { throw new RuntimeException("Stub!"); } 
/*  63 */   public boolean isFullscreenMode() { throw new RuntimeException("Stub!"); } 
/*  64 */   public boolean onEvaluateFullscreenMode() { throw new RuntimeException("Stub!"); } 
/*  65 */   public void setExtractViewShown(boolean shown) { throw new RuntimeException("Stub!"); } 
/*  66 */   public boolean isExtractViewShown() { throw new RuntimeException("Stub!"); } 
/*  67 */   public void onComputeInsets(Insets outInsets) { throw new RuntimeException("Stub!"); } 
/*  68 */   public void updateInputViewShown() { throw new RuntimeException("Stub!"); } 
/*  69 */   public boolean isShowInputRequested() { throw new RuntimeException("Stub!"); } 
/*  70 */   public boolean isInputViewShown() { throw new RuntimeException("Stub!"); } 
/*  71 */   public boolean onEvaluateInputViewShown() { throw new RuntimeException("Stub!"); } 
/*  72 */   public void setCandidatesViewShown(boolean shown) { throw new RuntimeException("Stub!"); } 
/*  73 */   public int getCandidatesHiddenVisibility() { throw new RuntimeException("Stub!"); } 
/*  74 */   public void showStatusIcon(int iconResId) { throw new RuntimeException("Stub!"); } 
/*  75 */   public void hideStatusIcon() { throw new RuntimeException("Stub!"); } 
/*  76 */   public void switchInputMethod(String id) { throw new RuntimeException("Stub!"); } 
/*  77 */   public void setExtractView(View view) { throw new RuntimeException("Stub!"); } 
/*  78 */   public void setCandidatesView(View view) { throw new RuntimeException("Stub!"); } 
/*  79 */   public void setInputView(View view) { throw new RuntimeException("Stub!"); } 
/*  80 */   public View onCreateExtractTextView() { throw new RuntimeException("Stub!"); } 
/*  81 */   public View onCreateCandidatesView() { throw new RuntimeException("Stub!"); } 
/*  82 */   public View onCreateInputView() { throw new RuntimeException("Stub!"); } 
/*  83 */   public void onStartInputView(EditorInfo info, boolean restarting) { throw new RuntimeException("Stub!"); } 
/*  84 */   public void onFinishInputView(boolean finishingInput) { throw new RuntimeException("Stub!"); } 
/*  85 */   public void onStartCandidatesView(EditorInfo info, boolean restarting) { throw new RuntimeException("Stub!"); } 
/*  86 */   public void onFinishCandidatesView(boolean finishingInput) { throw new RuntimeException("Stub!"); } 
/*  87 */   public boolean onShowInputRequested(int flags, boolean configChange) { throw new RuntimeException("Stub!"); } 
/*  88 */   public void showWindow(boolean showInput) { throw new RuntimeException("Stub!"); } 
/*  89 */   public void hideWindow() { throw new RuntimeException("Stub!"); } 
/*  90 */   public void onWindowShown() { throw new RuntimeException("Stub!"); } 
/*  91 */   public void onWindowHidden() { throw new RuntimeException("Stub!"); } 
/*  92 */   public void onBindInput() { throw new RuntimeException("Stub!"); } 
/*  93 */   public void onUnbindInput() { throw new RuntimeException("Stub!"); } 
/*  94 */   public void onStartInput(EditorInfo attribute, boolean restarting) { throw new RuntimeException("Stub!"); } 
/*  95 */   public void onFinishInput() { throw new RuntimeException("Stub!"); } 
/*  96 */   public void onDisplayCompletions(CompletionInfo[] completions) { throw new RuntimeException("Stub!"); } 
/*  97 */   public void onUpdateExtractedText(int token, ExtractedText text) { throw new RuntimeException("Stub!"); } 
/*  98 */   public void onUpdateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); } 
/*  99 */   public void onViewClicked(boolean focusChanged) { throw new RuntimeException("Stub!"); } 
/* 100 */   public void onUpdateCursor(Rect newCursor) { throw new RuntimeException("Stub!"); } 
/* 101 */   public void requestHideSelf(int flags) { throw new RuntimeException("Stub!"); } 
/* 102 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 103 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 104 */   public boolean onKeyMultiple(int keyCode, int count, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 105 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 106 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 107 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 108 */   public void onAppPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); } 
/* 109 */   public void sendDownUpKeyEvents(int keyEventCode) { throw new RuntimeException("Stub!"); } 
/* 110 */   public boolean sendDefaultEditorAction(boolean fromEnterKey) { throw new RuntimeException("Stub!"); } 
/* 111 */   public void sendKeyChar(char charCode) { throw new RuntimeException("Stub!"); } 
/* 112 */   public void onExtractedSelectionChanged(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 113 */   public void onExtractedTextClicked() { throw new RuntimeException("Stub!"); } 
/* 114 */   public void onExtractedCursorMovement(int dx, int dy) { throw new RuntimeException("Stub!"); } 
/* 115 */   public boolean onExtractTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); } 
/* 116 */   public CharSequence getTextForImeAction(int imeOptions) { throw new RuntimeException("Stub!"); } 
/* 117 */   public void onUpdateExtractingVisibility(EditorInfo ei) { throw new RuntimeException("Stub!"); } 
/* 118 */   public void onUpdateExtractingViews(EditorInfo ei) { throw new RuntimeException("Stub!"); } 
/* 119 */   public void onExtractingInputChanged(EditorInfo ei) { throw new RuntimeException("Stub!"); } 
/* 120 */   protected void onCurrentInputMethodSubtypeChanged(InputMethodSubtype newSubtype) { throw new RuntimeException("Stub!"); } 
/* 121 */   protected void dump(FileDescriptor fd, PrintWriter fout, String[] args) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static final class Insets
/*     */   {
/*     */     public int contentTopInsets;
/*     */     public int visibleTopInsets;
/*     */     public final Region touchableRegion;
/*     */     public static final int TOUCHABLE_INSETS_FRAME = 0;
/*     */     public static final int TOUCHABLE_INSETS_CONTENT = 1;
/*     */     public static final int TOUCHABLE_INSETS_VISIBLE = 2;
/*     */     public static final int TOUCHABLE_INSETS_REGION = 3;
/*     */     public int touchableInsets;
/*     */ 
/*     */     public Insets()
/*     */     {
/*  33 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public class InputMethodSessionImpl extends AbstractInputMethodService.AbstractInputMethodSessionImpl
/*     */   {
/*     */     public InputMethodSessionImpl()
/*     */     {
/*  21 */       super(); throw new RuntimeException("Stub!"); } 
/*  22 */     public void finishInput() { throw new RuntimeException("Stub!"); } 
/*  23 */     public void displayCompletions(CompletionInfo[] completions) { throw new RuntimeException("Stub!"); } 
/*  24 */     public void updateExtractedText(int token, ExtractedText text) { throw new RuntimeException("Stub!"); } 
/*  25 */     public void updateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); } 
/*  26 */     public void viewClicked(boolean focusChanged) { throw new RuntimeException("Stub!"); } 
/*  27 */     public void updateCursor(Rect newCursor) { throw new RuntimeException("Stub!"); } 
/*  28 */     public void appPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); } 
/*  29 */     public void toggleSoftInput(int showFlags, int hideFlags) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public class InputMethodImpl extends AbstractInputMethodService.AbstractInputMethodImpl
/*     */   {
/*     */     public InputMethodImpl()
/*     */     {
/*   8 */       super(); throw new RuntimeException("Stub!"); } 
/*   9 */     public void attachToken(IBinder token) { throw new RuntimeException("Stub!"); } 
/*  10 */     public void bindInput(InputBinding binding) { throw new RuntimeException("Stub!"); } 
/*  11 */     public void unbindInput() { throw new RuntimeException("Stub!"); } 
/*  12 */     public void startInput(InputConnection ic, EditorInfo attribute) { throw new RuntimeException("Stub!"); } 
/*  13 */     public void restartInput(InputConnection ic, EditorInfo attribute) { throw new RuntimeException("Stub!"); } 
/*  14 */     public void hideSoftInput(int flags, ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); } 
/*  15 */     public void showSoftInput(int flags, ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); } 
/*  16 */     public void changeInputMethodSubtype(InputMethodSubtype subtype) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.inputmethodservice.InputMethodService
 * JD-Core Version:    0.6.2
 */