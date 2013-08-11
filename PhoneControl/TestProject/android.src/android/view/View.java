/*     */ package android.view;
/*     */ 
/*     */ import android.content.ClipData;
/*     */ import android.content.Context;
/*     */ import android.content.res.Configuration;
/*     */ import android.content.res.Resources;
/*     */ import android.content.res.TypedArray;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Matrix;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Point;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.graphics.drawable.Drawable.Callback;
/*     */ import android.os.Bundle;
/*     */ import android.os.Handler;
/*     */ import android.os.IBinder;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.Property;
/*     */ import android.util.SparseArray;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import android.view.accessibility.AccessibilityEventSource;
/*     */ import android.view.accessibility.AccessibilityNodeInfo;
/*     */ import android.view.accessibility.AccessibilityNodeProvider;
/*     */ import android.view.animation.Animation;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class View
/*     */   implements Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource
/*     */ {
/*     */   protected static final String VIEW_LOG_TAG = "View";
/*     */   public static final int NO_ID = -1;
/*     */   public static final int VISIBLE = 0;
/*     */   public static final int INVISIBLE = 4;
/*     */   public static final int GONE = 8;
/*     */   public static final int DRAWING_CACHE_QUALITY_LOW = 524288;
/*     */   public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;
/*     */   public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
/*     */   public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
/*     */   public static final int SCROLLBARS_INSIDE_INSET = 16777216;
/*     */   public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;
/*     */   public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;
/*     */   public static final int KEEP_SCREEN_ON = 67108864;
/*     */   public static final int SOUND_EFFECTS_ENABLED = 134217728;
/*     */   public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;
/*     */   public static final int FOCUSABLES_ALL = 0;
/*     */   public static final int FOCUSABLES_TOUCH_MODE = 1;
/*     */   public static final int FOCUS_BACKWARD = 1;
/*     */   public static final int FOCUS_FORWARD = 2;
/*     */   public static final int FOCUS_LEFT = 17;
/*     */   public static final int FOCUS_UP = 33;
/*     */   public static final int FOCUS_RIGHT = 66;
/*     */   public static final int FOCUS_DOWN = 130;
/*     */   public static final int MEASURED_SIZE_MASK = 16777215;
/*     */   public static final int MEASURED_STATE_MASK = -16777216;
/*     */   public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
/*     */   public static final int MEASURED_STATE_TOO_SMALL = 16777216;
/* 607 */   protected static final int[] EMPTY_STATE_SET = null;
/* 608 */   protected static final int[] ENABLED_STATE_SET = null;
/* 609 */   protected static final int[] FOCUSED_STATE_SET = null;
/* 610 */   protected static final int[] SELECTED_STATE_SET = null;
/* 611 */   protected static final int[] WINDOW_FOCUSED_STATE_SET = null;
/* 612 */   protected static final int[] ENABLED_FOCUSED_STATE_SET = null;
/* 613 */   protected static final int[] ENABLED_SELECTED_STATE_SET = null;
/* 614 */   protected static final int[] ENABLED_WINDOW_FOCUSED_STATE_SET = null;
/* 615 */   protected static final int[] FOCUSED_SELECTED_STATE_SET = null;
/* 616 */   protected static final int[] FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 617 */   protected static final int[] SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 618 */   protected static final int[] ENABLED_FOCUSED_SELECTED_STATE_SET = null;
/* 619 */   protected static final int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 620 */   protected static final int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 621 */   protected static final int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 622 */   protected static final int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 623 */   protected static final int[] PRESSED_WINDOW_FOCUSED_STATE_SET = null;
/* 624 */   protected static final int[] PRESSED_SELECTED_STATE_SET = null;
/* 625 */   protected static final int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 626 */   protected static final int[] PRESSED_FOCUSED_STATE_SET = null;
/* 627 */   protected static final int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 628 */   protected static final int[] PRESSED_FOCUSED_SELECTED_STATE_SET = null;
/* 629 */   protected static final int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 630 */   protected static final int[] PRESSED_ENABLED_STATE_SET = null;
/* 631 */   protected static final int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = null;
/* 632 */   protected static final int[] PRESSED_ENABLED_SELECTED_STATE_SET = null;
/* 633 */   protected static final int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 634 */   protected static final int[] PRESSED_ENABLED_FOCUSED_STATE_SET = null;
/* 635 */   protected static final int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 636 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = null;
/* 637 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/*     */   public static final int LAYOUT_DIRECTION_LTR = 0;
/*     */   public static final int LAYOUT_DIRECTION_RTL = 1;
/*     */   public static final int LAYOUT_DIRECTION_INHERIT = 2;
/*     */   public static final int LAYOUT_DIRECTION_LOCALE = 3;
/*     */   public static final int TEXT_DIRECTION_INHERIT = 0;
/*     */   public static final int TEXT_DIRECTION_FIRST_STRONG = 1;
/*     */   public static final int TEXT_DIRECTION_ANY_RTL = 2;
/*     */   public static final int TEXT_DIRECTION_LTR = 3;
/*     */   public static final int TEXT_DIRECTION_RTL = 4;
/*     */   public static final int TEXT_DIRECTION_LOCALE = 5;
/*     */   public static final int TEXT_ALIGNMENT_INHERIT = 0;
/*     */   public static final int TEXT_ALIGNMENT_GRAVITY = 1;
/*     */   public static final int TEXT_ALIGNMENT_TEXT_START = 2;
/*     */   public static final int TEXT_ALIGNMENT_TEXT_END = 3;
/*     */   public static final int TEXT_ALIGNMENT_CENTER = 4;
/*     */   public static final int TEXT_ALIGNMENT_VIEW_START = 5;
/*     */   public static final int TEXT_ALIGNMENT_VIEW_END = 6;
/*     */   public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
/*     */   public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
/*     */   public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
/*     */   public static final int OVER_SCROLL_ALWAYS = 0;
/*     */   public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
/*     */   public static final int OVER_SCROLL_NEVER = 2;
/*     */   public static final int SYSTEM_UI_FLAG_VISIBLE = 0;
/*     */   public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 1;
/*     */   public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 2;
/*     */   public static final int SYSTEM_UI_FLAG_FULLSCREEN = 4;
/*     */   public static final int SYSTEM_UI_FLAG_LAYOUT_STABLE = 256;
/*     */   public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = 512;
/*     */   public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = 1024;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int STATUS_BAR_HIDDEN = 1;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int STATUS_BAR_VISIBLE = 0;
/*     */   public static final int SYSTEM_UI_LAYOUT_FLAGS = 1536;
/*     */   public static final int FIND_VIEWS_WITH_TEXT = 1;
/*     */   public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 2;
/*     */   public static final int SCREEN_STATE_OFF = 0;
/*     */   public static final int SCREEN_STATE_ON = 1;
/*     */   public static final int SCROLLBAR_POSITION_DEFAULT = 0;
/*     */   public static final int SCROLLBAR_POSITION_LEFT = 1;
/*     */   public static final int SCROLLBAR_POSITION_RIGHT = 2;
/*     */   public static final int LAYER_TYPE_NONE = 0;
/*     */   public static final int LAYER_TYPE_SOFTWARE = 1;
/*     */   public static final int LAYER_TYPE_HARDWARE = 2;
/* 693 */   public static final Property<View, Float> ALPHA = null; public static final Property<View, Float> TRANSLATION_X = null; public static final Property<View, Float> TRANSLATION_Y = null; public static final Property<View, Float> X = null; public static final Property<View, Float> Y = null; public static final Property<View, Float> ROTATION = null; public static final Property<View, Float> ROTATION_X = null; public static final Property<View, Float> ROTATION_Y = null; public static final Property<View, Float> SCALE_X = null; public static final Property<View, Float> SCALE_Y = null;
/*     */ 
/*     */   public View(Context context)
/*     */   {
/*  95 */     throw new RuntimeException("Stub!"); } 
/*  96 */   public View(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/*  97 */   public View(Context context, AttributeSet attrs, int defStyle) { throw new RuntimeException("Stub!"); } 
/*  98 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  99 */   protected void initializeFadingEdge(TypedArray a) { throw new RuntimeException("Stub!"); } 
/* 100 */   public int getVerticalFadingEdgeLength() { throw new RuntimeException("Stub!"); } 
/* 101 */   public void setFadingEdgeLength(int length) { throw new RuntimeException("Stub!"); } 
/* 102 */   public int getHorizontalFadingEdgeLength() { throw new RuntimeException("Stub!"); } 
/* 103 */   public int getVerticalScrollbarWidth() { throw new RuntimeException("Stub!"); } 
/* 104 */   protected int getHorizontalScrollbarHeight() { throw new RuntimeException("Stub!"); } 
/* 105 */   protected void initializeScrollbars(TypedArray a) { throw new RuntimeException("Stub!"); } 
/* 106 */   public void setVerticalScrollbarPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 107 */   public int getVerticalScrollbarPosition() { throw new RuntimeException("Stub!"); } 
/* 108 */   public void setOnFocusChangeListener(OnFocusChangeListener l) { throw new RuntimeException("Stub!"); } 
/* 109 */   public void addOnLayoutChangeListener(OnLayoutChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 110 */   public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 111 */   public void addOnAttachStateChangeListener(OnAttachStateChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 112 */   public void removeOnAttachStateChangeListener(OnAttachStateChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 113 */   public OnFocusChangeListener getOnFocusChangeListener() { throw new RuntimeException("Stub!"); } 
/* 114 */   public void setOnClickListener(OnClickListener l) { throw new RuntimeException("Stub!"); } 
/* 115 */   public boolean hasOnClickListeners() { throw new RuntimeException("Stub!"); } 
/* 116 */   public void setOnLongClickListener(OnLongClickListener l) { throw new RuntimeException("Stub!"); } 
/* 117 */   public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) { throw new RuntimeException("Stub!"); } 
/* 118 */   public boolean performClick() { throw new RuntimeException("Stub!"); } 
/* 119 */   public boolean callOnClick() { throw new RuntimeException("Stub!"); } 
/* 120 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); } 
/* 121 */   public boolean showContextMenu() { throw new RuntimeException("Stub!"); } 
/* 122 */   public ActionMode startActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); } 
/* 123 */   public void setOnKeyListener(OnKeyListener l) { throw new RuntimeException("Stub!"); } 
/* 124 */   public void setOnTouchListener(OnTouchListener l) { throw new RuntimeException("Stub!"); } 
/* 125 */   public void setOnGenericMotionListener(OnGenericMotionListener l) { throw new RuntimeException("Stub!"); } 
/* 126 */   public void setOnHoverListener(OnHoverListener l) { throw new RuntimeException("Stub!"); } 
/* 127 */   public void setOnDragListener(OnDragListener l) { throw new RuntimeException("Stub!"); } 
/* 128 */   public boolean requestRectangleOnScreen(Rect rectangle) { throw new RuntimeException("Stub!"); } 
/* 129 */   public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); } 
/* 130 */   public void clearFocus() { throw new RuntimeException("Stub!"); } 
/* 132 */   @ViewDebug.ExportedProperty(category="focus")
/*     */   public boolean hasFocus() { throw new RuntimeException("Stub!"); } 
/* 133 */   public boolean hasFocusable() { throw new RuntimeException("Stub!"); } 
/* 134 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 135 */   public void sendAccessibilityEvent(int eventType) { throw new RuntimeException("Stub!"); } 
/* 136 */   public void announceForAccessibility(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 137 */   public void sendAccessibilityEventUnchecked(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 138 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 139 */   public void onPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 140 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 141 */   public AccessibilityNodeInfo createAccessibilityNodeInfo() { throw new RuntimeException("Stub!"); } 
/* 142 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 143 */   public void setAccessibilityDelegate(AccessibilityDelegate delegate) { throw new RuntimeException("Stub!"); } 
/* 144 */   public AccessibilityNodeProvider getAccessibilityNodeProvider() { throw new RuntimeException("Stub!"); } 
/* 146 */   @ViewDebug.ExportedProperty(category="accessibility")
/*     */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); } 
/* 147 */   public void setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); } 
/* 149 */   @ViewDebug.ExportedProperty(category="accessibility")
/*     */   public int getLabelFor() { throw new RuntimeException("Stub!"); } 
/* 150 */   public void setLabelFor(int id) { throw new RuntimeException("Stub!"); } 
/* 152 */   @ViewDebug.ExportedProperty(category="focus")
/*     */   public boolean isFocused() { throw new RuntimeException("Stub!"); } 
/* 153 */   public View findFocus() { throw new RuntimeException("Stub!"); } 
/* 154 */   public boolean isScrollContainer() { throw new RuntimeException("Stub!"); } 
/* 155 */   public void setScrollContainer(boolean isScrollContainer) { throw new RuntimeException("Stub!"); } 
/* 156 */   public int getDrawingCacheQuality() { throw new RuntimeException("Stub!"); } 
/* 157 */   public void setDrawingCacheQuality(int quality) { throw new RuntimeException("Stub!"); } 
/* 158 */   public boolean getKeepScreenOn() { throw new RuntimeException("Stub!"); } 
/* 159 */   public void setKeepScreenOn(boolean keepScreenOn) { throw new RuntimeException("Stub!"); } 
/* 160 */   public int getNextFocusLeftId() { throw new RuntimeException("Stub!"); } 
/* 161 */   public void setNextFocusLeftId(int nextFocusLeftId) { throw new RuntimeException("Stub!"); } 
/* 162 */   public int getNextFocusRightId() { throw new RuntimeException("Stub!"); } 
/* 163 */   public void setNextFocusRightId(int nextFocusRightId) { throw new RuntimeException("Stub!"); } 
/* 164 */   public int getNextFocusUpId() { throw new RuntimeException("Stub!"); } 
/* 165 */   public void setNextFocusUpId(int nextFocusUpId) { throw new RuntimeException("Stub!"); } 
/* 166 */   public int getNextFocusDownId() { throw new RuntimeException("Stub!"); } 
/* 167 */   public void setNextFocusDownId(int nextFocusDownId) { throw new RuntimeException("Stub!"); } 
/* 168 */   public int getNextFocusForwardId() { throw new RuntimeException("Stub!"); } 
/* 169 */   public void setNextFocusForwardId(int nextFocusForwardId) { throw new RuntimeException("Stub!"); } 
/* 170 */   public boolean isShown() { throw new RuntimeException("Stub!"); } 
/* 171 */   protected boolean fitSystemWindows(Rect insets) { throw new RuntimeException("Stub!"); } 
/* 172 */   public void setFitsSystemWindows(boolean fitSystemWindows) { throw new RuntimeException("Stub!"); } 
/* 173 */   public boolean getFitsSystemWindows() { throw new RuntimeException("Stub!"); } 
/* 174 */   public void requestFitSystemWindows() { throw new RuntimeException("Stub!"); } 
/* 176 */   @ViewDebug.ExportedProperty(mapping={@ViewDebug.IntToString(from=0, to="VISIBLE"), @ViewDebug.IntToString(from=4, to="INVISIBLE"), @ViewDebug.IntToString(from=8, to="GONE")})
/*     */   public int getVisibility() { throw new RuntimeException("Stub!"); } 
/* 177 */   public void setVisibility(int visibility) { throw new RuntimeException("Stub!"); } 
/* 179 */   @ViewDebug.ExportedProperty
/*     */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 180 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 181 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); } 
/* 182 */   public void setFocusableInTouchMode(boolean focusableInTouchMode) { throw new RuntimeException("Stub!"); } 
/* 183 */   public void setSoundEffectsEnabled(boolean soundEffectsEnabled) { throw new RuntimeException("Stub!"); } 
/* 185 */   @ViewDebug.ExportedProperty
/*     */   public boolean isSoundEffectsEnabled() { throw new RuntimeException("Stub!"); } 
/* 186 */   public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) { throw new RuntimeException("Stub!"); } 
/* 188 */   @ViewDebug.ExportedProperty
/*     */   public boolean isHapticFeedbackEnabled() { throw new RuntimeException("Stub!"); } 
/* 189 */   public void setLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); } 
/* 191 */   @ViewDebug.ExportedProperty(category="layout", mapping={@ViewDebug.IntToString(from=0, to="RESOLVED_DIRECTION_LTR"), @ViewDebug.IntToString(from=1, to="RESOLVED_DIRECTION_RTL")})
/*     */   public int getLayoutDirection() { throw new RuntimeException("Stub!"); } 
/* 193 */   @ViewDebug.ExportedProperty(category="layout")
/*     */   public boolean hasTransientState() { throw new RuntimeException("Stub!"); } 
/* 194 */   public void setHasTransientState(boolean hasTransientState) { throw new RuntimeException("Stub!"); } 
/* 195 */   public void setWillNotDraw(boolean willNotDraw) { throw new RuntimeException("Stub!"); } 
/* 197 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public boolean willNotDraw() { throw new RuntimeException("Stub!"); } 
/* 198 */   public void setWillNotCacheDrawing(boolean willNotCacheDrawing) { throw new RuntimeException("Stub!"); } 
/* 200 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public boolean willNotCacheDrawing() { throw new RuntimeException("Stub!"); } 
/* 202 */   @ViewDebug.ExportedProperty
/*     */   public boolean isClickable() { throw new RuntimeException("Stub!"); } 
/* 203 */   public void setClickable(boolean clickable) { throw new RuntimeException("Stub!"); } 
/* 204 */   public boolean isLongClickable() { throw new RuntimeException("Stub!"); } 
/* 205 */   public void setLongClickable(boolean longClickable) { throw new RuntimeException("Stub!"); } 
/* 206 */   public void setPressed(boolean pressed) { throw new RuntimeException("Stub!"); } 
/* 207 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); } 
/* 208 */   public boolean isPressed() { throw new RuntimeException("Stub!"); } 
/* 209 */   public boolean isSaveEnabled() { throw new RuntimeException("Stub!"); } 
/* 210 */   public void setSaveEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 212 */   @ViewDebug.ExportedProperty
/*     */   public boolean getFilterTouchesWhenObscured() { throw new RuntimeException("Stub!"); } 
/* 213 */   public void setFilterTouchesWhenObscured(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 214 */   public boolean isSaveFromParentEnabled() { throw new RuntimeException("Stub!"); } 
/* 215 */   public void setSaveFromParentEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 217 */   @ViewDebug.ExportedProperty(category="focus")
/*     */   public final boolean isFocusable() { throw new RuntimeException("Stub!"); } 
/* 219 */   @ViewDebug.ExportedProperty
/*     */   public final boolean isFocusableInTouchMode() { throw new RuntimeException("Stub!"); } 
/* 220 */   public View focusSearch(int direction) { throw new RuntimeException("Stub!"); } 
/* 221 */   public boolean dispatchUnhandledMove(View focused, int direction) { throw new RuntimeException("Stub!"); } 
/* 222 */   public ArrayList<View> getFocusables(int direction) { throw new RuntimeException("Stub!"); } 
/* 223 */   public void addFocusables(ArrayList<View> views, int direction) { throw new RuntimeException("Stub!"); } 
/* 224 */   public void addFocusables(ArrayList<View> views, int direction, int focusableMode) { throw new RuntimeException("Stub!"); } 
/* 225 */   public void findViewsWithText(ArrayList<View> outViews, CharSequence searched, int flags) { throw new RuntimeException("Stub!"); } 
/* 226 */   public ArrayList<View> getTouchables() { throw new RuntimeException("Stub!"); } 
/* 227 */   public void addTouchables(ArrayList<View> views) { throw new RuntimeException("Stub!"); } 
/* 228 */   public final boolean requestFocus() { throw new RuntimeException("Stub!"); } 
/* 229 */   public final boolean requestFocus(int direction) { throw new RuntimeException("Stub!"); } 
/* 230 */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 231 */   public final boolean requestFocusFromTouch() { throw new RuntimeException("Stub!"); } 
/* 233 */   @ViewDebug.ExportedProperty(category="accessibility", mapping={@ViewDebug.IntToString(from=0, to="auto"), @ViewDebug.IntToString(from=1, to="yes"), @ViewDebug.IntToString(from=2, to="no")})
/*     */   public int getImportantForAccessibility() { throw new RuntimeException("Stub!"); } 
/* 234 */   public void setImportantForAccessibility(int mode) { throw new RuntimeException("Stub!"); } 
/* 235 */   public ViewParent getParentForAccessibility() { throw new RuntimeException("Stub!"); } 
/* 236 */   public void addChildrenForAccessibility(ArrayList<View> children) { throw new RuntimeException("Stub!"); } 
/* 237 */   public boolean performAccessibilityAction(int action, Bundle arguments) { throw new RuntimeException("Stub!"); } 
/* 238 */   public void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 239 */   public void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 240 */   public KeyEvent.DispatcherState getKeyDispatcherState() { throw new RuntimeException("Stub!"); } 
/* 241 */   public boolean dispatchKeyEventPreIme(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 242 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 243 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 244 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 245 */   public boolean onFilterTouchEventForSecurity(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 246 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 247 */   public boolean dispatchGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 248 */   protected boolean dispatchHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 249 */   protected boolean dispatchGenericPointerEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 250 */   protected boolean dispatchGenericFocusedEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 251 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/* 252 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); } 
/* 253 */   public boolean hasWindowFocus() { throw new RuntimeException("Stub!"); } 
/* 254 */   protected void dispatchVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 255 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 256 */   public void dispatchDisplayHint(int hint) { throw new RuntimeException("Stub!"); } 
/* 257 */   protected void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); } 
/* 258 */   public void dispatchWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); } 
/* 259 */   protected void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); } 
/* 260 */   public int getWindowVisibility() { throw new RuntimeException("Stub!"); } 
/* 261 */   public void getWindowVisibleDisplayFrame(Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 262 */   public void dispatchConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 263 */   protected void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 265 */   @ViewDebug.ExportedProperty
/*     */   public boolean isInTouchMode() { throw new RuntimeException("Stub!"); } 
/* 267 */   @ViewDebug.CapturedViewProperty
/*     */   public final Context getContext() { throw new RuntimeException("Stub!"); } 
/* 268 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 269 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 270 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 271 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 272 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 273 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 274 */   public boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); } 
/* 275 */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) { throw new RuntimeException("Stub!"); } 
/* 276 */   public boolean checkInputConnectionProxy(View view) { throw new RuntimeException("Stub!"); } 
/* 277 */   public void createContextMenu(ContextMenu menu) { throw new RuntimeException("Stub!"); } 
/* 278 */   protected ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); } 
/* 279 */   protected void onCreateContextMenu(ContextMenu menu) { throw new RuntimeException("Stub!"); } 
/* 280 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 281 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 282 */   public boolean onHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 284 */   @ViewDebug.ExportedProperty
/*     */   public boolean isHovered() { throw new RuntimeException("Stub!"); } 
/* 285 */   public void setHovered(boolean hovered) { throw new RuntimeException("Stub!"); } 
/* 286 */   public void onHoverChanged(boolean hovered) { throw new RuntimeException("Stub!"); } 
/* 287 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 288 */   public void cancelLongPress() { throw new RuntimeException("Stub!"); } 
/* 289 */   public void setTouchDelegate(TouchDelegate delegate) { throw new RuntimeException("Stub!"); } 
/* 290 */   public TouchDelegate getTouchDelegate() { throw new RuntimeException("Stub!"); } 
/* 291 */   public void bringToFront() { throw new RuntimeException("Stub!"); } 
/* 292 */   protected void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); } 
/* 293 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 294 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 295 */   public final ViewParent getParent() { throw new RuntimeException("Stub!"); } 
/* 296 */   public void setScrollX(int value) { throw new RuntimeException("Stub!"); } 
/* 297 */   public void setScrollY(int value) { throw new RuntimeException("Stub!"); } 
/* 298 */   public final int getScrollX() { throw new RuntimeException("Stub!"); } 
/* 299 */   public final int getScrollY() { throw new RuntimeException("Stub!"); } 
/* 301 */   @ViewDebug.ExportedProperty(category="layout")
/*     */   public final int getWidth() { throw new RuntimeException("Stub!"); } 
/* 303 */   @ViewDebug.ExportedProperty(category="layout")
/*     */   public final int getHeight() { throw new RuntimeException("Stub!"); } 
/* 304 */   public void getDrawingRect(Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 305 */   public final int getMeasuredWidth() { throw new RuntimeException("Stub!"); } 
/* 306 */   public final int getMeasuredWidthAndState() { throw new RuntimeException("Stub!"); } 
/* 307 */   public final int getMeasuredHeight() { throw new RuntimeException("Stub!"); } 
/* 308 */   public final int getMeasuredHeightAndState() { throw new RuntimeException("Stub!"); } 
/* 309 */   public final int getMeasuredState() { throw new RuntimeException("Stub!"); } 
/* 310 */   public Matrix getMatrix() { throw new RuntimeException("Stub!"); } 
/* 311 */   public float getCameraDistance() { throw new RuntimeException("Stub!"); } 
/* 312 */   public void setCameraDistance(float distance) { throw new RuntimeException("Stub!"); } 
/* 314 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getRotation() { throw new RuntimeException("Stub!"); } 
/* 315 */   public void setRotation(float rotation) { throw new RuntimeException("Stub!"); } 
/* 317 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getRotationY() { throw new RuntimeException("Stub!"); } 
/* 318 */   public void setRotationY(float rotationY) { throw new RuntimeException("Stub!"); } 
/* 320 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getRotationX() { throw new RuntimeException("Stub!"); } 
/* 321 */   public void setRotationX(float rotationX) { throw new RuntimeException("Stub!"); } 
/* 323 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getScaleX() { throw new RuntimeException("Stub!"); } 
/* 324 */   public void setScaleX(float scaleX) { throw new RuntimeException("Stub!"); } 
/* 326 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getScaleY() { throw new RuntimeException("Stub!"); } 
/* 327 */   public void setScaleY(float scaleY) { throw new RuntimeException("Stub!"); } 
/* 329 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getPivotX() { throw new RuntimeException("Stub!"); } 
/* 330 */   public void setPivotX(float pivotX) { throw new RuntimeException("Stub!"); } 
/* 332 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getPivotY() { throw new RuntimeException("Stub!"); } 
/* 333 */   public void setPivotY(float pivotY) { throw new RuntimeException("Stub!"); } 
/* 335 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getAlpha() { throw new RuntimeException("Stub!"); } 
/* 336 */   public boolean hasOverlappingRendering() { throw new RuntimeException("Stub!"); } 
/* 337 */   public void setAlpha(float alpha) { throw new RuntimeException("Stub!"); } 
/* 339 */   @ViewDebug.CapturedViewProperty
/*     */   public final int getTop() { throw new RuntimeException("Stub!"); } 
/* 340 */   public final void setTop(int top) { throw new RuntimeException("Stub!"); } 
/* 342 */   @ViewDebug.CapturedViewProperty
/*     */   public final int getBottom() { throw new RuntimeException("Stub!"); } 
/* 343 */   public boolean isDirty() { throw new RuntimeException("Stub!"); } 
/* 344 */   public final void setBottom(int bottom) { throw new RuntimeException("Stub!"); } 
/* 346 */   @ViewDebug.CapturedViewProperty
/*     */   public final int getLeft() { throw new RuntimeException("Stub!"); } 
/* 347 */   public final void setLeft(int left) { throw new RuntimeException("Stub!"); } 
/* 349 */   @ViewDebug.CapturedViewProperty
/*     */   public final int getRight() { throw new RuntimeException("Stub!"); } 
/* 350 */   public final void setRight(int right) { throw new RuntimeException("Stub!"); } 
/* 352 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getX() { throw new RuntimeException("Stub!"); } 
/* 353 */   public void setX(float x) { throw new RuntimeException("Stub!"); } 
/* 355 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getY() { throw new RuntimeException("Stub!"); } 
/* 356 */   public void setY(float y) { throw new RuntimeException("Stub!"); } 
/* 358 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getTranslationX() { throw new RuntimeException("Stub!"); } 
/* 359 */   public void setTranslationX(float translationX) { throw new RuntimeException("Stub!"); } 
/* 361 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public float getTranslationY() { throw new RuntimeException("Stub!"); } 
/* 362 */   public void setTranslationY(float translationY) { throw new RuntimeException("Stub!"); } 
/* 363 */   public void getHitRect(Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 364 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 365 */   public boolean getGlobalVisibleRect(Rect r, Point globalOffset) { throw new RuntimeException("Stub!"); } 
/* 366 */   public final boolean getGlobalVisibleRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 367 */   public final boolean getLocalVisibleRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 368 */   public void offsetTopAndBottom(int offset) { throw new RuntimeException("Stub!"); } 
/* 369 */   public void offsetLeftAndRight(int offset) { throw new RuntimeException("Stub!"); } 
/* 371 */   @ViewDebug.ExportedProperty(deepExport=true, prefix="layout_")
/*     */   public ViewGroup.LayoutParams getLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 372 */   public void setLayoutParams(ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 373 */   public void scrollTo(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 374 */   public void scrollBy(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 375 */   protected boolean awakenScrollBars() { throw new RuntimeException("Stub!"); } 
/* 376 */   protected boolean awakenScrollBars(int startDelay) { throw new RuntimeException("Stub!"); } 
/* 377 */   protected boolean awakenScrollBars(int startDelay, boolean invalidate) { throw new RuntimeException("Stub!"); } 
/* 378 */   public void invalidate(Rect dirty) { throw new RuntimeException("Stub!"); } 
/* 379 */   public void invalidate(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 380 */   public void invalidate() { throw new RuntimeException("Stub!"); } 
/* 382 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public boolean isOpaque() { throw new RuntimeException("Stub!"); } 
/* 383 */   public Handler getHandler() { throw new RuntimeException("Stub!"); } 
/* 384 */   public boolean post(Runnable action) { throw new RuntimeException("Stub!"); } 
/* 385 */   public boolean postDelayed(Runnable action, long delayMillis) { throw new RuntimeException("Stub!"); } 
/* 386 */   public void postOnAnimation(Runnable action) { throw new RuntimeException("Stub!"); } 
/* 387 */   public void postOnAnimationDelayed(Runnable action, long delayMillis) { throw new RuntimeException("Stub!"); } 
/* 388 */   public boolean removeCallbacks(Runnable action) { throw new RuntimeException("Stub!"); } 
/* 389 */   public void postInvalidate() { throw new RuntimeException("Stub!"); } 
/* 390 */   public void postInvalidate(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 391 */   public void postInvalidateDelayed(long delayMilliseconds) { throw new RuntimeException("Stub!"); } 
/* 392 */   public void postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 393 */   public void postInvalidateOnAnimation() { throw new RuntimeException("Stub!"); } 
/* 394 */   public void postInvalidateOnAnimation(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 395 */   public void computeScroll() { throw new RuntimeException("Stub!"); } 
/* 396 */   public boolean isHorizontalFadingEdgeEnabled() { throw new RuntimeException("Stub!"); } 
/* 397 */   public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) { throw new RuntimeException("Stub!"); } 
/* 398 */   public boolean isVerticalFadingEdgeEnabled() { throw new RuntimeException("Stub!"); } 
/* 399 */   public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) { throw new RuntimeException("Stub!"); } 
/* 400 */   protected float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 401 */   protected float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 402 */   protected float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 403 */   protected float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 404 */   public boolean isHorizontalScrollBarEnabled() { throw new RuntimeException("Stub!"); } 
/* 405 */   public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) { throw new RuntimeException("Stub!"); } 
/* 406 */   public boolean isVerticalScrollBarEnabled() { throw new RuntimeException("Stub!"); } 
/* 407 */   public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) { throw new RuntimeException("Stub!"); } 
/* 408 */   public void setScrollbarFadingEnabled(boolean fadeScrollbars) { throw new RuntimeException("Stub!"); } 
/* 409 */   public boolean isScrollbarFadingEnabled() { throw new RuntimeException("Stub!"); } 
/* 410 */   public int getScrollBarDefaultDelayBeforeFade() { throw new RuntimeException("Stub!"); } 
/* 411 */   public void setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) { throw new RuntimeException("Stub!"); } 
/* 412 */   public int getScrollBarFadeDuration() { throw new RuntimeException("Stub!"); } 
/* 413 */   public void setScrollBarFadeDuration(int scrollBarFadeDuration) { throw new RuntimeException("Stub!"); } 
/* 414 */   public int getScrollBarSize() { throw new RuntimeException("Stub!"); } 
/* 415 */   public void setScrollBarSize(int scrollBarSize) { throw new RuntimeException("Stub!"); } 
/* 416 */   public void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); } 
/* 418 */   @ViewDebug.ExportedProperty(mapping={@ViewDebug.IntToString(from=0, to="INSIDE_OVERLAY"), @ViewDebug.IntToString(from=16777216, to="INSIDE_INSET"), @ViewDebug.IntToString(from=33554432, to="OUTSIDE_OVERLAY"), @ViewDebug.IntToString(from=50331648, to="OUTSIDE_INSET")})
/*     */   public int getScrollBarStyle() { throw new RuntimeException("Stub!"); } 
/* 419 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 420 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 421 */   protected int computeHorizontalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 422 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 423 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 424 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 425 */   public boolean canScrollHorizontally(int direction) { throw new RuntimeException("Stub!"); } 
/* 426 */   public boolean canScrollVertically(int direction) { throw new RuntimeException("Stub!"); } 
/* 427 */   protected final void onDrawScrollBars(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 428 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 429 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 430 */   public void onScreenStateChanged(int screenState) { throw new RuntimeException("Stub!"); } 
/* 431 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); } 
/* 432 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 433 */   protected int getWindowAttachCount() { throw new RuntimeException("Stub!"); } 
/* 434 */   public IBinder getWindowToken() { throw new RuntimeException("Stub!"); } 
/* 435 */   public WindowId getWindowId() { throw new RuntimeException("Stub!"); } 
/* 436 */   public IBinder getApplicationWindowToken() { throw new RuntimeException("Stub!"); } 
/* 437 */   public Display getDisplay() { throw new RuntimeException("Stub!"); } 
/* 438 */   public void saveHierarchyState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 439 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 440 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 441 */   public void restoreHierarchyState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 442 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 443 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 444 */   public long getDrawingTime() { throw new RuntimeException("Stub!"); } 
/* 445 */   public void setDuplicateParentStateEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 446 */   public boolean isDuplicateParentStateEnabled() { throw new RuntimeException("Stub!"); } 
/* 447 */   public void setLayerType(int layerType, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 448 */   public void setLayerPaint(Paint paint) { throw new RuntimeException("Stub!"); } 
/* 449 */   public int getLayerType() { throw new RuntimeException("Stub!"); } 
/* 450 */   public void buildLayer() { throw new RuntimeException("Stub!"); } 
/* 451 */   public void setDrawingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 453 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public boolean isDrawingCacheEnabled() { throw new RuntimeException("Stub!"); } 
/* 454 */   public Bitmap getDrawingCache() { throw new RuntimeException("Stub!"); } 
/* 455 */   public Bitmap getDrawingCache(boolean autoScale) { throw new RuntimeException("Stub!"); } 
/* 456 */   public void destroyDrawingCache() { throw new RuntimeException("Stub!"); } 
/* 457 */   public void setDrawingCacheBackgroundColor(int color) { throw new RuntimeException("Stub!"); } 
/* 458 */   public int getDrawingCacheBackgroundColor() { throw new RuntimeException("Stub!"); } 
/* 459 */   public void buildDrawingCache() { throw new RuntimeException("Stub!"); } 
/* 460 */   public void buildDrawingCache(boolean autoScale) { throw new RuntimeException("Stub!"); } 
/* 461 */   public boolean isInEditMode() { throw new RuntimeException("Stub!"); } 
/* 462 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); } 
/* 463 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 464 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 465 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 466 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 467 */   public boolean isHardwareAccelerated() { throw new RuntimeException("Stub!"); } 
/* 468 */   public void setClipBounds(Rect clipBounds) { throw new RuntimeException("Stub!"); } 
/* 469 */   public Rect getClipBounds() { throw new RuntimeException("Stub!"); } 
/* 470 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 471 */   public ViewOverlay getOverlay() { throw new RuntimeException("Stub!"); } 
/* 473 */   @ViewDebug.ExportedProperty(category="drawing")
/*     */   public int getSolidColor() { throw new RuntimeException("Stub!"); } 
/* 474 */   public boolean isLayoutRequested() { throw new RuntimeException("Stub!"); } 
/*     */   public void layout(int l, int t, int r, int b) {
/* 476 */     throw new RuntimeException("Stub!"); } 
/* 477 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 478 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); } 
/* 479 */   public Resources getResources() { throw new RuntimeException("Stub!"); } 
/* 480 */   public void invalidateDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 481 */   public void scheduleDrawable(Drawable who, Runnable what, long when) { throw new RuntimeException("Stub!"); } 
/* 482 */   public void unscheduleDrawable(Drawable who, Runnable what) { throw new RuntimeException("Stub!"); } 
/* 483 */   public void unscheduleDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 484 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 485 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 486 */   public void refreshDrawableState() { throw new RuntimeException("Stub!"); } 
/* 487 */   public final int[] getDrawableState() { throw new RuntimeException("Stub!"); } 
/* 488 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 489 */   protected static int[] mergeDrawableStates(int[] baseState, int[] additionalState) { throw new RuntimeException("Stub!"); } 
/* 490 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 491 */   public void setBackgroundColor(int color) { throw new RuntimeException("Stub!"); } 
/* 492 */   public void setBackgroundResource(int resid) { throw new RuntimeException("Stub!"); } 
/* 493 */   public void setBackground(Drawable background) { throw new RuntimeException("Stub!"); } 
/* 495 */   @Deprecated
/*     */   public void setBackgroundDrawable(Drawable background) { throw new RuntimeException("Stub!"); } 
/* 496 */   public Drawable getBackground() { throw new RuntimeException("Stub!"); } 
/* 497 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 498 */   public void setPaddingRelative(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); } 
/* 499 */   public int getPaddingTop() { throw new RuntimeException("Stub!"); } 
/* 500 */   public int getPaddingBottom() { throw new RuntimeException("Stub!"); } 
/* 501 */   public int getPaddingLeft() { throw new RuntimeException("Stub!"); } 
/* 502 */   public int getPaddingStart() { throw new RuntimeException("Stub!"); } 
/* 503 */   public int getPaddingRight() { throw new RuntimeException("Stub!"); } 
/* 504 */   public int getPaddingEnd() { throw new RuntimeException("Stub!"); } 
/* 505 */   public boolean isPaddingRelative() { throw new RuntimeException("Stub!"); } 
/* 506 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 507 */   protected void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 509 */   @ViewDebug.ExportedProperty
/*     */   public boolean isSelected() { throw new RuntimeException("Stub!"); } 
/* 510 */   public void setActivated(boolean activated) { throw new RuntimeException("Stub!"); } 
/* 511 */   protected void dispatchSetActivated(boolean activated) { throw new RuntimeException("Stub!"); } 
/* 513 */   @ViewDebug.ExportedProperty
/*     */   public boolean isActivated() { throw new RuntimeException("Stub!"); } 
/* 514 */   public ViewTreeObserver getViewTreeObserver() { throw new RuntimeException("Stub!"); } 
/* 515 */   public View getRootView() { throw new RuntimeException("Stub!"); } 
/* 516 */   public void getLocationOnScreen(int[] location) { throw new RuntimeException("Stub!"); } 
/* 517 */   public void getLocationInWindow(int[] location) { throw new RuntimeException("Stub!"); } 
/* 518 */   public final View findViewById(int id) { throw new RuntimeException("Stub!"); } 
/* 519 */   public final View findViewWithTag(Object tag) { throw new RuntimeException("Stub!"); } 
/* 520 */   public void setId(int id) { throw new RuntimeException("Stub!"); } 
/* 522 */   @ViewDebug.CapturedViewProperty
/*     */   public int getId() { throw new RuntimeException("Stub!"); } 
/* 524 */   @ViewDebug.ExportedProperty
/*     */   public Object getTag() { throw new RuntimeException("Stub!"); } 
/* 525 */   public void setTag(Object tag) { throw new RuntimeException("Stub!"); } 
/* 526 */   public Object getTag(int key) { throw new RuntimeException("Stub!"); } 
/* 527 */   public void setTag(int key, Object tag) { throw new RuntimeException("Stub!"); } 
/* 529 */   @ViewDebug.ExportedProperty(category="layout")
/*     */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 530 */   public boolean isInLayout() { throw new RuntimeException("Stub!"); } 
/* 531 */   public void requestLayout() { throw new RuntimeException("Stub!"); } 
/* 532 */   public void forceLayout() { throw new RuntimeException("Stub!"); } 
/* 533 */   public final void measure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 534 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 535 */   protected final void setMeasuredDimension(int measuredWidth, int measuredHeight) { throw new RuntimeException("Stub!"); } 
/* 536 */   public static int combineMeasuredStates(int curState, int newState) { throw new RuntimeException("Stub!"); } 
/* 537 */   public static int resolveSize(int size, int measureSpec) { throw new RuntimeException("Stub!"); } 
/* 538 */   public static int resolveSizeAndState(int size, int measureSpec, int childMeasuredState) { throw new RuntimeException("Stub!"); } 
/* 539 */   public static int getDefaultSize(int size, int measureSpec) { throw new RuntimeException("Stub!"); } 
/* 540 */   protected int getSuggestedMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 541 */   protected int getSuggestedMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 542 */   public int getMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 543 */   public void setMinimumHeight(int minHeight) { throw new RuntimeException("Stub!"); } 
/* 544 */   public int getMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 545 */   public void setMinimumWidth(int minWidth) { throw new RuntimeException("Stub!"); } 
/* 546 */   public Animation getAnimation() { throw new RuntimeException("Stub!"); } 
/* 547 */   public void startAnimation(Animation animation) { throw new RuntimeException("Stub!"); } 
/* 548 */   public void clearAnimation() { throw new RuntimeException("Stub!"); } 
/* 549 */   public void setAnimation(Animation animation) { throw new RuntimeException("Stub!"); } 
/* 550 */   protected void onAnimationStart() { throw new RuntimeException("Stub!"); } 
/* 551 */   protected void onAnimationEnd() { throw new RuntimeException("Stub!"); } 
/* 552 */   protected boolean onSetAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 553 */   public void playSoundEffect(int soundConstant) { throw new RuntimeException("Stub!"); } 
/* 554 */   public boolean performHapticFeedback(int feedbackConstant) { throw new RuntimeException("Stub!"); } 
/* 555 */   public boolean performHapticFeedback(int feedbackConstant, int flags) { throw new RuntimeException("Stub!"); } 
/* 556 */   public void setSystemUiVisibility(int visibility) { throw new RuntimeException("Stub!"); } 
/* 557 */   public int getSystemUiVisibility() { throw new RuntimeException("Stub!"); } 
/* 558 */   public int getWindowSystemUiVisibility() { throw new RuntimeException("Stub!"); } 
/* 559 */   public void onWindowSystemUiVisibilityChanged(int visible) { throw new RuntimeException("Stub!"); } 
/* 560 */   public void dispatchWindowSystemUiVisiblityChanged(int visible) { throw new RuntimeException("Stub!"); } 
/* 561 */   public void setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) { throw new RuntimeException("Stub!"); } 
/* 562 */   public void dispatchSystemUiVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); } 
/* 563 */   public final boolean startDrag(ClipData data, DragShadowBuilder shadowBuilder, Object myLocalState, int flags) { throw new RuntimeException("Stub!"); } 
/* 564 */   public boolean onDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); } 
/* 565 */   public boolean dispatchDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); } 
/* 566 */   public static View inflate(Context context, int resource, ViewGroup root) { throw new RuntimeException("Stub!"); } 
/*     */   protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
/* 568 */     throw new RuntimeException("Stub!"); } 
/* 569 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); } 
/* 570 */   public int getOverScrollMode() { throw new RuntimeException("Stub!"); } 
/* 571 */   public void setOverScrollMode(int overScrollMode) { throw new RuntimeException("Stub!"); } 
/* 572 */   public void setTextDirection(int textDirection) { throw new RuntimeException("Stub!"); } 
/* 574 */   @ViewDebug.ExportedProperty(category="text", mapping={@ViewDebug.IntToString(from=0, to="INHERIT"), @ViewDebug.IntToString(from=1, to="FIRST_STRONG"), @ViewDebug.IntToString(from=2, to="ANY_RTL"), @ViewDebug.IntToString(from=3, to="LTR"), @ViewDebug.IntToString(from=4, to="RTL"), @ViewDebug.IntToString(from=5, to="LOCALE")})
/*     */   public int getTextDirection() { throw new RuntimeException("Stub!"); } 
/* 575 */   public void setTextAlignment(int textAlignment) { throw new RuntimeException("Stub!"); } 
/* 577 */   @ViewDebug.ExportedProperty(category="text", mapping={@ViewDebug.IntToString(from=0, to="INHERIT"), @ViewDebug.IntToString(from=1, to="GRAVITY"), @ViewDebug.IntToString(from=2, to="TEXT_START"), @ViewDebug.IntToString(from=3, to="TEXT_END"), @ViewDebug.IntToString(from=4, to="CENTER"), @ViewDebug.IntToString(from=5, to="VIEW_START"), @ViewDebug.IntToString(from=6, to="VIEW_END")})
/*     */   public int getTextAlignment() { throw new RuntimeException("Stub!"); } 
/* 578 */   public static int generateViewId() { throw new RuntimeException("Stub!"); } 
/* 579 */   public ViewPropertyAnimator animate() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static class AccessibilityDelegate
/*     */   {
/*     */     public AccessibilityDelegate()
/*     */     {
/*  84 */       throw new RuntimeException("Stub!"); } 
/*  85 */     public void sendAccessibilityEvent(View host, int eventType) { throw new RuntimeException("Stub!"); } 
/*  86 */     public boolean performAccessibilityAction(View host, int action, Bundle args) { throw new RuntimeException("Stub!"); } 
/*  87 */     public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/*  88 */     public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/*  89 */     public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/*  90 */     public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/*  91 */     public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/*  92 */     public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/*  93 */     public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class BaseSavedState extends AbsSavedState
/*     */   {
/*  80 */     public static final Parcelable.Creator<BaseSavedState> CREATOR = null;
/*     */ 
/*     */     public BaseSavedState(Parcel source)
/*     */     {
/*  77 */       super(); throw new RuntimeException("Stub!"); } 
/*  78 */     public BaseSavedState(Parcelable superState) { super(); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface OnAttachStateChangeListener
/*     */   {
/*     */     public abstract void onViewAttachedToWindow(View paramView);
/*     */ 
/*     */     public abstract void onViewDetachedFromWindow(View paramView);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnSystemUiVisibilityChangeListener
/*     */   {
/*     */     public abstract void onSystemUiVisibilityChange(int paramInt);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnCreateContextMenuListener
/*     */   {
/*     */     public abstract void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnClickListener
/*     */   {
/*     */     public abstract void onClick(View paramView);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnFocusChangeListener
/*     */   {
/*     */     public abstract void onFocusChange(View paramView, boolean paramBoolean);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnDragListener
/*     */   {
/*     */     public abstract boolean onDrag(View paramView, DragEvent paramDragEvent);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnLongClickListener
/*     */   {
/*     */     public abstract boolean onLongClick(View paramView);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnGenericMotionListener
/*     */   {
/*     */     public abstract boolean onGenericMotion(View paramView, MotionEvent paramMotionEvent);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnHoverListener
/*     */   {
/*     */     public abstract boolean onHover(View paramView, MotionEvent paramMotionEvent);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnTouchListener
/*     */   {
/*     */     public abstract boolean onTouch(View paramView, MotionEvent paramMotionEvent);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnKeyListener
/*     */   {
/*     */     public abstract boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent);
/*     */   }
/*     */ 
/*     */   public static class MeasureSpec
/*     */   {
/*     */     public static final int UNSPECIFIED = 0;
/*     */     public static final int EXACTLY = 1073741824;
/*     */     public static final int AT_MOST = -2147483648;
/*     */ 
/*     */     public MeasureSpec()
/*     */     {
/*  20 */       throw new RuntimeException("Stub!"); } 
/*  21 */     public static int makeMeasureSpec(int size, int mode) { throw new RuntimeException("Stub!"); } 
/*  22 */     public static int getMode(int measureSpec) { throw new RuntimeException("Stub!"); } 
/*  23 */     public static int getSize(int measureSpec) { throw new RuntimeException("Stub!"); } 
/*  24 */     public static String toString(int measureSpec) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class DragShadowBuilder
/*     */   {
/*     */     public DragShadowBuilder(View view)
/*     */     {
/*  11 */       throw new RuntimeException("Stub!"); } 
/*  12 */     public DragShadowBuilder() { throw new RuntimeException("Stub!"); } 
/*     */     public final View getView() {
/*  14 */       throw new RuntimeException("Stub!"); } 
/*  15 */     public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint) { throw new RuntimeException("Stub!"); } 
/*  16 */     public void onDrawShadow(Canvas canvas) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static abstract interface OnLayoutChangeListener
/*     */   {
/*     */     public abstract void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.View
 * JD-Core Version:    0.6.2
 */