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

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import net.soulwolf.widget.speedyselector.internal.BackgroundSelector;
import net.soulwolf.widget.speedyselector.internal.GeneralSelector;

/**
 * author: Soulwolf Created on 2015/8/8 17:36.
 * email : Ching.Soulwolf@gmail.com
 */
public final class SpeedySelectorDelegate<GENERAL extends TextView & GeneralSelector,BACKGROUND extends View & BackgroundSelector> {

    public static <GENERAL extends TextView & GeneralSelector> SpeedySelectorDelegate obtainGeneral(
            GENERAL selector) {
        return obtainGeneral(selector, null);
    }

    public static <GENERAL extends TextView & GeneralSelector> SpeedySelectorDelegate obtainGeneral(
            GENERAL selector, AttributeSet attrs) {
        return obtainGeneral(selector, attrs, 0);
    }

    public static <GENERAL extends TextView & GeneralSelector> SpeedySelectorDelegate obtainGeneral(
            GENERAL selector, AttributeSet attrs, int defStyleAttr) {
        return obtainGeneral(selector, attrs, defStyleAttr, 0);
    }

    @SuppressWarnings("unchecked")
    public static <GENERAL extends TextView & GeneralSelector> SpeedySelectorDelegate obtainGeneral(
            GENERAL selector, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        return new SpeedySelectorDelegate(new GeneralDelegate<GENERAL>(selector,attrs,defStyleAttr,defStyleRes));
    }

    public static <BACKGROUND extends View & BackgroundSelector> SpeedySelectorDelegate obtain(
            BACKGROUND selector) {
        return obtain(selector, null);
    }

    public static <BACKGROUND extends View & BackgroundSelector> SpeedySelectorDelegate obtain(
            BACKGROUND selector, AttributeSet attrs) {
        return obtain(selector, attrs, 0);
    }

    public static <BACKGROUND extends View & BackgroundSelector> SpeedySelectorDelegate obtain(
            BACKGROUND selector, AttributeSet attrs, int defStyleAttr) {
        return obtain(selector, attrs, defStyleAttr, 0);
    }

    @SuppressWarnings("unchecked")
    public static <BACKGROUND extends View & BackgroundSelector> SpeedySelectorDelegate obtain(
            BACKGROUND selector, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        return new SpeedySelectorDelegate(new BackgroundDelegate<BACKGROUND>(selector,attrs,defStyleAttr,defStyleRes));
    }

    private GeneralDelegate mGeneralDelegate;

    private BackgroundDelegate mBackgroundDelegate;

    private SelectorMode mSelectorMode = SelectorMode.BACKGROUND;

    private SpeedySelectorDelegate(GeneralDelegate<GENERAL> delegate){
        this.mSelectorMode = SelectorMode.GENERAL;
        this.mGeneralDelegate = delegate;
    }

    private SpeedySelectorDelegate(BackgroundDelegate<BACKGROUND> delegate){
        this.mSelectorMode = SelectorMode.BACKGROUND;
        this.mBackgroundDelegate = delegate;
    }

    public void addStateBackground(StateType state, Drawable drawable) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackground(state,drawable);
        }else {
            mGeneralDelegate.addStateBackground(state,drawable);
        }
    }

    public void addStateBackgroundResource(StateType state, @DrawableRes int draRes) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackgroundResource(state, draRes);
        }else {
            mGeneralDelegate.addStateBackgroundResource(state, draRes);
        }
    }

    public void addStateBackground(StateType state, float radius, @ColorInt int color) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackground(state,radius, color);
        }else {
            mGeneralDelegate.addStateBackground(state,radius, color);
        }
    }

    public void addStateBackground(StateType state, float radius, boolean justBorder, @ColorInt int color) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackground(state,radius,justBorder, color);
        }else {
            mGeneralDelegate.addStateBackground(state,radius,justBorder, color);
        }
    }

    public void addStateBackground(StateType state, float radius, boolean justBorder, float borderWidth, @ColorInt int color) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackground(state,radius,justBorder,borderWidth, color);
        }else {
            mGeneralDelegate.addStateBackground(state,radius,justBorder,borderWidth, color);
        }
    }

    public void addStateBackgroundResource(StateType state, float radius, @ColorRes int colorRes) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackgroundResource(state, radius, colorRes);
        }else {
            mGeneralDelegate.addStateBackgroundResource(state, radius, colorRes);
        }
    }

    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, @ColorRes int colorRes) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackgroundResource(state, radius,justBorder, colorRes);
        }else {
            mGeneralDelegate.addStateBackgroundResource(state, radius,justBorder, colorRes);
        }
    }

    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, float borderWidth, @ColorRes int colorRes) {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.addStateBackgroundResource(state, radius,justBorder, borderWidth,colorRes);
        }else {
            mGeneralDelegate.addStateBackgroundResource(state, radius,justBorder,borderWidth, colorRes);
        }
    }

    public void setTextColorRessource(@ColorRes int resId) {
        if(mSelectorMode != SelectorMode.GENERAL){
            throw new IllegalStateException("Not set TextColor");
        }
        mGeneralDelegate.setTextColorResource(resId);
    }

    public void addTextStateColor(StateType state, @ColorInt int color) {
        if(mSelectorMode != SelectorMode.GENERAL){
            throw new IllegalStateException("Not set TextColor");
        }
        mGeneralDelegate.addTextStateColor(state,color);
    }

    public void addTextStateColorRessource(StateType state, @ColorRes int colorRes) {
        if(mSelectorMode != SelectorMode.GENERAL){
            throw new IllegalStateException("Not set TextColor");
        }
        mGeneralDelegate.addTextStateColorResource(state, colorRes);
    }

    public void requestSelector() {
        if(mSelectorMode == SelectorMode.BACKGROUND){
            mBackgroundDelegate.requestSelector();
        }else {
            mGeneralDelegate.requestSelector();
        }
    }
}
