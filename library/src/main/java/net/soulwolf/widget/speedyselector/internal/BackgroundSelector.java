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
package net.soulwolf.widget.speedyselector.internal;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;

import net.soulwolf.widget.speedyselector.StateType;

/**
 * author: Soulwolf Created on 2015/8/8 18:10.
 * email : Ching.Soulwolf@gmail.com
 */
public interface BackgroundSelector {

    public void addStateBackground(StateType state,Drawable drawable);

    public void addStateBackgroundResource(StateType state,@DrawableRes int draRes);

    public void addStateBackground(StateType state,float radius,@ColorInt int  color);

    public void addStateBackground(StateType state,float radius,boolean justBorder,@ColorInt int color);

    public void addStateBackground(StateType state,float radius,boolean justBorder,float borderWidth,@ColorInt int color);

    public void addStateBackgroundResource(StateType state,float radius,@ColorRes int colorRes);

    public void addStateBackgroundResource(StateType state,float radius,boolean justBorder,@ColorRes int colorRes);

    public void addStateBackgroundResource(StateType state,float radius,boolean justBorder,float borderWidth,@ColorRes int colorRes);

    public void requestSelector();
}
