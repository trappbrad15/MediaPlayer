package android.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract interface Adapter
{
  public static final int IGNORE_ITEM_VIEW_TYPE = -1;
  public static final int NO_SELECTION = -2147483648;

  public abstract void registerDataSetObserver(DataSetObserver paramDataSetObserver);

  public abstract void unregisterDataSetObserver(DataSetObserver paramDataSetObserver);

  public abstract int getCount();

  public abstract Object getItem(int paramInt);

  public abstract long getItemId(int paramInt);

  public abstract boolean hasStableIds();

  public abstract View getView(int paramInt, View paramView, ViewGroup paramViewGroup);

  public abstract int getItemViewType(int paramInt);

  public abstract int getViewTypeCount();

  public abstract boolean isEmpty();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.Adapter
 * JD-Core Version:    0.6.2
 */