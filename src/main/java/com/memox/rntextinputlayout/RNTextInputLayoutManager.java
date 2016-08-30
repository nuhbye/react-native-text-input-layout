package com.memox.rntextinputlayout;

import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class RNTextInputLayoutManager extends ViewGroupManager<RNTextInputLayout> {

    @VisibleForTesting
    public static final String REACT_CLASS = "RNTextInputLayout";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RNTextInputLayout createViewInstance(ThemedReactContext context) {
        return new RNTextInputLayout(context);
    }
}
