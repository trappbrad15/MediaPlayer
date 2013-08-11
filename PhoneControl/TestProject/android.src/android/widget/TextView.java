/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.TypedArray;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Typeface;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.text.Editable;
/*     */ import android.text.Editable.Factory;
/*     */ import android.text.InputFilter;
/*     */ import android.text.Layout;
/*     */ import android.text.Spannable.Factory;
/*     */ import android.text.TextPaint;
/*     */ import android.text.TextUtils.TruncateAt;
/*     */ import android.text.TextWatcher;
/*     */ import android.text.method.KeyListener;
/*     */ import android.text.method.MovementMethod;
/*     */ import android.text.method.TransformationMethod;
/*     */ import android.text.style.URLSpan;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ActionMode.Callback;
/*     */ import android.view.DragEvent;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.View.BaseSavedState;
/*     */ import android.view.ViewDebug.CapturedViewProperty;
/*     */ import android.view.ViewDebug.ExportedProperty;
/*     */ import android.view.ViewTreeObserver.OnPreDrawListener;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import android.view.accessibility.AccessibilityNodeInfo;
/*     */ import android.view.inputmethod.CompletionInfo;
/*     */ import android.view.inputmethod.CorrectionInfo;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.ExtractedText;
/*     */ import android.view.inputmethod.ExtractedTextRequest;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Locale;
/*     */ import org.xmlpull.v1.XmlPullParserException;
/*     */ 
/*     */ @RemoteViews.RemoteView
/*     */ public class TextView extends View
/*     */   implements ViewTreeObserver.OnPreDrawListener
/*     */ {
/*     */   public TextView(Context context)
/*     */   {
/*  27 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  28 */   public TextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*     */   public TextView(Context context, AttributeSet attrs, int defStyle) {
/*  30 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  31 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  32 */   public void setTypeface(Typeface tf, int style) { throw new RuntimeException("Stub!"); } 
/*  33 */   protected boolean getDefaultEditable() { throw new RuntimeException("Stub!"); } 
/*  34 */   protected MovementMethod getDefaultMovementMethod() { throw new RuntimeException("Stub!"); } 
/*  36 */   @ViewDebug.CapturedViewProperty
/*     */   public CharSequence getText() { throw new RuntimeException("Stub!"); } 
/*  37 */   public int length() { throw new RuntimeException("Stub!"); } 
/*  38 */   public Editable getEditableText() { throw new RuntimeException("Stub!"); } 
/*  39 */   public int getLineHeight() { throw new RuntimeException("Stub!"); } 
/*  40 */   public final Layout getLayout() { throw new RuntimeException("Stub!"); } 
/*  41 */   public final KeyListener getKeyListener() { throw new RuntimeException("Stub!"); } 
/*  42 */   public void setKeyListener(KeyListener input) { throw new RuntimeException("Stub!"); } 
/*  43 */   public final MovementMethod getMovementMethod() { throw new RuntimeException("Stub!"); } 
/*  44 */   public final void setMovementMethod(MovementMethod movement) { throw new RuntimeException("Stub!"); } 
/*  45 */   public final TransformationMethod getTransformationMethod() { throw new RuntimeException("Stub!"); } 
/*  46 */   public final void setTransformationMethod(TransformationMethod method) { throw new RuntimeException("Stub!"); } 
/*  47 */   public int getCompoundPaddingTop() { throw new RuntimeException("Stub!"); } 
/*  48 */   public int getCompoundPaddingBottom() { throw new RuntimeException("Stub!"); } 
/*  49 */   public int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); } 
/*  50 */   public int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); } 
/*  51 */   public int getCompoundPaddingStart() { throw new RuntimeException("Stub!"); } 
/*  52 */   public int getCompoundPaddingEnd() { throw new RuntimeException("Stub!"); } 
/*  53 */   public int getExtendedPaddingTop() { throw new RuntimeException("Stub!"); } 
/*  54 */   public int getExtendedPaddingBottom() { throw new RuntimeException("Stub!"); } 
/*  55 */   public int getTotalPaddingLeft() { throw new RuntimeException("Stub!"); } 
/*  56 */   public int getTotalPaddingRight() { throw new RuntimeException("Stub!"); } 
/*  57 */   public int getTotalPaddingStart() { throw new RuntimeException("Stub!"); } 
/*  58 */   public int getTotalPaddingEnd() { throw new RuntimeException("Stub!"); } 
/*  59 */   public int getTotalPaddingTop() { throw new RuntimeException("Stub!"); } 
/*  60 */   public int getTotalPaddingBottom() { throw new RuntimeException("Stub!"); } 
/*  61 */   public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) { throw new RuntimeException("Stub!"); } 
/*  62 */   public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/*  63 */   public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) { throw new RuntimeException("Stub!"); } 
/*  64 */   public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) { throw new RuntimeException("Stub!"); } 
/*  65 */   public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); } 
/*  66 */   public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) { throw new RuntimeException("Stub!"); } 
/*  67 */   public Drawable[] getCompoundDrawables() { throw new RuntimeException("Stub!"); } 
/*  68 */   public Drawable[] getCompoundDrawablesRelative() { throw new RuntimeException("Stub!"); } 
/*  69 */   public void setCompoundDrawablePadding(int pad) { throw new RuntimeException("Stub!"); } 
/*  70 */   public int getCompoundDrawablePadding() { throw new RuntimeException("Stub!"); } 
/*  71 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/*  72 */   public void setPaddingRelative(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); } 
/*  73 */   public final int getAutoLinkMask() { throw new RuntimeException("Stub!"); } 
/*  74 */   public void setTextAppearance(Context context, int resid) { throw new RuntimeException("Stub!"); } 
/*  75 */   public Locale getTextLocale() { throw new RuntimeException("Stub!"); } 
/*  76 */   public void setTextLocale(Locale locale) { throw new RuntimeException("Stub!"); } 
/*  78 */   @ViewDebug.ExportedProperty(category="text")
/*     */   public float getTextSize() { throw new RuntimeException("Stub!"); } 
/*  79 */   public void setTextSize(float size) { throw new RuntimeException("Stub!"); } 
/*  80 */   public void setTextSize(int unit, float size) { throw new RuntimeException("Stub!"); } 
/*  81 */   public float getTextScaleX() { throw new RuntimeException("Stub!"); } 
/*  82 */   public void setTextScaleX(float size) { throw new RuntimeException("Stub!"); } 
/*  83 */   public void setTypeface(Typeface tf) { throw new RuntimeException("Stub!"); } 
/*  84 */   public Typeface getTypeface() { throw new RuntimeException("Stub!"); } 
/*  85 */   public void setTextColor(int color) { throw new RuntimeException("Stub!"); } 
/*  86 */   public void setTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); } 
/*  87 */   public final ColorStateList getTextColors() { throw new RuntimeException("Stub!"); } 
/*  88 */   public final int getCurrentTextColor() { throw new RuntimeException("Stub!"); } 
/*  89 */   public void setHighlightColor(int color) { throw new RuntimeException("Stub!"); } 
/*  90 */   public int getHighlightColor() { throw new RuntimeException("Stub!"); } 
/*  91 */   public void setShadowLayer(float radius, float dx, float dy, int color) { throw new RuntimeException("Stub!"); } 
/*  92 */   public float getShadowRadius() { throw new RuntimeException("Stub!"); } 
/*  93 */   public float getShadowDx() { throw new RuntimeException("Stub!"); } 
/*  94 */   public float getShadowDy() { throw new RuntimeException("Stub!"); } 
/*  95 */   public int getShadowColor() { throw new RuntimeException("Stub!"); } 
/*  96 */   public TextPaint getPaint() { throw new RuntimeException("Stub!"); } 
/*  97 */   public final void setAutoLinkMask(int mask) { throw new RuntimeException("Stub!"); } 
/*  98 */   public final void setLinksClickable(boolean whether) { throw new RuntimeException("Stub!"); } 
/*  99 */   public final boolean getLinksClickable() { throw new RuntimeException("Stub!"); } 
/* 100 */   public URLSpan[] getUrls() { throw new RuntimeException("Stub!"); } 
/* 101 */   public final void setHintTextColor(int color) { throw new RuntimeException("Stub!"); } 
/* 102 */   public final void setHintTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); } 
/* 103 */   public final ColorStateList getHintTextColors() { throw new RuntimeException("Stub!"); } 
/* 104 */   public final int getCurrentHintTextColor() { throw new RuntimeException("Stub!"); } 
/* 105 */   public final void setLinkTextColor(int color) { throw new RuntimeException("Stub!"); } 
/* 106 */   public final void setLinkTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); } 
/* 107 */   public final ColorStateList getLinkTextColors() { throw new RuntimeException("Stub!"); } 
/* 108 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 109 */   public int getGravity() { throw new RuntimeException("Stub!"); } 
/* 110 */   public int getPaintFlags() { throw new RuntimeException("Stub!"); } 
/* 111 */   public void setPaintFlags(int flags) { throw new RuntimeException("Stub!"); } 
/* 112 */   public void setHorizontallyScrolling(boolean whether) { throw new RuntimeException("Stub!"); } 
/* 113 */   public void setMinLines(int minlines) { throw new RuntimeException("Stub!"); } 
/* 114 */   public int getMinLines() { throw new RuntimeException("Stub!"); } 
/* 115 */   public void setMinHeight(int minHeight) { throw new RuntimeException("Stub!"); } 
/* 116 */   public int getMinHeight() { throw new RuntimeException("Stub!"); } 
/* 117 */   public void setMaxLines(int maxlines) { throw new RuntimeException("Stub!"); } 
/* 118 */   public int getMaxLines() { throw new RuntimeException("Stub!"); } 
/* 119 */   public void setMaxHeight(int maxHeight) { throw new RuntimeException("Stub!"); } 
/* 120 */   public int getMaxHeight() { throw new RuntimeException("Stub!"); } 
/* 121 */   public void setLines(int lines) { throw new RuntimeException("Stub!"); } 
/* 122 */   public void setHeight(int pixels) { throw new RuntimeException("Stub!"); } 
/* 123 */   public void setMinEms(int minems) { throw new RuntimeException("Stub!"); } 
/* 124 */   public int getMinEms() { throw new RuntimeException("Stub!"); } 
/* 125 */   public void setMinWidth(int minpixels) { throw new RuntimeException("Stub!"); } 
/* 126 */   public int getMinWidth() { throw new RuntimeException("Stub!"); } 
/* 127 */   public void setMaxEms(int maxems) { throw new RuntimeException("Stub!"); } 
/* 128 */   public int getMaxEms() { throw new RuntimeException("Stub!"); } 
/* 129 */   public void setMaxWidth(int maxpixels) { throw new RuntimeException("Stub!"); } 
/* 130 */   public int getMaxWidth() { throw new RuntimeException("Stub!"); } 
/* 131 */   public void setEms(int ems) { throw new RuntimeException("Stub!"); } 
/* 132 */   public void setWidth(int pixels) { throw new RuntimeException("Stub!"); } 
/* 133 */   public void setLineSpacing(float add, float mult) { throw new RuntimeException("Stub!"); } 
/* 134 */   public float getLineSpacingMultiplier() { throw new RuntimeException("Stub!"); } 
/* 135 */   public float getLineSpacingExtra() { throw new RuntimeException("Stub!"); } 
/* 136 */   public final void append(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 137 */   public void append(CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 138 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 139 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 140 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 141 */   public void setFreezesText(boolean freezesText) { throw new RuntimeException("Stub!"); } 
/* 142 */   public boolean getFreezesText() { throw new RuntimeException("Stub!"); } 
/* 143 */   public final void setEditableFactory(Editable.Factory factory) { throw new RuntimeException("Stub!"); } 
/* 144 */   public final void setSpannableFactory(Spannable.Factory factory) { throw new RuntimeException("Stub!"); } 
/* 145 */   public final void setText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 146 */   public final void setTextKeepState(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 147 */   public void setText(CharSequence text, BufferType type) { throw new RuntimeException("Stub!"); } 
/* 148 */   public final void setText(char[] text, int start, int len) { throw new RuntimeException("Stub!"); } 
/* 149 */   public final void setTextKeepState(CharSequence text, BufferType type) { throw new RuntimeException("Stub!"); } 
/* 150 */   public final void setText(int resid) { throw new RuntimeException("Stub!"); } 
/* 151 */   public final void setText(int resid, BufferType type) { throw new RuntimeException("Stub!"); } 
/* 152 */   public final void setHint(CharSequence hint) { throw new RuntimeException("Stub!"); } 
/* 153 */   public final void setHint(int resid) { throw new RuntimeException("Stub!"); } 
/* 155 */   @ViewDebug.CapturedViewProperty
/*     */   public CharSequence getHint() { throw new RuntimeException("Stub!"); } 
/* 156 */   public void setInputType(int type) { throw new RuntimeException("Stub!"); } 
/* 157 */   public void setRawInputType(int type) { throw new RuntimeException("Stub!"); } 
/* 158 */   public int getInputType() { throw new RuntimeException("Stub!"); } 
/* 159 */   public void setImeOptions(int imeOptions) { throw new RuntimeException("Stub!"); } 
/* 160 */   public int getImeOptions() { throw new RuntimeException("Stub!"); } 
/* 161 */   public void setImeActionLabel(CharSequence label, int actionId) { throw new RuntimeException("Stub!"); } 
/* 162 */   public CharSequence getImeActionLabel() { throw new RuntimeException("Stub!"); } 
/* 163 */   public int getImeActionId() { throw new RuntimeException("Stub!"); } 
/* 164 */   public void setOnEditorActionListener(OnEditorActionListener l) { throw new RuntimeException("Stub!"); } 
/* 165 */   public void onEditorAction(int actionCode) { throw new RuntimeException("Stub!"); } 
/* 166 */   public void setPrivateImeOptions(String type) { throw new RuntimeException("Stub!"); } 
/* 167 */   public String getPrivateImeOptions() { throw new RuntimeException("Stub!"); } 
/* 168 */   public void setInputExtras(int xmlResId) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 169 */   public Bundle getInputExtras(boolean create) { throw new RuntimeException("Stub!"); } 
/* 170 */   public CharSequence getError() { throw new RuntimeException("Stub!"); } 
/* 171 */   public void setError(CharSequence error) { throw new RuntimeException("Stub!"); } 
/* 172 */   public void setError(CharSequence error, Drawable icon) { throw new RuntimeException("Stub!"); } 
/* 173 */   protected boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 174 */   public void setFilters(InputFilter[] filters) { throw new RuntimeException("Stub!"); } 
/* 175 */   public InputFilter[] getFilters() { throw new RuntimeException("Stub!"); } 
/* 176 */   public boolean onPreDraw() { throw new RuntimeException("Stub!"); } 
/* 177 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 178 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 179 */   public void onScreenStateChanged(int screenState) { throw new RuntimeException("Stub!"); } 
/* 180 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); } 
/* 181 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 182 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 183 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 184 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 185 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 186 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 187 */   public void invalidateDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 188 */   public boolean hasOverlappingRendering() { throw new RuntimeException("Stub!"); } 
/* 189 */   public boolean isTextSelectable() { throw new RuntimeException("Stub!"); } 
/* 190 */   public void setTextIsSelectable(boolean selectable) { throw new RuntimeException("Stub!"); } 
/* 191 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 192 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 193 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 194 */   public int getLineCount() { throw new RuntimeException("Stub!"); } 
/* 195 */   public int getLineBounds(int line, Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 196 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 197 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 198 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 199 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 200 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 201 */   public boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); } 
/* 202 */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) { throw new RuntimeException("Stub!"); } 
/* 203 */   public boolean extractText(ExtractedTextRequest request, ExtractedText outText) { throw new RuntimeException("Stub!"); } 
/* 204 */   public void setExtractedText(ExtractedText text) { throw new RuntimeException("Stub!"); } 
/* 205 */   public void onCommitCompletion(CompletionInfo text) { throw new RuntimeException("Stub!"); } 
/* 206 */   public void onCommitCorrection(CorrectionInfo info) { throw new RuntimeException("Stub!"); } 
/* 207 */   public void beginBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 208 */   public void endBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 209 */   public void onBeginBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 210 */   public void onEndBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 211 */   public boolean onPrivateIMECommand(String action, Bundle data) { throw new RuntimeException("Stub!"); } 
/* 212 */   public void setIncludeFontPadding(boolean includepad) { throw new RuntimeException("Stub!"); } 
/* 213 */   public boolean getIncludeFontPadding() { throw new RuntimeException("Stub!"); } 
/* 214 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 215 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 216 */   public boolean bringPointIntoView(int offset) { throw new RuntimeException("Stub!"); } 
/* 217 */   public boolean moveCursorToVisibleOffset() { throw new RuntimeException("Stub!"); } 
/* 218 */   public void computeScroll() { throw new RuntimeException("Stub!"); } 
/* 219 */   public void debug(int depth) { throw new RuntimeException("Stub!"); } 
/* 221 */   @ViewDebug.ExportedProperty(category="text")
/*     */   public int getSelectionStart() { throw new RuntimeException("Stub!"); } 
/* 223 */   @ViewDebug.ExportedProperty(category="text")
/*     */   public int getSelectionEnd() { throw new RuntimeException("Stub!"); } 
/* 224 */   public boolean hasSelection() { throw new RuntimeException("Stub!"); } 
/* 225 */   public void setSingleLine() { throw new RuntimeException("Stub!"); } 
/* 226 */   public void setAllCaps(boolean allCaps) { throw new RuntimeException("Stub!"); } 
/* 227 */   public void setSingleLine(boolean singleLine) { throw new RuntimeException("Stub!"); } 
/* 228 */   public void setEllipsize(TextUtils.TruncateAt where) { throw new RuntimeException("Stub!"); } 
/* 229 */   public void setMarqueeRepeatLimit(int marqueeLimit) { throw new RuntimeException("Stub!"); } 
/* 230 */   public int getMarqueeRepeatLimit() { throw new RuntimeException("Stub!"); } 
/* 232 */   @ViewDebug.ExportedProperty
/*     */   public TextUtils.TruncateAt getEllipsize() { throw new RuntimeException("Stub!"); } 
/* 233 */   public void setSelectAllOnFocus(boolean selectAllOnFocus) { throw new RuntimeException("Stub!"); } 
/* 234 */   public void setCursorVisible(boolean visible) { throw new RuntimeException("Stub!"); } 
/* 235 */   public boolean isCursorVisible() { throw new RuntimeException("Stub!"); } 
/* 236 */   protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) { throw new RuntimeException("Stub!"); } 
/* 237 */   protected void onSelectionChanged(int selStart, int selEnd) { throw new RuntimeException("Stub!"); } 
/* 238 */   public void addTextChangedListener(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 239 */   public void removeTextChangedListener(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 240 */   public void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 241 */   public void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 242 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 243 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); } 
/* 244 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 245 */   public void clearComposingText() { throw new RuntimeException("Stub!"); } 
/* 246 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 247 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 248 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 249 */   public boolean didTouchFocusSelect() { throw new RuntimeException("Stub!"); } 
/* 250 */   public void cancelLongPress() { throw new RuntimeException("Stub!"); } 
/* 251 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 252 */   public void setScroller(Scroller s) { throw new RuntimeException("Stub!"); } 
/* 253 */   protected float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 254 */   protected float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 255 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 256 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 257 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 258 */   public void findViewsWithText(ArrayList<View> outViews, CharSequence searched, int flags) { throw new RuntimeException("Stub!"); } 
/* 259 */   public static ColorStateList getTextColors(Context context, TypedArray attrs) { throw new RuntimeException("Stub!"); } 
/* 260 */   public static int getTextColor(Context context, TypedArray attrs, int def) { throw new RuntimeException("Stub!"); } 
/* 261 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 262 */   public void onPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 263 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 264 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 265 */   public boolean performAccessibilityAction(int action, Bundle arguments) { throw new RuntimeException("Stub!"); } 
/* 266 */   public void sendAccessibilityEvent(int eventType) { throw new RuntimeException("Stub!"); } 
/* 267 */   public boolean isInputMethodTarget() { throw new RuntimeException("Stub!"); } 
/* 268 */   public boolean onTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); } 
/* 269 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); } 
/* 270 */   protected void onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert) { throw new RuntimeException("Stub!"); } 
/* 271 */   public boolean isSuggestionsEnabled() { throw new RuntimeException("Stub!"); } 
/* 272 */   public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) { throw new RuntimeException("Stub!"); } 
/* 273 */   public ActionMode.Callback getCustomSelectionActionModeCallback() { throw new RuntimeException("Stub!"); } 
/* 274 */   public int getOffsetForPosition(float x, float y) { throw new RuntimeException("Stub!"); } 
/* 275 */   public boolean onDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); } 
/* 276 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static class SavedState extends View.BaseSavedState
/*     */   {
/*  25 */     public static final Parcelable.Creator<SavedState> CREATOR = null;
/*     */ 
/*     */     SavedState()
/*     */     {
/*  20 */       super(); throw new RuntimeException("Stub!"); } 
/*  21 */     public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/*  22 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static enum BufferType
/*     */   {
/*  13 */     EDITABLE, 
/*  14 */     NORMAL, 
/*  15 */     SPANNABLE;
/*     */   }
/*     */ 
/*     */   public static abstract interface OnEditorActionListener
/*     */   {
/*     */     public abstract boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent);
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.TextView
 * JD-Core Version:    0.6.2
 */