package android.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityEvent;

public abstract interface ViewParent
{
  public abstract void requestLayout();

  public abstract boolean isLayoutRequested();

  public abstract void requestTransparentRegion(View paramView);

  public abstract void invalidateChild(View paramView, Rect paramRect);

  public abstract ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect);

  public abstract ViewParent getParent();

  public abstract void requestChildFocus(View paramView1, View paramView2);

  public abstract void recomputeViewAttributes(View paramView);

  public abstract void clearChildFocus(View paramView);

  public abstract boolean getChildVisibleRect(View paramView, Rect paramRect, Point paramPoint);

  public abstract View focusSearch(View paramView, int paramInt);

  public abstract void bringChildToFront(View paramView);

  public abstract void focusableViewAvailable(View paramView);

  public abstract boolean showContextMenuForChild(View paramView);

  public abstract void createContextMenu(ContextMenu paramContextMenu);

  public abstract ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback);

  public abstract void childDrawableStateChanged(View paramView);

  public abstract void requestDisallowInterceptTouchEvent(boolean paramBoolean);

  public abstract boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean);

  public abstract boolean requestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract void requestFitSystemWindows();

  public abstract ViewParent getParentForAccessibility();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.ViewParent
 * JD-Core Version:    0.6.2
 */