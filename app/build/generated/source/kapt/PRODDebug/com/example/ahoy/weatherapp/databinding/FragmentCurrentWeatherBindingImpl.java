package com.example.ahoy.weatherapp.databinding;
import com.example.ahoy.weatherapp.R;
import com.example.ahoy.weatherapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentCurrentWeatherBindingImpl extends FragmentCurrentWeatherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline, 16);
        sViewsWithIds.put(R.id.linearLayout, 17);
        sViewsWithIds.put(R.id.guideline3, 18);
        sViewsWithIds.put(R.id.cardView, 19);
        sViewsWithIds.put(R.id.imageView2, 20);
        sViewsWithIds.put(R.id.textView8, 21);
        sViewsWithIds.put(R.id.cardView3, 22);
        sViewsWithIds.put(R.id.imageView3, 23);
        sViewsWithIds.put(R.id.textView10, 24);
        sViewsWithIds.put(R.id.cardView2, 25);
        sViewsWithIds.put(R.id.imageView4, 26);
        sViewsWithIds.put(R.id.textView12, 27);
        sViewsWithIds.put(R.id.cardView4, 28);
        sViewsWithIds.put(R.id.imageView5, 29);
        sViewsWithIds.put(R.id.textView14, 30);
        sViewsWithIds.put(R.id.imageView7, 31);
        sViewsWithIds.put(R.id.textView18, 32);
        sViewsWithIds.put(R.id.imageView6, 33);
        sViewsWithIds.put(R.id.textView16, 34);
        sViewsWithIds.put(R.id.tv_forcast, 35);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCurrentWeatherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentCurrentWeatherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[25]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[28]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (androidx.constraintlayout.widget.Guideline) bindings[16]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.ProgressBar) bindings[13]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[2]
            );
        this.cvFiveForcast.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.textView11.setTag(null);
        this.textView13.setTag(null);
        this.textView15.setTag(null);
        this.textView17.setTag(null);
        this.textView19.setTag(null);
        this.textView4.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
        this.textView7.setTag(null);
        this.textView9.setTag(null);
        this.textViewError.setTag(null);
        this.tvCityName.setTag(null);
        this.tvUpdatedAt.setTag(null);
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
        if (BR.uiState == variableId) {
            setUiState((com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUiState(@Nullable com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewState UiState) {
        this.mUiState = UiState;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.uiState);
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
        com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewState uiState = mUiState;
        java.lang.String uiStateCurrentWeatherPressure = null;
        com.example.ahoy.weatherapp.domain.weather.model.CurrentWeather uiStateCurrentWeather = null;
        boolean uiStateLoading = false;
        java.lang.String uiStateCurrentWeatherUpdatedDate = null;
        java.lang.String uiStateCurrentWeatherMaxTemperature = null;
        java.lang.String uiStateErrorMessage = null;
        java.lang.String uiStateCurrentWeatherName = null;
        int uiStateAnyErrorViewVISIBLEViewGONE = 0;
        int uiStateLoadingViewVISIBLEViewGONE = 0;
        int uiStateAnyErrorViewGONEViewVISIBLE = 0;
        java.lang.String uiStateCurrentWeatherMinTemperature = null;
        java.lang.String uiStateCurrentWeatherDescription = null;
        java.lang.String uiStateCurrentWeatherHumidity = null;
        java.lang.String uiStateCurrentWeatherFeelsLike = null;
        java.lang.String uiStateCurrentWeatherTemperature = null;
        java.lang.String uiStateCurrentWeatherWindSpeed = null;
        boolean uiStateAnyError = false;
        java.lang.String uiStateCurrentWeatherSunset = null;
        java.lang.String uiStateCurrentWeatherSunrise = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (uiState != null) {
                    // read uiState.currentWeather
                    uiStateCurrentWeather = uiState.getCurrentWeather();
                    // read uiState.loading
                    uiStateLoading = uiState.isLoading();
                    // read uiState.errorMessage
                    uiStateErrorMessage = uiState.getErrorMessage();
                    // read uiState.anyError
                    uiStateAnyError = uiState.getAnyError();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(uiStateLoading) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(uiStateAnyError) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x40L;
                }
            }


                if (uiStateCurrentWeather != null) {
                    // read uiState.currentWeather.pressure
                    uiStateCurrentWeatherPressure = uiStateCurrentWeather.getPressure();
                    // read uiState.currentWeather.updatedDate
                    uiStateCurrentWeatherUpdatedDate = uiStateCurrentWeather.getUpdatedDate();
                    // read uiState.currentWeather.maxTemperature
                    uiStateCurrentWeatherMaxTemperature = uiStateCurrentWeather.getMaxTemperature();
                    // read uiState.currentWeather.name
                    uiStateCurrentWeatherName = uiStateCurrentWeather.getName();
                    // read uiState.currentWeather.minTemperature
                    uiStateCurrentWeatherMinTemperature = uiStateCurrentWeather.getMinTemperature();
                    // read uiState.currentWeather.description
                    uiStateCurrentWeatherDescription = uiStateCurrentWeather.getDescription();
                    // read uiState.currentWeather.humidity
                    uiStateCurrentWeatherHumidity = uiStateCurrentWeather.getHumidity();
                    // read uiState.currentWeather.feelsLike
                    uiStateCurrentWeatherFeelsLike = uiStateCurrentWeather.getFeelsLike();
                    // read uiState.currentWeather.temperature
                    uiStateCurrentWeatherTemperature = uiStateCurrentWeather.getTemperature();
                    // read uiState.currentWeather.windSpeed
                    uiStateCurrentWeatherWindSpeed = uiStateCurrentWeather.getWindSpeed();
                    // read uiState.currentWeather.sunset
                    uiStateCurrentWeatherSunset = uiStateCurrentWeather.getSunset();
                    // read uiState.currentWeather.sunrise
                    uiStateCurrentWeatherSunrise = uiStateCurrentWeather.getSunrise();
                }
                // read uiState.loading ? View.VISIBLE : View.GONE
                uiStateLoadingViewVISIBLEViewGONE = ((uiStateLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read uiState.anyError ? View.VISIBLE : View.GONE
                uiStateAnyErrorViewVISIBLEViewGONE = ((uiStateAnyError) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read uiState.anyError ? View.GONE : View.VISIBLE
                uiStateAnyErrorViewGONEViewVISIBLE = ((uiStateAnyError) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.cvFiveForcast.setVisibility(uiStateAnyErrorViewGONEViewVISIBLE);
            this.progressBar.setVisibility(uiStateLoadingViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, uiStateCurrentWeatherSunset);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView13, uiStateCurrentWeatherWindSpeed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView15, uiStateCurrentWeatherPressure);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView17, uiStateCurrentWeatherHumidity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView19, uiStateCurrentWeatherFeelsLike);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, uiStateCurrentWeatherDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, uiStateCurrentWeatherTemperature);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, uiStateCurrentWeatherMinTemperature);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView7, uiStateCurrentWeatherMaxTemperature);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView9, uiStateCurrentWeatherSunrise);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewError, uiStateErrorMessage);
            this.textViewError.setVisibility(uiStateAnyErrorViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCityName, uiStateCurrentWeatherName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUpdatedAt, uiStateCurrentWeatherUpdatedDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): uiState
        flag 1 (0x2L): null
        flag 2 (0x3L): uiState.anyError ? View.VISIBLE : View.GONE
        flag 3 (0x4L): uiState.anyError ? View.VISIBLE : View.GONE
        flag 4 (0x5L): uiState.loading ? View.VISIBLE : View.GONE
        flag 5 (0x6L): uiState.loading ? View.VISIBLE : View.GONE
        flag 6 (0x7L): uiState.anyError ? View.GONE : View.VISIBLE
        flag 7 (0x8L): uiState.anyError ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}