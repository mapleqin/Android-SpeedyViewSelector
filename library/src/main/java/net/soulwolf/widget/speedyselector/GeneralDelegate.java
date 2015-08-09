/**
 * <pre>
 * Copyright 2015 Soulwolf Ching
 * Copyright 2015 The Android Open Source Project for Android-SpeedyViewSelector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </pre>
 */
package net.soulwolf.widget.speedyselector;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import net.soulwolf.widget.speedyselector.internal.BackgroundSelector;
import net.soulwolf.widget.speedyselector.internal.GeneralSelector;

/**
 * author: Soulwolf Created on 2015/8/8 23:37.
 * email : Ching.Soulwolf@gmail.com
 */
final class GeneralDelegate<GENERAL extends TextView & GeneralSelector> extends BackgroundDelegate<GENERAL>{

    GENERAL mGeneralSelector;

    int mDefaultColor = 0xFF000000;

    SpeedyColorStateList mSpeedyColorStateList;

    GeneralDelegate(GENERAL selector, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(selector, attrs, defStyleAttr, defStyleRes);
        this.mGeneralSelector = selector;
        applyGeneralAttributeSet(attrs, defStyleAttr, defStyleRes);
    }

    void applyGeneralAttributeSet(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        ColorStateList textColors = mGeneralSelector.getTextColors();
        if(textColors != null){
            mDefaultColor = textColors.getDefaultColor();
        }
        mSpeedyColorStateList = new SpeedyColorStateList(mDefaultColor);
        if(attrs != null){
            TypedArray a = mGeneralSelector.getContext().obtainStyledAttributes(attrs, R.styleable.SpeedySelectorTextColor, defStyleAttr, defStyleRes);
            if(a != null){
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStateDefaultTextColor, StateType.STATE_DEFAULT);
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStateFocusedTextColor, StateType.STATE_FOCUSED);
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStateWindowFocusedTextColor, StateType.STATE_WINDOW_FOCUSED);
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStateEnabledTextColor, StateType.STATE_ENABLED);
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStateCheckedTextColor, StateType.STATE_CHECKED);
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStateSelectedTextColor, StateType.STATE_SELECTED);
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStateActivatedTextColor, StateType.STATE_ACTIVATED);
                parserGeneralAttribute(a, R.styleable.SpeedySelectorTextColor_spStatePressedTextColor, StateType.STATE_PRESSED);
                parserGeneralAttribute(a,R.styleable.SpeedySelectorTextColor_spStateActiveTextColor,StateType.STATE_ACTIVE);
                a.recycle();
            }
        }
        requestSelector();
    }

    void parserGeneralAttribute(TypedArray a, int index,StateType state){
        if(a.hasValue(index)){
            int color = a.getColor(index, -1);
            if(color != -1){
                addTextStateColor(state,color);
            }
        }
    }

    public void setTextColorResource(@ColorRes int resId) {
        mSpeedyColorStateList.addStateColor(getColor(resId));
    }

    public void addTextStateColor(StateType state, @ColorInt int color) {
        mSpeedyColorStateList.addStateColor(state,color);
    }

    public void addTextStateColorResource(StateType state, @ColorRes int colorRes) {
        addTextStateColor(state,getColor(colorRes));
    }

    @Override
    public void requestSelector() {
        super.requestSelector();
        if(mGeneralSelector != null){
            mGeneralSelector.setTextColor(mSpeedyColorStateList.build());
        }
    }
}
