/*    */ package android.app;
/*    */ 
/*    */ import android.animation.Animator;
/*    */ import android.content.ComponentCallbacks2;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.res.Configuration;
/*    */ import android.content.res.Resources;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.ClassLoaderCreator;
/*    */ import android.util.AndroidRuntimeException;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ContextMenu;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.LayoutInflater;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuInflater;
/*    */ import android.view.MenuItem;
/*    */ import android.view.View;
/*    */ import android.view.View.OnCreateContextMenuListener;
/*    */ import android.view.ViewGroup;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class Fragment
/*    */   implements ComponentCallbacks2, View.OnCreateContextMenuListener
/*    */ {
/*    */   public Fragment()
/*    */   {
/* 19 */     throw new RuntimeException("Stub!"); } 
/* 20 */   public static Fragment instantiate(Context context, String fname) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static Fragment instantiate(Context context, String fname, Bundle args) { throw new RuntimeException("Stub!"); } 
/* 22 */   public final boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 23 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 25 */   public final int getId() { throw new RuntimeException("Stub!"); } 
/* 26 */   public final String getTag() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setArguments(Bundle args) { throw new RuntimeException("Stub!"); } 
/* 28 */   public final Bundle getArguments() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setInitialSavedState(SavedState state) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setTargetFragment(Fragment fragment, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 31 */   public final Fragment getTargetFragment() { throw new RuntimeException("Stub!"); } 
/* 32 */   public final int getTargetRequestCode() { throw new RuntimeException("Stub!"); } 
/* 33 */   public final Activity getActivity() { throw new RuntimeException("Stub!"); } 
/* 34 */   public final Resources getResources() { throw new RuntimeException("Stub!"); } 
/* 35 */   public final CharSequence getText(int resId) { throw new RuntimeException("Stub!"); } 
/* 36 */   public final String getString(int resId) { throw new RuntimeException("Stub!"); } 
/* 37 */   public final String getString(int resId, Object[] formatArgs) { throw new RuntimeException("Stub!"); } 
/* 38 */   public final FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); } 
/* 39 */   public final FragmentManager getChildFragmentManager() { throw new RuntimeException("Stub!"); } 
/* 40 */   public final Fragment getParentFragment() { throw new RuntimeException("Stub!"); } 
/* 41 */   public final boolean isAdded() { throw new RuntimeException("Stub!"); } 
/* 42 */   public final boolean isDetached() { throw new RuntimeException("Stub!"); } 
/* 43 */   public final boolean isRemoving() { throw new RuntimeException("Stub!"); } 
/* 44 */   public final boolean isInLayout() { throw new RuntimeException("Stub!"); } 
/* 45 */   public final boolean isResumed() { throw new RuntimeException("Stub!"); } 
/* 46 */   public final boolean isVisible() { throw new RuntimeException("Stub!"); } 
/* 47 */   public final boolean isHidden() { throw new RuntimeException("Stub!"); } 
/* 48 */   public void onHiddenChanged(boolean hidden) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void setRetainInstance(boolean retain) { throw new RuntimeException("Stub!"); } 
/* 50 */   public final boolean getRetainInstance() { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setHasOptionsMenu(boolean hasMenu) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setMenuVisibility(boolean menuVisible) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setUserVisibleHint(boolean isVisibleToUser) { throw new RuntimeException("Stub!"); } 
/* 54 */   public boolean getUserVisibleHint() { throw new RuntimeException("Stub!"); } 
/* 55 */   public LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); } 
/* 56 */   public void startActivity(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void startActivity(Intent intent, Bundle options) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void startActivityForResult(Intent intent, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 59 */   public void startActivityForResult(Intent intent, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); } 
/* 60 */   public void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); } 
/* 62 */   @Deprecated
/*    */   public void onInflate(AttributeSet attrs, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void onAttach(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 65 */   public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 67 */   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 68 */   public void onViewCreated(View view, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 69 */   public View getView() { throw new RuntimeException("Stub!"); } 
/* 70 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 71 */   public void onViewStateRestored(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 72 */   public void onStart() { throw new RuntimeException("Stub!"); } 
/* 73 */   public void onResume() { throw new RuntimeException("Stub!"); } 
/* 74 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 75 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 76 */   public void onPause() { throw new RuntimeException("Stub!"); } 
/* 77 */   public void onStop() { throw new RuntimeException("Stub!"); } 
/* 78 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/* 79 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); } 
/* 80 */   public void onDestroyView() { throw new RuntimeException("Stub!"); } 
/* 81 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 82 */   public void onDetach() { throw new RuntimeException("Stub!"); } 
/* 83 */   public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) { throw new RuntimeException("Stub!"); } 
/* 84 */   public void onPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 85 */   public void onDestroyOptionsMenu() { throw new RuntimeException("Stub!"); } 
/* 86 */   public boolean onOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 87 */   public void onOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 88 */   public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); } 
/* 89 */   public void registerForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/* 90 */   public void unregisterForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/* 91 */   public boolean onContextItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 92 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class InstantiationException extends AndroidRuntimeException
/*    */   {
/*    */     public InstantiationException(String msg, Exception cause)
/*    */     {
/* 17 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class SavedState
/*    */     implements Parcelable
/*    */   {
/* 12 */     public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = null;
/*    */ 
/*    */     SavedState()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.Fragment
 * JD-Core Version:    0.6.2
 */