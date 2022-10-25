package com.example.ahoy.weatherapp.databinding;
import com.example.ahoy.weatherapp.R;
import com.example.ahoy.weatherapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemFivedaysWeatherBindingImpl extends ItemFivedaysWeatherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFivedaysWeatherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemFivedaysWeatherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.imgItem.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDate.setTag(null);
        this.tvItemTemp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fiveDayItem == variableId) {
            setFiveDayItem((com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFiveDayItem(@Nullable com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem FiveDayItem) {
        this.mFiveDayItem = FiveDayItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fiveDayItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String fiveDayItemIconUrl = null;
        com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem fiveDayItem = mFiveDayItem;
        java.lang.String fiveDayItemTemperature = null;
        java.lang.String fiveDayItemDtTxt = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (fiveDayItem != null) {
                    // read fiveDayItem.iconUrl
                    fiveDayItemIconUrl = fiveDayItem.getIconUrl();
                    // read fiveDayItem.temperature
                    fiveDayItemTemperature = fiveDayItem.getTemperature();
                    // read fiveDayItem.dtTxt
                    fiveDayItemDtTxt = fiveDayItem.getDtTxt();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem.loadImage(this.imgItem, fiveDayItemIconUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, fiveDayItemDtTxt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemTemp, fiveDayItemTemperature);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fiveDayItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}