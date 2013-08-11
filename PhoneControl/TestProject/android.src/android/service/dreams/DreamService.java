/*    */ package android.service.dreams;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.view.ActionMode;
/*    */ import android.view.ActionMode.Callback;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuItem;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.Window;
/*    */ import android.view.Window.Callback;
/*    */ import android.view.WindowManager;
/*    */ import android.view.WindowManager.LayoutParams;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class DreamService extends Service
/*    */   implements Window.Callback
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.dreams.DreamService";
/*    */   public static final String DREAM_META_DATA = "android.service.dream";
/*    */ 
/*    */   public DreamService()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean dispatchGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 13 */   public View onCreatePanelView(int featureId) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean onCreatePanelMenu(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean onPreparePanel(int featureId, View view, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean onMenuOpened(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean onMenuItemSelected(int featureId, MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onContentChanged() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onPanelClosed(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean onSearchRequested() { throw new RuntimeException("Stub!"); } 
/* 25 */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void onActionModeStarted(ActionMode mode) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void onActionModeFinished(ActionMode mode) { throw new RuntimeException("Stub!"); } 
/* 28 */   public WindowManager getWindowManager() { throw new RuntimeException("Stub!"); } 
/* 29 */   public Window getWindow() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setContentView(int layoutResID) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setContentView(View view) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void addContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 34 */   public View findViewById(int id) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setInteractive(boolean interactive) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean isInteractive() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setFullscreen(boolean fullscreen) { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean isFullscreen() { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setScreenBright(boolean screenBright) { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean isScreenBright() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/* 42 */   public void onDreamingStarted() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void onDreamingStopped() { throw new RuntimeException("Stub!"); } 
/* 44 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 45 */   public final void finish() { throw new RuntimeException("Stub!"); } 
/* 46 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 47 */   protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.service.dreams.DreamService
 * JD-Core Version:    0.6.2
 */