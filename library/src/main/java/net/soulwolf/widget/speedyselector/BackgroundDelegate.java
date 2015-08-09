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

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.view.View;

import net.soulwolf.widget.speedyselector.internal.BackgroundSelector;

/**
 * author: Soulwolf Created on 2015/8/8 23:37.
 * email : Ching.Soulwolf@gmail.com
 */
class BackgroundDelegate<BACKGROUND extends View & BackgroundSelector>{

    BACKGROUND mBackgroundSelector;

    SpeedyStateListDrawable mSpeedyStateListDrawable;

    private float mRadius;

    private float mBorderWidth = 3.0f;

    private boolean justBorder;

    BackgroundDelegate(BACKGROUND selector, AttributeSet attrs, int defStyleAttr, int defStyleRes){
        if(selector == null){
            throw new NullPointerException("selector == null");
        }
        this.mBackgroundSelector = selector;
        applyBackgroundAttributeSet(attrs, defStyleAttr, defStyleRes);
    }

    void applyBackgroundAttributeSet(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.mSpeedyStateListDrawable = new SpeedyStateListDrawable();
        if(attrs != null){
            TypedArray a = mBackgroundSelector.getContext().obtainStyledAttributes(attrs, R.styleable.SpeedySelectorBackground, defStyleAttr, defStyleRes);
            if(a != null){
                this.mRadius = a.getDimension(R.styleable.SpeedySelectorBackground_spRadius,mRadius);
                this.justBorder = a.getBoolean(R.styleable.SpeedySelectorBackground_spJustBorder,justBorder);
                this.mBorderWidth = a.getDimension(R.styleable.SpeedySelectorBackground_spBorderWidth,mBorderWidth);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateDefaultBackground, StateType.STATE_DEFAULT);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateFocusedBackground, StateType.STATE_FOCUSED);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateWindowFocusedBackground, StateType.STATE_WINDOW_FOCUSED);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateEnabledBackground, StateType.STATE_ENABLED);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateCheckedBackground, StateType.STATE_CHECKED);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateSelectedBackground, StateType.STATE_SELECTED);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateActivatedBackground, StateType.STATE_ACTIVATED);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStatePressedBackground, StateType.STATE_PRESSED);
                parserBackgroundAttribute(a, R.styleable.SpeedySelectorBackground_spStateActiveBackground, StateType.STATE_ACTIVE);
                a.recycle();
            }
        }
        Drawable background = mBackgroundSelector.getBackground();
        if(background instanceof ColorDrawable){
            addStateBackground(StateType.STATE_DEFAULT,mRadius,justBorder,mBorderWidth,((ColorDrawable)background).getColor());
        }else {
            mSpeedyStateListDrawable.addStateDrawable(background);
        }
        requestSelector();
    }

    void parserBackgroundAttribute(TypedArray a, int index, StateType state) {
        if(a.hasValue(index)){
            int color = a.getColor(index, -1);
            if(color != -1){
                addStateBackground(state,mRadius,justBorder,mBorderWidth,color);
            }else {
                int resourceId = a.getResourceId(index, -1);
                if(resourceId != -1){
                    addStateBackground(state,getResources().getDrawable(resourceId));
                }
            }
        }
    }

    public void addStateBackground(StateType state, Drawable drawable) {
        this.mSpeedyStateListDrawable.addStateDrawable(state, drawable);
    }

    public void addStateBackgroundResource(StateType state, @DrawableRes int draRes) {
        addStateBackground(state, getResources().getDrawable(draRes));
    }

    public void addStateBackground(StateType state, float radius, @ColorInt int color) {
        addStateBackground(state,radius,justBorder,color);
    }

    public void addStateBackground(StateType state, float radius, boolean justBorder, @ColorInt int colors) {
        addStateBackground(state,radius,justBorder,mBorderWidth,colors);
    }

    public void addStateBackground(StateType state, float radius, boolean justBorder, float borderWidth, @ColorInt int colors) {
        addStateBackground(state,new GradientDrawableWrapper(radius,justBorder,borderWidth,colors));
    }

    public void addStateBackgroundResource(StateType state, float radius, @ColorRes int colorRes) {
        addStateBackground(state,radius,getColor(colorRes));
    }

    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, @ColorRes int colorRes) {
        addStateBackground(state,radius,justBorder,getColor(colorRes));
    }

    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, float borderWidth, @ColorRes int colorRes) {
        addStateBackground(state,radius,justBorder,borderWidth,getColor(colorRes));
    }

    public void requestSelector() {
        if(mSpeedyStateListDrawable != null){
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
                mBackgroundSelector.setBackground(mSpeedyStateListDrawable.build());
            }else {
                mBackgroundSelector.setBackgroundDrawable(mSpeedyStateListDrawable.build());
            }
        }
    }

    protected Resources getResources(){
        return mBackgroundSelector.getResources();
    }

    protected int getColor(@ColorRes int res){
        return getResources().getColor(res);
    }
}
