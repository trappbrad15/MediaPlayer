/*    */ package android.service.wallpaper;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.SurfaceHolder;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class WallpaperService extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";
/*    */   public static final String SERVICE_META_DATA = "android.service.wallpaper";
/*    */ 
/*    */   public WallpaperService()
/*    */   {
/* 28 */     throw new RuntimeException("Stub!"); } 
/* 29 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 31 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Engine onCreateEngine();
/*    */ 
/* 33 */   protected void dump(FileDescriptor fd, PrintWriter out, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public class Engine
/*    */   {
/*    */     public Engine()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public SurfaceHolder getSurfaceHolder() { throw new RuntimeException("Stub!"); } 
/*  9 */     public int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 10 */     public int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 11 */     public boolean isVisible() { throw new RuntimeException("Stub!"); } 
/* 12 */     public boolean isPreview() { throw new RuntimeException("Stub!"); } 
/* 13 */     public void setTouchEventsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 14 */     public void setOffsetNotificationsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 15 */     public void onCreate(SurfaceHolder surfaceHolder) { throw new RuntimeException("Stub!"); } 
/* 16 */     public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 17 */     public void onVisibilityChanged(boolean visible) { throw new RuntimeException("Stub!"); } 
/* 18 */     public void onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 19 */     public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) { throw new RuntimeException("Stub!"); } 
/* 20 */     public Bundle onCommand(String action, int x, int y, int z, Bundle extras, boolean resultRequested) { throw new RuntimeException("Stub!"); } 
/* 21 */     public void onDesiredSizeChanged(int desiredWidth, int desiredHeight) { throw new RuntimeException("Stub!"); } 
/* 22 */     public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 23 */     public void onSurfaceRedrawNeeded(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 24 */     public void onSurfaceCreated(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 25 */     public void onSurfaceDestroyed(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 26 */     protected void dump(String prefix, FileDescriptor fd, PrintWriter out, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.service.wallpaper.WallpaperService
 * JD-Core Version:    0.6.2
 */