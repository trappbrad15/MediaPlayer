/*    */ package android.app;
/*    */ 
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.os.Bundle;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class DialogFragment extends Fragment
/*    */   implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
/*    */ {
/*    */   public static final int STYLE_NORMAL = 0;
/*    */   public static final int STYLE_NO_TITLE = 1;
/*    */   public static final int STYLE_NO_FRAME = 2;
/*    */   public static final int STYLE_NO_INPUT = 3;
/*    */ 
/*    */   public DialogFragment()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public void setStyle(int style, int theme) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void show(FragmentManager manager, String tag) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int show(FragmentTransaction transaction, String tag) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void dismiss() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void dismissAllowingStateLoss() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Dialog getDialog() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getTheme() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setCancelable(boolean cancelable) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isCancelable() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setShowsDialog(boolean showsDialog) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean getShowsDialog() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void onAttach(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onDetach() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Dialog onCreateDialog(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onCancel(DialogInterface dialog) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onDismiss(DialogInterface dialog) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void onStart() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void onStop() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void onDestroyView() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.DialogFragment
 * JD-Core Version:    0.6.2
 */