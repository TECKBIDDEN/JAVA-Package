package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.drive.internal.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataBufferAdapter<T> extends BaseAdapter
{
  private final int RJ;
  private int RK;
  private final int RL;
  private final List<DataBuffer<T>> RM;
  private final LayoutInflater RN;
  private boolean RO = true;
  private final Context mContext;

  public DataBufferAdapter(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, 0, new ArrayList());
  }

  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2)
  {
    this(paramContext, paramInt1, paramInt2, new ArrayList());
  }

  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, List<DataBuffer<T>> paramList)
  {
    this.mContext = paramContext;
    this.RK = paramInt1;
    this.RJ = paramInt1;
    this.RL = paramInt2;
    this.RM = paramList;
    this.RN = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }

  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, DataBuffer<T>[] paramArrayOfDataBuffer)
  {
    this(paramContext, paramInt1, paramInt2, Arrays.asList(paramArrayOfDataBuffer));
  }

  public DataBufferAdapter(Context paramContext, int paramInt, List<DataBuffer<T>> paramList)
  {
    this(paramContext, paramInt, 0, paramList);
  }

  public DataBufferAdapter(Context paramContext, int paramInt, DataBuffer<T>[] paramArrayOfDataBuffer)
  {
    this(paramContext, paramInt, 0, Arrays.asList(paramArrayOfDataBuffer));
  }

  private View a(int paramInt1, View paramView, ViewGroup paramViewGroup, int paramInt2)
  {
    View localView;
    if (paramView == null)
      localView = this.RN.inflate(paramInt2, paramViewGroup, false);
    while (true)
    {
      Object localObject1;
      Object localObject2;
      try
      {
        if (this.RL != 0)
          continue;
        TextView localTextView2 = (TextView)localView;
        localObject1 = localTextView2;
        localObject2 = getItem(paramInt1);
        if ((localObject2 instanceof CharSequence))
        {
          ((TextView)localObject1).setText((CharSequence)localObject2);
          return localView;
          localView = paramView;
          continue;
          TextView localTextView1 = (TextView)localView.findViewById(this.RL);
          localObject1 = localTextView1;
          continue;
        }
      }
      catch (ClassCastException localClassCastException)
      {
        v.a("DataBufferAdapter", localClassCastException, "You must supply a resource ID for a TextView");
        throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", localClassCastException);
      }
      ((TextView)localObject1).setText(localObject2.toString());
    }
  }

  public void append(DataBuffer<T> paramDataBuffer)
  {
    this.RM.add(paramDataBuffer);
    if (this.RO)
      notifyDataSetChanged();
  }

  public void clear()
  {
    Iterator localIterator = this.RM.iterator();
    while (localIterator.hasNext())
      ((DataBuffer)localIterator.next()).release();
    this.RM.clear();
    if (this.RO)
      notifyDataSetChanged();
  }

  public Context getContext()
  {
    return this.mContext;
  }

  public int getCount()
  {
    Iterator localIterator = this.RM.iterator();
    int i = 0;
    while (localIterator.hasNext())
      i += ((DataBuffer)localIterator.next()).getCount();
    return i;
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, this.RK);
  }

  public T getItem(int paramInt)
    throws CursorIndexOutOfBoundsException
  {
    Iterator localIterator = this.RM.iterator();
    int i = paramInt;
    while (localIterator.hasNext())
    {
      DataBuffer localDataBuffer = (DataBuffer)localIterator.next();
      int j = localDataBuffer.getCount();
      if (j <= i)
      {
        i -= j;
        continue;
      }
      try
      {
        Object localObject = localDataBuffer.get(i);
        return localObject;
      }
      catch (CursorIndexOutOfBoundsException localCursorIndexOutOfBoundsException)
      {
        throw new CursorIndexOutOfBoundsException(paramInt, getCount());
      }
    }
    throw new CursorIndexOutOfBoundsException(paramInt, getCount());
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, this.RJ);
  }

  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    this.RO = true;
  }

  public void setDropDownViewResource(int paramInt)
  {
    this.RK = paramInt;
  }

  public void setNotifyOnChange(boolean paramBoolean)
  {
    this.RO = paramBoolean;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.widget.DataBufferAdapter
 * JD-Core Version:    0.6.0
 */