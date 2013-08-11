/*     */ package android.view.accessibility;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.view.View;
/*     */ import java.util.List;
/*     */ 
/*     */ public class AccessibilityNodeInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int ACTION_FOCUS = 1;
/*     */   public static final int ACTION_CLEAR_FOCUS = 2;
/*     */   public static final int ACTION_SELECT = 4;
/*     */   public static final int ACTION_CLEAR_SELECTION = 8;
/*     */   public static final int ACTION_CLICK = 16;
/*     */   public static final int ACTION_LONG_CLICK = 32;
/*     */   public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
/*     */   public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
/*     */   public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
/*     */   public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
/*     */   public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
/*     */   public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
/*     */   public static final int ACTION_SCROLL_FORWARD = 4096;
/*     */   public static final int ACTION_SCROLL_BACKWARD = 8192;
/*     */   public static final int ACTION_COPY = 16384;
/*     */   public static final int ACTION_PASTE = 32768;
/*     */   public static final int ACTION_CUT = 65536;
/*     */   public static final int ACTION_SET_SELECTION = 131072;
/*     */   public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
/*     */   public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
/*     */   public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
/*     */   public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
/*     */   public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
/*     */   public static final int FOCUS_INPUT = 1;
/*     */   public static final int FOCUS_ACCESSIBILITY = 2;
/*     */   public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
/*     */   public static final int MOVEMENT_GRANULARITY_WORD = 2;
/*     */   public static final int MOVEMENT_GRANULARITY_LINE = 4;
/*     */   public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
/*     */   public static final int MOVEMENT_GRANULARITY_PAGE = 16;
/* 117 */   public static final Parcelable.Creator<AccessibilityNodeInfo> CREATOR = null;
/*     */ 
/*     */   AccessibilityNodeInfo()
/*     */   {
/*   5 */     throw new RuntimeException("Stub!"); } 
/*   6 */   public void setSource(View source) { throw new RuntimeException("Stub!"); } 
/*   7 */   public void setSource(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); } 
/*   8 */   public AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); } 
/*   9 */   public AccessibilityNodeInfo focusSearch(int direction) { throw new RuntimeException("Stub!"); } 
/*  10 */   public int getWindowId() { throw new RuntimeException("Stub!"); } 
/*  11 */   public boolean refresh() { throw new RuntimeException("Stub!"); } 
/*  12 */   public int getChildCount() { throw new RuntimeException("Stub!"); } 
/*  13 */   public AccessibilityNodeInfo getChild(int index) { throw new RuntimeException("Stub!"); } 
/*  14 */   public void addChild(View child) { throw new RuntimeException("Stub!"); } 
/*  15 */   public void addChild(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); } 
/*  16 */   public int getActions() { throw new RuntimeException("Stub!"); } 
/*  17 */   public void addAction(int action) { throw new RuntimeException("Stub!"); } 
/*  18 */   public void setMovementGranularities(int granularities) { throw new RuntimeException("Stub!"); } 
/*  19 */   public int getMovementGranularities() { throw new RuntimeException("Stub!"); } 
/*  20 */   public boolean performAction(int action) { throw new RuntimeException("Stub!"); } 
/*  21 */   public boolean performAction(int action, Bundle arguments) { throw new RuntimeException("Stub!"); } 
/*  22 */   public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text) { throw new RuntimeException("Stub!"); } 
/*  23 */   public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(String viewId) { throw new RuntimeException("Stub!"); } 
/*  24 */   public AccessibilityNodeInfo getParent() { throw new RuntimeException("Stub!"); } 
/*  25 */   public void setParent(View parent) { throw new RuntimeException("Stub!"); } 
/*  26 */   public void setParent(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); } 
/*  27 */   public void getBoundsInParent(Rect outBounds) { throw new RuntimeException("Stub!"); } 
/*  28 */   public void setBoundsInParent(Rect bounds) { throw new RuntimeException("Stub!"); } 
/*  29 */   public void getBoundsInScreen(Rect outBounds) { throw new RuntimeException("Stub!"); } 
/*  30 */   public void setBoundsInScreen(Rect bounds) { throw new RuntimeException("Stub!"); } 
/*  31 */   public boolean isCheckable() { throw new RuntimeException("Stub!"); } 
/*  32 */   public void setCheckable(boolean checkable) { throw new RuntimeException("Stub!"); } 
/*  33 */   public boolean isChecked() { throw new RuntimeException("Stub!"); } 
/*  34 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); } 
/*  35 */   public boolean isFocusable() { throw new RuntimeException("Stub!"); } 
/*  36 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); } 
/*  37 */   public boolean isFocused() { throw new RuntimeException("Stub!"); } 
/*  38 */   public void setFocused(boolean focused) { throw new RuntimeException("Stub!"); } 
/*  39 */   public boolean isVisibleToUser() { throw new RuntimeException("Stub!"); } 
/*  40 */   public void setVisibleToUser(boolean visibleToUser) { throw new RuntimeException("Stub!"); } 
/*  41 */   public boolean isAccessibilityFocused() { throw new RuntimeException("Stub!"); } 
/*  42 */   public void setAccessibilityFocused(boolean focused) { throw new RuntimeException("Stub!"); } 
/*  43 */   public boolean isSelected() { throw new RuntimeException("Stub!"); } 
/*  44 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/*  45 */   public boolean isClickable() { throw new RuntimeException("Stub!"); } 
/*  46 */   public void setClickable(boolean clickable) { throw new RuntimeException("Stub!"); } 
/*  47 */   public boolean isLongClickable() { throw new RuntimeException("Stub!"); } 
/*  48 */   public void setLongClickable(boolean longClickable) { throw new RuntimeException("Stub!"); } 
/*  49 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/*  50 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  51 */   public boolean isPassword() { throw new RuntimeException("Stub!"); } 
/*  52 */   public void setPassword(boolean password) { throw new RuntimeException("Stub!"); } 
/*  53 */   public boolean isScrollable() { throw new RuntimeException("Stub!"); } 
/*  54 */   public void setScrollable(boolean scrollable) { throw new RuntimeException("Stub!"); } 
/*  55 */   public boolean isEditable() { throw new RuntimeException("Stub!"); } 
/*  56 */   public void setEditable(boolean editable) { throw new RuntimeException("Stub!"); } 
/*  57 */   public CharSequence getPackageName() { throw new RuntimeException("Stub!"); } 
/*  58 */   public void setPackageName(CharSequence packageName) { throw new RuntimeException("Stub!"); } 
/*  59 */   public CharSequence getClassName() { throw new RuntimeException("Stub!"); } 
/*  60 */   public void setClassName(CharSequence className) { throw new RuntimeException("Stub!"); } 
/*  61 */   public CharSequence getText() { throw new RuntimeException("Stub!"); } 
/*  62 */   public void setText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/*  63 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); } 
/*  64 */   public void setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); } 
/*  65 */   public void setLabelFor(View labeled) { throw new RuntimeException("Stub!"); } 
/*  66 */   public void setLabelFor(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); } 
/*  67 */   public AccessibilityNodeInfo getLabelFor() { throw new RuntimeException("Stub!"); } 
/*  68 */   public void setLabeledBy(View label) { throw new RuntimeException("Stub!"); } 
/*  69 */   public void setLabeledBy(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); } 
/*  70 */   public AccessibilityNodeInfo getLabeledBy() { throw new RuntimeException("Stub!"); } 
/*  71 */   public void setViewIdResourceName(String viewIdResName) { throw new RuntimeException("Stub!"); } 
/*  72 */   public String getViewIdResourceName() { throw new RuntimeException("Stub!"); } 
/*  73 */   public int getTextSelectionStart() { throw new RuntimeException("Stub!"); } 
/*  74 */   public int getTextSelectionEnd() { throw new RuntimeException("Stub!"); } 
/*  75 */   public void setTextSelection(int start, int end) { throw new RuntimeException("Stub!"); } 
/*  76 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  77 */   public static AccessibilityNodeInfo obtain(View source) { throw new RuntimeException("Stub!"); } 
/*  78 */   public static AccessibilityNodeInfo obtain(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); } 
/*  79 */   public static AccessibilityNodeInfo obtain() { throw new RuntimeException("Stub!"); } 
/*  80 */   public static AccessibilityNodeInfo obtain(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/*  81 */   public void recycle() { throw new RuntimeException("Stub!"); } 
/*  82 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/*  83 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/*  84 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*  85 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.accessibility.AccessibilityNodeInfo
 * JD-Core Version:    0.6.2
 */